package com.haaz.mars.mobappdev2.activities;

import android.content.Intent;
import android.os.Bundle;

/**
 * Created by ha on 10/02/2016.
 */
public abstract  class BaseAthenticatedActivity extends BaseActivity{

    @Override
    protected final void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(!application.getAuth().getUser().isLoggedIn()) {
            startActivity(new Intent(this, LoginActivity.class));
            finish();
            return;
        }

        onYoraCreate(savedInstanceState);
    }

    protected abstract void onYoraCreate(Bundle savedState);
}
