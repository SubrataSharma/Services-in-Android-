package com.example.serviceinandroid.service;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.serviceinandroid.R;
import com.example.serviceinandroid.databinding.ActivityServiceBinding;
import com.google.android.material.snackbar.Snackbar;

public class ServiceActivity extends AppCompatActivity {
    private static final String TAG = "Service";
    private ActivityServiceBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityServiceBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//        Snackbar.make(binding.getRoot(),"service activity thread id:" + Thread.currentThread().getId(), Snackbar.LENGTH_SHORT)
//                .show();
        Log.d(TAG, "service activity thread id:" + Thread.currentThread().getId());

        binding.startService.setOnClickListener(v -> {
            startService(new Intent(this, MyService.class));
        });
        binding.stopService.setOnClickListener(v -> {
            stopService(new Intent(this, MyService.class));
        });
    }
}