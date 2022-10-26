package com.example.pilyzdes;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BrodcastingClass extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Pilin Bitmek Üzere", Toast.LENGTH_LONG).show();
    }
}
