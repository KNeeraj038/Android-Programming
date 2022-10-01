package com.example.neeraj_pc.button_click;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    String TAG = "Test";
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button3);
        btn.setOnClickListener(this);
    }

    public void doSomething(View view) {
        if(view.getId() == R.id.button) {
            Log.d(TAG, "doSomething: First Button is Clicked...");
            Toast.makeText(this, "First Button is Clicked", Toast.LENGTH_SHORT).show();
        }else if(view.getId() == R.id.button2){
            Log.d(TAG, "doSomething: Second Button is Clicked...");
            Toast.makeText(this, "Second Button is Clicked", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(this, "overridded onClick Method of OnClickListner class after receiving the Event click.", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onClick: Called");
    }
}
