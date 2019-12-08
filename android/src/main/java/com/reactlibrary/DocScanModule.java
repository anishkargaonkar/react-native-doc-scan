package com.reactlibrary;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import scanner.scan.ScanActivity;

public class DocScanModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public DocScanModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "DocScan";
    }

    @ReactMethod
    public void sampleMethod(String stringArgument, int numberArgument, Callback callback) {
        // TODO: Implement some actually useful functionality

        Activity currentActivity = getCurrentActivity();
        Log.d("Called from react", "start scan ReactNativeAndroidScanner ");

//        new com.scanner.ScanActivity();
        Intent intent = new Intent(getReactApplicationContext(), ScanActivity.class);
        currentActivity.startActivity(intent);

        callback.invoke("Received numberArgument: " + numberArgument + " stringArgument: " + stringArgument);

    }

    @ReactMethod
    public void initiateObjectDetection(){
        ReactApplicationContext context = getReactApplicationContext();
        Intent intent = new Intent(context, ScanActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
