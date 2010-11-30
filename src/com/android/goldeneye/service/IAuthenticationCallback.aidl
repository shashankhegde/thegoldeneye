package com.android.goldeneye.service;

/*
 * Service sends the result and does not wait for the client to return
 */
oneway interface IAuthenticationCallback {

    /*
     * aUserName: Name of the user recognized. If not recognized, aUserName = "" 
     */
    void onAuthenticationComplete(String aUserName);
}