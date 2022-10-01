package com.example.neeraj_pc.activity_onsaveonrestoreinstancestate;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    int counter = 0 ;
    String TAG = "Test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        counter ++;
        Log.d(TAG, "onResume: Counter Increased "+ counter);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("Counter", counter);
        Log.d(TAG, "onSaveInstanceState: Counter saved");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        counter = savedInstanceState.getInt("Counter");
        Log.d(TAG, "onRestoreInstanceState: Counter Retrived...");
    }

}
