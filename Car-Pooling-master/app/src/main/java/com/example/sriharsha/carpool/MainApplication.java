/**
 * Copyright (c) 2016 Pooja, SriHarsha
 * This code is available under the "MIT License".
 * Please see the file LICENSE in this distribution
 * for license terms.
 */

package com.example.sriharsha.carpool;

import android.app.Application;

import com.kinvey.android.Client;

/**
 * Created by ravi on 7/30/2017.
 */

/**
 * This class establishes the conneciton with the Kinvey mBass
 */
public class MainApplication extends Application {
    private Client client;

    @Override
    public void onCreate() {
        super.onCreate();
        defineClient();
    }

    private void defineClient() {
        client = new Client.Builder("kid_Hk-ehpryf",//APP_ID
                "0f9d06b202f0445288696b956b243d7a",//APP_SECRET
                getApplicationContext()).build();
    }

    public Client getClient() {
        return client;
    }
}
