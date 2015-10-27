package vcc.soha.sdk.controller;

import android.support.annotation.Nullable;

import vcc.soha.sdk.SubBaseSson;
import vcc.soha.sdk.json.Sson;

/**
 * Created by Admin on 10/27/2015.
 */
public class RequestThreadPool implements Runnable {

    Sson sson = null;
    private Object[] objects = null;
    private Sson.OnRequestCallBack onRequestCallBack = null;
    private Class<?> aClass;
    private Object TAG = null;
    private SubBaseSson.Action action;
    private String[] strings;
    private int a, b, c, d;

    {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
    }


    public RequestThreadPool(Sson sson) {
        this.sson = sson;
    }

    public void setPram(@Nullable SubBaseSson.Action action, @Nullable String... strings) {
        this.action = action;
        this.strings = strings;
        a = 1;
    }

    public void setReferences(Object... params) {
//        sson.setReferences(params[0],params[1]);
        this.objects = params;
        b = 1;
    }

    public <T> void setOnRequestCallBack(@Nullable Sson.OnRequestCallBack onRequestCallBack, Class<T> classOfT) {
//        sson.setOnRequestCallBack(onRequestCallBack, classOfT);
        this.onRequestCallBack = onRequestCallBack;
        this.aClass = classOfT;
        c = 1;
    }

    public void getReferences(Object TAG) {
//        sson.getReferences(TAG);
        this.TAG = TAG;
        d = 1;
    }

    @Override
    public void run() {
        if (a == 1) {
            sson.setPram(action, strings);
        }
        sson.requestAction();
        if (b == 1) {
            sson.setReferences(objects[0], objects[1]);
        }
        if (c == 1) {
            sson.setOnRequestCallBack(onRequestCallBack, aClass);
        }
        if (d == 1) {
            sson.getReferences(TAG);
        }
    }
}
