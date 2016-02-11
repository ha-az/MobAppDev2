package com.haaz.mars.mobappdev2.infrastructure;

import android.app.Application;

/**
 * Created by ha on 10/02/2016.
 */
public class YoraApplication extends Application {
    private Auth auth;

    @Override
    public void onCreate() {

        auth =  new Auth(this);
    }

    public Auth getAuth() {
        super.onCreate();
        return auth;
    }
}
