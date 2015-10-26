package vcc.soha.sdk.json;

import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

import vcc.soha.sdk.SubBaseSson;
import vcc.soha.sdk.commons.ISetup;
import vcc.soha.sdk.commons.SConnect;
import vcc.soha.sdk.connect.ConnectAsyncTask;
import vcc.soha.sdk.connect.GetJsonAsynTask;
import vcc.soha.sdk.entities.SObjects;
import vcc.soha.sdk.json.get.SArrayList;
import vcc.soha.sdk.json.get.SObject;
import vcc.soha.sdk.keys.IKey;


/**
 * Created by Admin on 10/21/2015.
 */
public final class Sson extends SubBaseSson implements ISetup, IKey {


    static {
        instance = null;
    }

    {
        mTAG = Sson.class.getName();
        requestMethod = SConnect.GET;
        checkPrams = 0;
    }

    public static void initInstance() throws Exception {
        if (instance == null) {
            instance = new Sson();
        }
    }

    public static Sson getInstance() throws Exception {
        if (instance == null) {
            synchronized (Sson.class) {
                initInstance();
            }
        }
        return instance;
    }


    public Object getObject() {
        return object;
    }

    private void setObject(Object object) {
        this.object = object;
    }

    public HttpURLConnection getSConnection() {
        return SConnection;
    }

    private void setSConnection(HttpURLConnection SConnection) {
        this.SConnection = SConnection;
    }

    public String getTAG() {
        return mTAG;
    }

    public void setTAG(String mTAG) {
        this.mTAG = mTAG;
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
     * @param company Chuyền vào Action
     * @param strings Chuyền vào param
     */
    @Override
    public void setPram(@Nullable Company company, @Nullable String... strings) {
        setCompany(company);
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
                Log.d(getTAG(), "param length greater than key");
            }
        } catch (NullPointerException npe) {
            npe.printStackTrace();
        }

        if (checkPrams != -1) {
            sUrl = sUrl.replaceAll(" ", "%20");
            Log.d(getTAG(), sUrl);
        }
        return sUrl;
    }

    /**
     * Khởi tạo HttpURLConnection
     *
     * @param TAG    setTAG
     * @param object setObject
     */
    @Override
    public void requestConnect(@Nullable String TAG, @Nullable Object object) {
        if (TAG != null) {
            setTAG(TAG);
        }
        if (object != null) {
            setObject(object);
        }
        if (checkPrams != -1) {
            try {
                ConnectAsyncTask cat = new ConnectAsyncTask();
                cat.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[]{getURL(), getRequestMethod(), getTAG()});
                setSConnection(cat.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        } else if (checkPrams == -1) {
            Log.d(getTAG(), "param length greater than key");
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
                asynTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, getSConnection());
                return asynTask.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return null;
    }


    /**
     * @param classOfT Class
     * @return Object
     */
    private <T> T getObject(Class<T> classOfT) {
        mGson = new Gson();
        if (checkPrams != -1) {
            SObject<T> sObject = new SObject(mGson, getTAG(), getJsonString());
            try {
                return sObject.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, classOfT).get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /**
     * @param classOfT Class
     * @return List
     */
    private <T> List<T> getList(Class<T> classOfT) {
        mGson = new Gson();
        if (checkPrams != -1) {
            try {
                SArrayList<T> list = new SArrayList(getSConnection(), getTAG(), mGson);
                return list.executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, classOfT).get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

//    /**
//     *
//     * @param OnCallObject gọi method
//     * @param classOfT class
//     */
//    public <T> void setOnCallObject(@Nullable OnCallObject OnCallObject,Class<T> classOfT){
//        T t = getObject(classOfT);
//        OnCallObject.OnCallObject(t);
//    }
//
//    /**
//     * interface Call Object
//     */
//    public interface OnCallObject{
//        <T> void OnCallObject(T object);
//    }

    /**
     * @param classOfT class
     */
    public <T> void setOnRequestCallBack(@Nullable OnRequestCallBack onRequestCallBack, Class<T> classOfT){
        SObjects<T> o = new SObjects();
        List<T> list = getList(classOfT);
        o.settList(list);
        onRequestCallBack.OnRequestCallBack(o);
    }

    /**
     * interface CallList
     */
    public interface OnRequestCallBack {
        <T> void OnRequestCallBack(SObjects<T> list);
    }

    private Gson mGson;
    private static Sson instance;
    private String sUrl = null;
    private String[] params = null;
    private String[] keys = null;
    private String requestMethod;
    private String mTAG = new String();
    private HttpURLConnection SConnection = null;
    private Object object;
    public int checkPrams;
}