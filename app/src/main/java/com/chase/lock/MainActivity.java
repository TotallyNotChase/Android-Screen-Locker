package com.chase.lock;

import android.app.admin.DevicePolicyManager;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    DevicePolicyManager manager;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        manager = (DevicePolicyManager) getSystemService(Context.DEVICE_POLICY_SERVICE);
        manager.lockNow();
    }
}
