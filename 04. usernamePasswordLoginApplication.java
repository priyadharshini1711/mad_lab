package com.example.vidhya;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
publicclass MainActivity extends Activity {
    EditText t1, t2;
    TextView t3, t4;
    Button b;
    @Override
    protectedvoid onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.editText1);
        t2 = (EditText) findViewById(R.id.editText2);
        t3 = (TextView) findViewById(R.id.textView1);
        t4 = (TextView) findViewById(R.id.textView2);
        b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
                @Override
                publicvoid onClick(View arg0) {
                    if (t1.getText().toString().equals("vec") &&
                        t2.getText().toString().equals("surapet")) {
                        Toast.makeText(getApplicationContext(),
                            "Success", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Invalid  
                            Login ",Toast.LENGTH_LONG).show(); 
                        }
                    }
                });
        }
    }