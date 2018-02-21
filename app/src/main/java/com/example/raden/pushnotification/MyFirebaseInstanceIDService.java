package com.example.raden.pushnotification;

import android.annotation.SuppressLint;
import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Raden on 21/02/2018.
 */

public class MyFirebaseInstanceIDService  extends FirebaseInstanceIdService{

    private static final  String TAG = "MyFirebaseInstanceIDService";

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String refreshToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "new Token" + refreshToken);

    }
}
