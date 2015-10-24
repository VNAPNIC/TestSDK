package vcc.soha.sdk.module.commons;

import vcc.soha.sdk.SubBaseSson;

/**
 * Created by Admin on 10/21/2015.
 */
public interface ISetup {
    String LINK = "http://mobiadzone.com/campaign/hainam1421";

    String getURL();

    int getCountKey();

    void addNewPram(SubBaseSson.Company company, String... strings);

    void addConnect(String TAG, Object object);

    String getJsonString();

}
