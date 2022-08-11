package com.example.sms;
import com.example.sms.R;
import android.os.Bundle;
import android.app.Activity;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
publicclass MainActivity extends Activity {
    Button buttonsend;
    EditText et1, et2;
    @Override
    protectedvoid onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonsend = (Button) findViewById(R.id.buttonSend);
        et1 = (EditText) findViewById(R.id.editTextPhoneNo);
        et2 = (EditText) findViewById(R.id.editTextSMS);
        buttonsend.setOnClickListener(new View.OnClickListener() {
                @Override
                publicvoid onClick(View arg0) {
                    // TODO Auto-generated method stub 
                    String phno = et1.getText().toString();
                    String sms = et2.getText().toString();
                    try {
                        SmsManager smsManager = SmsManager.getDefault();
                        smsManager.sendTextMessage(phno, null, sms, null, null);
                        Toast.makeText(getApplicationContext(), "SMS  
                            Sent!",Toast.LENGTH_LONG).show();
                        }
                        catch (Exception e) {
                            Toast.makeText(getApplicationContext(),
                                "SMS faild, please try again later!",
                                Toast.LENGTH_LONG).show();
                            e.printStackTrace();
                        }
                    }
                });
        }
        @Override
        publicboolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.  getMenuInflater().inflate(R.menu.main, menu); 
            returntrue;
        }
    }