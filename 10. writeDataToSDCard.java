package com.example.filecreation;
import java.io.File;
import java.io.FileOutputStream;
import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends Activity {
    EditText t1, t2;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            t1 = (EditText) findViewById(R.id.editText1);
            t2 = (EditText) findViewById(R.id.editText2);
            b = (Button) findViewById(R.id.button1);
            b.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View arg0) {
                        File sdcard = new
                        File(Environment.getExternalStorageDirectory().getAbsolutePath() + "/Kughan");
                        sdcard.mkdirs();
                        File file = new File(sdcard, t1.getText().toString() + ".txt");
                        try {
                            FileOutputStream fos = new FileOutputStream(file);
                            fos.write(t2.getText().toString().getBytes());
                            fos.close();
                            Toast.makeText(getApplicationContext(), "File Created  
                                Successfully: -)
                            ", Toast.LENGTH_SHORT).show(); 
                        } catch (Exception e) {
                            // TODO Auto-generated catch block 
                            Toast.makeText(getApplicationContext(), "Unable to  
                                create File: -(", Toast.LENGTH_SHORT).show(); 
                                }
                            }
                        });
                }
            }