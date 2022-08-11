package com.example.alarm;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity {
    TextView t1;
    EditText t2;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (TextView) findViewById(R.id.textView1);
        t2 = (EditText) findViewById(R.id.editText1);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View arg0) {
                    int i = Integer.parseInt(t2.getText().toString());
                    Intent intent = new Intent(MainActivity.this,
                        MyBroadcastReceiver.class);
                    PendingIntent
                    p1 = PendingIntent.getBroadcast(getApplicationContext(), 100, intent, 0);
                    AlarmManager
                    a = (AlarmManager) getSystemService(ALARM_SERVICE);
                    a.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (i * 1000), p1);
                    Toast.makeText(getApplicationContext(), "Alarm set in  
                        "+i+"
                        seconds ",Toast.LENGTH_LONG).show(); 
                    }
                });
        }
    }