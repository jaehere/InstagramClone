package com.jaehee.instagramclone;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("5DOXtEQx0BIpP1sufMBmGrthDim8xry9bp996jAB")
                // if defined
                .clientKey("nH7pwj14IszahIk1sy2h5w4PUiQvodNCxvgynRa2")
                .server("https://parseapi.back4app.com/")
                .build()
        );

    }
}
