package com.irshad.broadcastreceiverdemoone;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by irshadvali on 16/02/18.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"Broadcast Receiver Triggered",Toast.LENGTH_SHORT).show();
    }
}
