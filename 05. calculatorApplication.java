package com.example.calculator;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity {
    EditText t1, t2, t3;
    TextView t4, t5;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1 = (EditText) findViewById(R.id.editText1);
        t2 = (EditText) findViewById(R.id.editText2);
        t3 = (EditText) findViewById(R.id.editText3);
        t4 = (TextView) findViewById(R.id.textView1);
        t5 = (TextView) findViewById(R.id.textView2);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
        b7 = (Button) findViewById(R.id.button7);
        b8 = (Button) findViewById(R.id.button8);
        b9 = (Button) findViewById(R.id.button9);
        b10 = (Button) findViewById(R.id.button10);
        b11 = (Button) findViewById(R.id.button11);
        b12 = (Button) findViewById(R.id.button12);
        b13 = (Button) findViewById(R.id.button13);
        b14 = (Button) findViewById(R.id.button14);
        b15 = (Button) findViewById(R.id.button15);
        b16 = (Button) findViewById(R.id.button16);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText e = (EditText) getCurrentFocus();
                e.setText(e.getText().toString() + "1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText e = (EditText) getCurrentFocus();
                e.setText(e.getText().toString() + "2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText e = (EditText) getCurrentFocus();
                e.setText(e.getText().toString() + "3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText e = (EditText) getCurrentFocus();
                e.setText(e.getText().toString() + "4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText e = (EditText) getCurrentFocus();
                e.setText(e.getText().toString() + "5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText e = (EditText) getCurrentFocus();
                e.setText(e.getText().toString() + "6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText e = (EditText) getCurrentFocus();
                e.setText(e.getText().toString() + "7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText e = (EditText) getCurrentFocus();
                e.setText(e.getText().toString() + "8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText e = (EditText) getCurrentFocus();
                e.setText(e.getText().toString() + "9");
            }
        });
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                t3.setText("+");
            }
        });
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                EditText e = (EditText) getCurrentFocus();
                e.setText(e.getText().toString() + "0");
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                if (t3.getText().toString().equals("+")) {
                    int a = Integer.parseInt(t1.getText().toString());
                    int b = Integer.parseInt(t2.getText().toString());
                    int c = a + b;
                    Toast.makeText(getApplicationContext(), "addition:" + Integer.toString(c), Toast.LENG TH_LONG).show();
                }
                if (t3.getText().toString().equals("-")) {
                    int a = Integer.parseInt(t1.getText().toString());
                    int b = Integer.parseInt(t2.getText().toString());
                    int c = a - b;
                    Toast.makeText(getApplicationContext(), "subtraction:" + Integer.toString(c), Toast.LE NGTH_LONG).show();
                }
                if (t3.getText().toString().equals("*")) {
                    int a = Integer.parseInt(t1.getText().toString());
                    int b = Integer.parseInt(t2.getText().toString());
                    int c = a * b;
                    Toast.makeText(getApplicationContext(), "Multiplication:" + Integer.toString(c), Toast.LENGTH_LONG).show();
                }
                if (t3.getText().toString().equals("/")) {
                    int a = Integer.parseInt(t1.getText().toString());
                    int b = Integer.parseInt(t2.getText().toString());
                    int c = a / b;
                    Toast.makeText(getApplicationContext(), "Division:" + Integer.toString(c), Toast.LEN GTH_LONG).show();
                }
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                t3.setText("-");
            }
        });
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                t3.setText("*");
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                t3.setText("/");
            }
        });
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                t1.setText(" ");
                t2.setText(" ");
                t3.setText(" ");
            }
        });
    }
}