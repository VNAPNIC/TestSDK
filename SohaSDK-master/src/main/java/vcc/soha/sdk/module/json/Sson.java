package vcc.soha.sdk.module.json;

import android.os.AsyncTask;
import android.support.annotation.Nullable;

import com.google.gson.Gson;
import com.google.gson.internal.$Gson$Preconditions;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import vcc.soha.sdk.module.BaseSson;
import vcc.soha.sdk.module.json.get.SArrayList;
import vcc.soha.sdk.module.json.get.SObject;


/**
 * Created by Admin on 10/21/2015.
 */
public final class Sson extends BaseSson{

    /**
     * @param classOfT Class
     * @return Object
     */
    private <T> T getObject(Class<T> classOfT) {
        if(checkPrams !=-1) {
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
        if(checkPrams !=-1) {
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

    /**
     *
     * @param OnCallObject gọi method
     * @param classOfT class
     */
    public <T> void setOnCallObject(@Nullable OnCallObject OnCallObject,Class<T> classOfT){
        T t = getObject(classOfT);
        OnCallObject.OnCallObject(t);
    }

    /**
     * interface Call Object
     */
    public interface OnCallObject{
        <T> void OnCallObject(T object);
    }

    /**
     *
     * @param OnCallList gọi method
     * @param classOfT class
     */
    public <T> void setOnCallList(@Nullable OnCallList OnCallList,Class<T> classOfT){
        List<T> t = getList(classOfT);
        OnCallList.OnCallList(t);
    }

    /**
     * interface CallList
     */
    public interface OnCallList{
        <T> void OnCallList(List<T> list);
    }
    private Gson mGson = new Gson();
}