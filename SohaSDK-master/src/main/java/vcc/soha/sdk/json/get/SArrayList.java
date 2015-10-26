package vcc.soha.sdk.json.get;

import android.os.AsyncTask;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.List;

import vcc.soha.sdk.commons.SPrimAndWrap;

/**
 * Created by Admin on 10/23/2015.
 */
public class SArrayList<T> extends AsyncTask<Class<T>, Void, List<T>> {
    HttpURLConnection httpURLConnection = null;
    Gson mG = null;
    String TAG = null;

    public SArrayList(HttpURLConnection httpURLConnection, String TAG, Gson mG) {
        this.httpURLConnection = httpURLConnection;
        this.mG = mG;
        this.TAG = TAG;
    }

    @Override
    protected List<T> doInBackground(Class<T>... params) {

        List<T> list = new ArrayList<>();
        JsonReader reader = null;
        try {
            reader = new JsonReader(
                    new InputStreamReader(httpURLConnection.getInputStream()));
            JsonParser parser = new JsonParser();
            JsonElement rootElement = parser.parse(reader);
            JsonArray mArrayJson = rootElement.getAsJsonArray();
            for (JsonElement mElement : mArrayJson) {
                Object object = mG.fromJson(mElement, params[0]);
                list.add(SPrimAndWrap.sWrap(params[0]).cast(object));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d(TAG, "Size List -> " + list.size() + "");
        return list;
    }
}
