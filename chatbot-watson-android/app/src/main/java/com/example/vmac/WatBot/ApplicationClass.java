package com.example.vmac.WatBot;

import android.app.Application;

import com.backendless.Backendless;
import com.backendless.BackendlessUser;


public class ApplicationClass extends Application {
    public static final String APPLICATION_ID = "1B515998-9F0E-4204-FF4F-04DEE1EFBF00";
    public static final String API_KEY = "64ACA975-2C48-435A-B3CC-AFF2129D82AA";
    public static final String SERVER_URL = "https://api.backendless.com";
    public static BackendlessUser user;
    public static String Location;


    @Override
    public void onCreate(){
        super.onCreate();
        Backendless.setUrl( SERVER_URL );
        Backendless.initApp( getApplicationContext(),
                APPLICATION_ID,
                API_KEY );
    }

}
