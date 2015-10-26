package vcc.soha.sdk.connect;

import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/**
 * Created by Admin on 10/22/2015.
 */
public class GetJsonAsynTask extends AsyncTask<HttpURLConnection,Void,String> {


    @Override
    protected String doInBackground(HttpURLConnection... params) {
        StringBuffer buffer = null;
        InputStream is = null;
        try {
            is = params[0].getInputStream();
            InputStreamReader reader = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(reader);
            buffer = new StringBuffer();
            String strJson;
            while ((strJson = br.readLine()) != null) {
                buffer.append(strJson + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Log.d("StringJson",buffer.toString());
        return buffer.toString();
    }
}
