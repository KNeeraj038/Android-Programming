// File Path: E:\Learning\Android-Programming\AIDL_services\app\build\generated\aidl_source_output_dir\debug\out\com\example\AIDL_Service
/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.example.AIDL_Service;
public interface IMultiplication extends android.os.IInterface
{
  /** Default implementation for IMultiplication. */
  public static class Default implements com.example.AIDL_Service.IMultiplication
  {
    @Override public int multiplyTwoNumbers(int firstNumber, int secondNumber) throws android.os.RemoteException
    {
      return 0;
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.example.AIDL_Service.IMultiplication
  {
    private static final java.lang.String DESCRIPTOR = "com.example.AIDL_Service.IMultiplication";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.example.AIDL_Service.IMultiplication interface,
     * generating a proxy if needed.
     */
    public static com.example.AIDL_Service.IMultiplication asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.example.AIDL_Service.IMultiplication))) {
        return ((com.example.AIDL_Service.IMultiplication)iin);
      }
      return new com.example.AIDL_Service.IMultiplication.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_multiplyTwoNumbers:
        {
          data.enforceInterface(descriptor);
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _result = this.multiplyTwoNumbers(_arg0, _arg1);
          reply.writeNoException();
          reply.writeInt(_result);
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.example.AIDL_Service.IMultiplication
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public int multiplyTwoNumbers(int firstNumber, int secondNumber) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        int _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(firstNumber);
          _data.writeInt(secondNumber);
          boolean _status = mRemote.transact(Stub.TRANSACTION_multiplyTwoNumbers, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            return getDefaultImpl().multiplyTwoNumbers(firstNumber, secondNumber);
          }
          _reply.readException();
          _result = _reply.readInt();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      public static com.example.AIDL_Service.IMultiplication sDefaultImpl;
    }
    static final int TRANSACTION_multiplyTwoNumbers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(com.example.AIDL_Service.IMultiplication impl) {
      // Only one user of this interface can use this function
      // at a time. This is a heuristic to detect if two different
      // users in the same process use this function.
      if (Stub.Proxy.sDefaultImpl != null) {
        throw new IllegalStateException("setDefaultImpl() called twice");
      }
      if (impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.example.AIDL_Service.IMultiplication getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public int multiplyTwoNumbers(int firstNumber, int secondNumber) throws android.os.RemoteException;
}
