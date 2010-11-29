/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /home/shashank/workspace/android/GoldenEye/src/com/android/goldeneye/service/IAuthenticationService.aidl
 */
package com.android.goldeneye.service;
public interface IAuthenticationService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements com.android.goldeneye.service.IAuthenticationService
{
private static final java.lang.String DESCRIPTOR = "com.android.goldeneye.service.IAuthenticationService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an com.android.goldeneye.service.IAuthenticationService interface,
 * generating a proxy if needed.
 */
public static com.android.goldeneye.service.IAuthenticationService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = (android.os.IInterface)obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof com.android.goldeneye.service.IAuthenticationService))) {
return ((com.android.goldeneye.service.IAuthenticationService)iin);
}
return new com.android.goldeneye.service.IAuthenticationService.Stub.Proxy(obj);
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
case TRANSACTION_startAuthentication:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
int _result = this.startAuthentication(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setOnAuthentication:
{
data.enforceInterface(DESCRIPTOR);
com.android.goldeneye.service.IAuthenticationCallback _arg0;
_arg0 = com.android.goldeneye.service.IAuthenticationCallback.Stub.asInterface(data.readStrongBinder());
int _result = this.setOnAuthentication(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_setAuthenticationResult:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
int _result = this.setAuthenticationResult(_arg0);
reply.writeNoException();
reply.writeInt(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements com.android.goldeneye.service.IAuthenticationService
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
public int startAuthentication(java.lang.String aUserName) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(aUserName);
mRemote.transact(Stub.TRANSACTION_startAuthentication, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int setOnAuthentication(com.android.goldeneye.service.IAuthenticationCallback aOnAuthenticationComplete) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((aOnAuthenticationComplete!=null))?(aOnAuthenticationComplete.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_setOnAuthentication, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
public int setAuthenticationResult(boolean aAuthenticationResult) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((aAuthenticationResult)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_setAuthenticationResult, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_startAuthentication = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_setOnAuthentication = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_setAuthenticationResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
}
public int startAuthentication(java.lang.String aUserName) throws android.os.RemoteException;
public int setOnAuthentication(com.android.goldeneye.service.IAuthenticationCallback aOnAuthenticationComplete) throws android.os.RemoteException;
public int setAuthenticationResult(boolean aAuthenticationResult) throws android.os.RemoteException;
}
