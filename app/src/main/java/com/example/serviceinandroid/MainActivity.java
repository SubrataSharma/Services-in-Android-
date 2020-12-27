package com.example.serviceinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.serviceinandroid.broadcast_receiver.BroadcastReceiverActivity;
import com.example.serviceinandroid.databinding.ActivityMainBinding;
import com.example.serviceinandroid.service.ServiceActivity;

public class MainActivity extends AppCompatActivity {
private ActivityMainBinding mainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());

        mainBinding.servicePractice.setOnClickListener(v -> {
            startActivity(new Intent(this, ServiceActivity.class));
        });
        mainBinding.broadcastReceiver.setOnClickListener(v -> {
            startActivity(new Intent(this, BroadcastReceiverActivity.class));
        });

    }
}