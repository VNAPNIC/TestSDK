package vcc.soha.sdk.module.json;

import android.os.AsyncTask;
import android.support.annotation.Nullable;

import com.google.gson.Gson;

import java.util.List;
import java.util.concurrent.ExecutionException;

import vcc.soha.sdk.module.BaseSson;
import vcc.soha.sdk.module.json.get.SArrayList;
import vcc.soha.sdk.module.json.get.SObject;


/**
 * Created by Admin on 10/21/2015.
 */
public final class Sson extends BaseSson{

    Gson mGson = new Gson();
    public static final String TAG = Sson.class.getName();

    /**
     * @param classOfT Class
     * @return Object
     */
    private <T> T getObject(Class<T> classOfT) {
        SObject<T> sObject = new SObject(mGson, TAG, getJsonString());
        try {
            return sObject.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, classOfT).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * @param classOfT Class
     * @return List
     */
    private <T> List<T> getList(Class<T> classOfT) {
        try {
            SArrayList<T> list = new SArrayList(getSConnection(), TAG, mGson);
            return list.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, classOfT).get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     *
     * @param OnCallObject gọi method
     * @param classOfT class
     */
    public <T> void setOnCallObject(@Nullable OnCallObject OnCallObject,Class<T> classOfT){

        OnCallObject.OnCallObject(getObject(classOfT));
    }

    public interface OnCallObject{
        <T> void OnCallObject(T object);
    }

    /**
     *
     * @param OnCallList gọi method
     * @param classOfT class
     */
    public <T> void setOnCallList(@Nullable OnCallList OnCallList,Class<T> classOfT){

        OnCallList.OnCallList(getList(classOfT));
    }

    public interface OnCallList{
        <T> void OnCallList(List<T> list);
    }

}