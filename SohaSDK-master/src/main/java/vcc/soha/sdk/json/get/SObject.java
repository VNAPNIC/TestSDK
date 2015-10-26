package vcc.soha.sdk.json.get;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;

import vcc.soha.sdk.commons.SPrimAndWrap;

/**
 * Created by Admin on 10/23/2015.
 */
public class SObject<T> extends AsyncTask<Class<T>,Void,T> {

    Gson mGson = null;
    String TAG = null;
    String mJson = null;

    public SObject(Gson gson, String TAG,String mJson) {
        this.mGson = gson;
        this.TAG = TAG;
        this.mJson = mJson;
    }

    @Override
    protected T doInBackground(Class<T>... params) {
        Object object = mGson.fromJson(mJson, params[0]);
        Log.d("Object Check", object.toString());
        return SPrimAndWrap.sWrap(params[0]).cast(object);
    }
}
