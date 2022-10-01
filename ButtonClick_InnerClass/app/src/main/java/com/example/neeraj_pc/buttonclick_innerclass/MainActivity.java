package com.example.neeraj_pc.buttonclick_innerclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    String TAG = "Test";
    Button btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        btn.setOnClickListener(new clickHandler());

    }

    class clickHandler implements OnClickListener {
        @Override
        public void onClick(View v) {
            Log.d(TAG, "onClick: Called");
        }
    }

}
