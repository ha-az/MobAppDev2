package com.haaz.mars.mobappdev2.activities;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.haaz.mars.mobappdev2.infrastructure.YoraApplication;

/**
 * Created by ha on 10/02/2016.
 */
public abstract class BaseActivity extends ActionBarActivity{
    protected  YoraApplication application;

    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        application = (YoraApplication) getApplication();
    }
}
