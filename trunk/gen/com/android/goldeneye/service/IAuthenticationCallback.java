/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/shashank/workspace/android/GoldenEye/src/com/android/goldeneye/service/IAuthenticationCallback.aidl
 */
package com.android.goldeneye.service;
/*
 * Service sends the result and does not wait for the client to return
 */
public interface IAuthenticationCallback extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.goldeneye.service.IAuthenticationCallback
{
private static final java.lang.String DESCRIPTOR = "com.android.goldeneye.service.IAuthenticationCallback";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.goldeneye.service.IAuthenticationCallback interface,
 * generating a proxy if needed.
 */
public static com.android.goldeneye.service.IAuthenticationCallback asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.goldeneye.service.IAuthenticationCallback))) {
return ((com.android.goldeneye.service.IAuthenticationCallback)iin);
}
return new com.android.goldeneye.service.IAuthenticationCallback.Stub.Proxy(obj);
}
public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_onAuthenticationComplete:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _arg1;
_arg1 = (0!=data.readInt());
this.onAuthenticationComplete(_arg0, _arg1);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.goldeneye.service.IAuthenticationCallback
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
/*
     * aAuthenticationResult = true, if aUserName is authenticated
     */
public void onAuthenticationComplete(java.lang.String aUserName, boolean aAuthenticationResult) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(aUserName);
_data.writeInt(((aAuthenticationResult)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_onAuthenticationComplete, _data, null, android.os.IBinder.FLAG_ONEWAY);
}
finally {
_data.recycle();
}
}
}
static final int TRANSACTION_onAuthenticationComplete = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
}
/*
     * aAuthenticationResult = true, if aUserName is authenticated
     */
public void onAuthenticationComplete(java.lang.String aUserName, boolean aAuthenticationResult) throws android.os.RemoteException;
}
