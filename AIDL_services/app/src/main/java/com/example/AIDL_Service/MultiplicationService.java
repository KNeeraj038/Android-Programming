package com.example.AIDL_Service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;

public class MultiplicationService extends Service {
    public MultiplicationService() {
    }

    @Override
    public IBinder onBind(Intent intent) {

        return myBinder;
    }
    IMultiplication.Stub myBinder = new IMultiplication.Stub() {
        @Override
        public int multiplyTwoNumbers(int firstNumber, int secondNumber) throws RemoteException {
            return firstNumber * secondNumber;
        }
    };
}