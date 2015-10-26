package vcc.soha.sdk.entities;

/**
 * Created by hainam1421 on 10/26/2015.
 */
public class SReferences {
    String TAG;
    Object object;
    String strJson;

    public SReferences(String TAG, Object object) {
        this.TAG = TAG;
        this.object = object;
    }

    public SReferences() {
    }

    public String getStrJson() {
        return strJson;
    }

    public void setStrJson(String strJson) {
        this.strJson = strJson;
    }

    public String getTAG() {
        return TAG;
    }

    public void setTAG(String TAG) {
        this.TAG = TAG;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
