package com.example.AIDL_Service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtNum1, txtNum2, txtRes;
    Button btnMul;
    String TAG ="NRJ";
    IMultiplication myMultiplicationInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        txtRes = findViewById(R.id.txtResult);
        btnMul = findViewById(R.id.btnMul);

        btnMul.setOnClickListener(this);

        Intent mulService = new Intent(MainActivity.this, MultiplicationService.class);
        bindService(mulService, myServiceConnection, Context.BIND_AUTO_CREATE);
    }

    ServiceConnection myServiceConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(TAG,"Service connected");
            myMultiplicationInterface = IMultiplication.Stub.asInterface(iBinder);
        }

        @Override
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(TAG,"Service Disconnected !");
        }
    };

    @Override
    public void onClick(View view) {
        Log.d(TAG, "btn CLicked");
        int num1 = Integer.parseInt(txtNum1.getText().toString());
        int num2 = Integer.parseInt(txtNum2.getText().toString());
        int result =-1;
        try{
            result = myMultiplicationInterface.multiplyTwoNumbers(num1, num2);
        }catch(Exception e){
            Log.e(TAG, e.getMessage());
        }
        txtRes.setText(result+"");
    }
}