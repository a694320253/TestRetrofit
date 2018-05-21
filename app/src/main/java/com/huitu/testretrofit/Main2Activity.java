package com.huitu.testretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "TAGTAG";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.i(TAG, "Main2Activityon Create: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Main2Activityonon Start: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Main2Activityonon onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Main2Activityonon onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Main2Activityonon onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Main2Activityonon onDestroy: ");
    }
}
