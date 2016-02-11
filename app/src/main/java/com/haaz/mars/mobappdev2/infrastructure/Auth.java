package com.haaz.mars.mobappdev2.infrastructure;

import android.content.Context;

/**
 * Created by ha on 10/02/2016.
 */
public class Auth {
    private final Context context;
    private User user;

    public Auth(Context context) {
        this.context = context;
        user = new User();
    }

    public User getUser() {
        return user;
    }
}
