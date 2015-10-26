package vcc.soha.sdk.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by Admin on 10/26/2015.
 */
public class CheckNetWork {
    public static boolean check(Context context){
        boolean check = false;
        ConnectivityManager cm;
        cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (cm != null) {
            NetworkInfo[] activeNetwork = cm.getAllNetworkInfo();

            if (activeNetwork != null) {
                for (int i = 0; i < activeNetwork.length; i++) {
                    if (activeNetwork[i].getState() == NetworkInfo.State.CONNECTED) {
                        check =true;
                    }
                }
            }
        }else {
            check = false;
        }
        return check;
    }
}
