package com.example.alarm;
import android.os.Vibrator;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.Menu;
import android.widget.Toast;
public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context arg0, Intent arg1) {
        Vibrator v = (Vibrator) arg0.getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(2000);
        Toast.makeText(arg0, "Alarm...", Toast.LENGTH_LONG).show();
    }
}