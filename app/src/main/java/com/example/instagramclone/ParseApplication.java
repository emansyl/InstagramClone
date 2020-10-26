package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("SGaSkYY2v9NaFyYQBRfv8OyLhbHIzhpXVMMw3mW8")
                .clientKey("DbKvgl7fcSweE5zpRViDl3RiMvSBBlmw5QvaUebF")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
