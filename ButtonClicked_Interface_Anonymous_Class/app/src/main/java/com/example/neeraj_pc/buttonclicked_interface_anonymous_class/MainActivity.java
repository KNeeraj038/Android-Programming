package com.example.neeraj_pc.buttonclicked_interface_anonymous_class;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Test", "onClick: Called");
            }
        });

    }

}
