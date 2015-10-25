package vcc.soha.sdk.module;

import android.os.AsyncTask;
import android.support.annotation.Nullable;
import android.util.Log;

import com.google.gson.Gson;

import java.net.HttpURLConnection;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

import vcc.soha.sdk.SubBaseSson;
import vcc.soha.sdk.module.commons.SConnect;
import vcc.soha.sdk.module.connect.ConnectAsyncTask;
import vcc.soha.sdk.module.connect.GetJsonAsynTask;
import vcc.soha.sdk.module.keys.IKey;
import vcc.soha.sdk.module.commons.ISetup;

/**
 * Created by Admin on 10/21/2015.
 */
public abstract class BaseSson extends SubBaseSson implements ISetup, IKey {

    private String sUrl = null;
    private int count = 0;
    private String[] params = null;
    private String[] keys = null;
    private String requestMethod = SConnect.GET;
    private String mTAG = BaseSson.class.getName();
    private HttpURLConnection SConnection = null;
    private Object object;
    public int checkPrams = 0;




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
        return count = getKey().length;
    }

    /**
     * Add dữ liệu:
     *
     * @param company Chuyền vào Action
     * @param strings Chuyền vào param
     */
    @Override
    public void addNewPram(@Nullable Company company, @Nullable String... strings) {
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
    public void addConnect(@Nullable String TAG, @Nullable Object object) {
        if (TAG != null) {
            setTAG(TAG);
        }
        if (object != null) {
            setObject(object);
        }
        if(checkPrams !=-1) {
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
        if(checkPrams !=-1) {
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


}
