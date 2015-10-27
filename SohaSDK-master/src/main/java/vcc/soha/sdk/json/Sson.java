package vcc.soha.sdk.json;

import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

import vcc.soha.sdk.SubBaseSson;
import vcc.soha.sdk.commons.ISetup;
import vcc.soha.sdk.commons.SConnect;
import vcc.soha.sdk.commons.SPrimAndWrap;
import vcc.soha.sdk.connect.ConnectAsyncTask;
import vcc.soha.sdk.connect.GetJsonAsynTask;
import vcc.soha.sdk.entities.SObjects;
import vcc.soha.sdk.entities.SReferences;
import vcc.soha.sdk.keys.IKey;


/**
 * Created by Admin on 10/21/2015.
 */
public final class Sson extends SubBaseSson implements ISetup, IKey {


    static {
        instance = null;
    }

    {
        listReferences = new ArrayList<>();
        TAG = Sson.class.getName();
        requestMethod = SConnect.GET;
        checkPrams = 0;
        mError = "";
        mJsonString = null;
    }

    public static void initInstance() {
        if (instance == null) {
            instance = new Sson();
        }
    }

    public static Sson getInstance() {
        if (instance == null) {
            synchronized (Sson.class) {
                initInstance();
            }
        }
        return instance;
    }

    public void setOnCreateRequest(OnRequestCallBack onRequestCallBack){
        onRequestCallBack.OnCreateRequest();
    }

    /**
     * getCount
     *
     * @return Key length
     */
    @Override
    public int getCountKey() {
        return getKey().length;
    }

    /**
     * Add dữ liệu:
     *
     * @param action Chuyền vào Action
     * @param strings Chuyền vào param
     */
    @Override
    public void setPram(@Nullable Action action, @Nullable String... strings) {
        setCompany(action);
        if (strings.length <= getCountKey()) {
            checkPrams = 1;
            params = new String[getCountKey()];
            keys = new String[getCountKey()];

            for (int i = 0; i < getCountKey(); i++) {
                keys[i] = getKey()[i].toString();
                params[i] = "";
            }
            for (int j = 0; j < strings.length; j++) {
                params[j] = strings[j].toString();
            }

        } else {
            checkPrams = -1;
        }
    }

    /**
     * @return String url
     */
    @Override
    public String getURL() {
        try {
            if (checkPrams == 0) {
                sUrl = LINK;
            } else if (checkPrams == 1) {
                sUrl = LINK + "?";
                for (int i = 0; i < getCountKey(); i++) {
                    if (i == 0) {
                        sUrl += keys[i] + "=";
                    } else {
                        sUrl = sUrl + "&" + keys[i] + "=";
                    }
                    if (!params[i].equals("")) {
                        sUrl += params[i].toString();
                    }
                }
            } else if (checkPrams == -1) {
                Log.d(TAG, "param length greater than key");
            }
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }

        if (checkPrams != -1) {
            sUrl = sUrl.replaceAll(" ", "%20");
            Log.d(TAG, sUrl);
        }
        return sUrl;
    }

    /**
     * @param params 1 TAG , 2 Object
     */
    public void setReferences(Object... params) {
        try {
            if (!listReferences.isEmpty()) {
                Log.d(TAG, "TAG duplicate");
                removeTAG(params[0].toString());
            }
            SReferences sReferences = new SReferences();
            sReferences.setTAG(params[0].toString());
            sReferences.setObject(params[1]);
            if(mJsonString !=null){
                sReferences.setStrJson(mJsonString);
            }
            listReferences.add(sReferences);
            Log.d(TAG, "Add TAG Success.!");
        } catch (Exception e) {
            mError = e.getMessage();
            e.printStackTrace();
        }
    }

    /**
     * @param TAG Get TAG
     */
    public SReferences getReferences(String TAG) {
        Log.d(TAG, listReferences.size() + "");
        SReferences sReferences = new SReferences();
        if (!listReferences.isEmpty()) {
            for (int i = 0; i < listReferences.size(); i++) {
                if (listReferences.get(i).getTAG().equals(TAG)) {
                    sReferences = listReferences.get(i);
                    Log.d(TAG, "TAG = " + listReferences.get(i).getTAG());
                    return sReferences;
                }
            }
        } else {
            Log.e(TAG, "TAG is null");
        }
        return null;
    }

    /**
     * Remove TAG
     */
    public void removeTAG(String TAG) {
        if (!listReferences.isEmpty()) {
            for (int i = 0; i < listReferences.size(); i++) {
                if (listReferences.get(i).getTAG().equals(TAG)) {
                    listReferences.remove(i);
                    Log.d(TAG, "remove TAG success.!");
                }
            }
        }
    }

    /**
     * Khởi tạo HttpURLConnection
     */
    @Override
    public void requestAction() {
        if (checkPrams != -1) {
            try {
                ConnectAsyncTask cat = new ConnectAsyncTask();
                cat.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[]{getURL(), getRequestMethod(), TAG});
                SConnection = cat.get();
                mJsonString = getJsonString();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        } else if (checkPrams == -1) {
            Log.d(TAG, "param length greater than key");
            mError = "param length greater than key";
        }

    }

    /**
     * @resunt String Json
     */
    @Override
    public String getJsonString() {
        if (checkPrams != -1) {
            try {
                GetJsonAsynTask asynTask = new GetJsonAsynTask();
                asynTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, SConnection);
                return asynTask.get();
            } catch (InterruptedException e) {
                Log.e(TAG, e.getMessage());
                mError = e.getMessage();
            } catch (ExecutionException e) {
                Log.e(TAG, e.getMessage());
                mError = e.getMessage();
            }
        }
        return null;
    }


    /**
     * @param classOfT class
     * @result SObjects
     */
    public <T> void setOnRequestCallBack(@Nullable OnRequestCallBack onRequestCallBack, Class<T> classOfT) {
        getRequest<T> tdemo = new getRequest();
        try {
            SObjects<T> sObjects = tdemo.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, classOfT).get();

            onRequestCallBack.OnRequestCallBack(sObjects);
            onRequestCallBack.onError(error());
        } catch (InterruptedException e) {
            Log.e(TAG, e.getMessage());
            mError = e.getMessage();
        } catch (ExecutionException e) {
            Log.e(TAG, e.getMessage());
            mError = e.getMessage();
        }
    }


    class getRequest<T> extends AsyncTask<Class<T>, Void, SObjects<T>> {
        @Override
        protected SObjects<T> doInBackground(Class<T>... params) {
            SObjects<T> sObjects = new SObjects();
            mGson = new Gson();
            Log.d(TAG,mJsonString);
            JsonParser parser = new JsonParser();
            JsonElement rootElement = parser.parse(mJsonString);
            sObjects.setJsonString(mJsonString);
            if (rootElement.isJsonArray()) {
                List<T> list = new ArrayList<>();
                JsonArray mArrayJson = rootElement.getAsJsonArray();
                for (JsonElement mElement : mArrayJson) {

                    Object object = mGson.fromJson(mElement, params[0]);
                    list.add(SPrimAndWrap.sWrap(params[0]).cast(object));
                }
                sObjects.settList(list);
            } else if (rootElement.isJsonObject()) {
                Object object = mGson.fromJson(rootElement, params[0]);
                sObjects.setOject(SPrimAndWrap.sWrap(params[0]).cast(object));
            } else if (rootElement.isJsonNull())

            {
                Log.d(TAG, "Json isEmpty.!");
                mError = "Json isEmpty.!";
            }

            return sObjects;
        }
    }

    @Override
    public String error() {
        if(mError.equals("")) {

        }else{
            Log.e(TAG, mError);
        }
        return mError;
    }

    /**
     * interface CallList
     */
    public interface OnRequestCallBack {
        void OnCreateRequest();
        <T> void OnRequestCallBack(SObjects<T> list);
        void onError(String error);
    }

    private String getRequestMethod() {
        return requestMethod;
    }

    /**
     * @param requestMethod Sử dụng các biến nằm trong SConnect để chuyền dữ liệu
     */
    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    // ================================
    private Gson mGson;
    private static Sson instance;
    private String sUrl = null;
    private String[] params = null;
    private String[] keys = null;
    private String requestMethod;
    private String TAG = Sson.class.getName();
    private HttpURLConnection SConnection = null;
    private int checkPrams;
    private List<SReferences> listReferences;
    private String mError;
    private String mJsonString;
}