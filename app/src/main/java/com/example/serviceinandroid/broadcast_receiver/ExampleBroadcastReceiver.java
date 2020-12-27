package com.example.serviceinandroid.broadcast_receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class ExampleBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        if ("com.example.EXAMPLE_ACTION".equals(intent.getAction())) {
            String receivedText = intent.getStringExtra("com.example.EXAMPLE_TEXT");

                Toast.makeText(context, receivedText, Toast.LENGTH_SHORT).show();

        }
    }
}
