package vcc.soha.sdk.commons;

import android.support.annotation.Nullable;

import vcc.soha.sdk.SubBaseSson;

/**
 * Created by Admin on 10/21/2015.
 */
public interface ISetup {
    String LINK = "http://mobiadzone.com/campaign/hainam1421";

    String getURL();
    String getURL(int port);

    int getCountKey();

    void setPram(SubBaseSson.Action action, String... strings);

    void requestAction(int connect,@Nullable int Port);

    String error();

}
