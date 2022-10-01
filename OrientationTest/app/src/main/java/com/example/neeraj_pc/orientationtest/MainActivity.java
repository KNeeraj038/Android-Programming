package com.example.neeraj_pc.orientationtest;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String TAG = "Test";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            Toast.makeText(this, "Portrait Mode", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onConfigurationChanged: Portrait");
        } else if(newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            Toast.makeText(this, "Landscape Mode", Toast.LENGTH_SHORT).show();
            Log.d(TAG, "onConfigurationChanged: Landscape");
        }
    }
}
