package vcc.soha.sdk.connect;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Admin on 10/22/2015.
 */
public class ConnectAsyncTask extends AsyncTask<String[], Void, String> {

    StringBuffer buffer = null;
    InputStream is = null;

    public String getConnect(final String[] params) {
        HttpURLConnection connection = null;

        try {
            URL url = new URL(params[0]);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("charset", "UTF-8");
            connection.setRequestMethod(params[1]);
            connection.setUseCaches(false);
            is = connection.getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(reader);
            buffer = new StringBuffer();
            String strJson;
            while ((strJson = br.readLine()) != null) {
                buffer.append(strJson + "\n");
            }

            Log.d(params[2], "RequestMethod -> " + connection.getRequestMethod());
            Log.d(params[2], "ResponseCode -> " + connection.getResponseCode());
            Log.d(params[2], "ResponseMessage -> " + connection.getResponseMessage());
            Log.d(params[2], "Encoding -> " + connection.getContentEncoding());
            Log.d(params[2], "Timeout -> " + connection.getConnectTimeout());

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return buffer.toString();
    }

    @Override
    protected String doInBackground(String[]... params) {
        return getConnect(params[0]);
    }
}
