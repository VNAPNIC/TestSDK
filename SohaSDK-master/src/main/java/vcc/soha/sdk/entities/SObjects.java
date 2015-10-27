package vcc.soha.sdk.entities;

import java.util.List;

/**
 * Created by Admin on 10/22/2015.
 */
public class SObjects<T> {
    List<T> tList = null;
    T oject = null;
    String string = null;
    String jsonString = null;

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public List<T> gettList() {
        return tList;
    }

    public void settList(List<T> tList) {
        this.tList = tList;
    }

    public T getOject() {
        return oject;
    }

    public void setOject(T oject) {
        this.oject = oject;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }


}
