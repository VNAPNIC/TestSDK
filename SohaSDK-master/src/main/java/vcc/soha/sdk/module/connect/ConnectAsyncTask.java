package vcc.soha.sdk.module.connect;

import android.os.AsyncTask;
import android.util.Log;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Admin on 10/22/2015.
 */
public class ConnectAsyncTask extends AsyncTask<String[], Void, HttpURLConnection> {


    public HttpURLConnection getConnect(String[] params) {
        HttpURLConnection connection = null;
        try {
            URL url = new URL(params[0]);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("charset", "UTF-8");
            connection.setDefaultUseCaches(true);
            connection.setAllowUserInteraction(false);
            connection.setInstanceFollowRedirects(true);
            connection.setRequestMethod(params[1]);

            Log.d(params[2], "RequestMethod -> " + connection.getRequestMethod());
            Log.d(params[2],"ResponseCode -> "+connection.getResponseCode());
            Log.d(params[2],"ResponseMessage -> " + connection.getResponseMessage());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return connection;
    }

    @Override
    protected HttpURLConnection doInBackground(String[]... params) {
        return getConnect(params[0]);
    }
}
