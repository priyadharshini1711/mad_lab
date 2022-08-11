package test.add;
import android.os.Bundle;
import android.app.Activity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity implements OnClickListener {
    Button b1, b2, b3, b4, b5;
    EditText et1, et2;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        tv = (TextView) findViewById(R.id.textView2);


        //SetClickListener 
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b2.setOnClickListener(this);
        b2.setOnClickListener(this);
        b2.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub 
        String num1 = et1.getText().toString();
        String num2 = et2.getText().toString();
        String op = "";
        if (TextUtils.isEmpty(num1) || TextUtils.isEmpty(num2)) {
            tv.setError("Input values cannot be empty");
            return;
        }
        double n1 = Double.parseDouble(num1);
        double n2 = Double.parseDouble(num2);
        double result = 0;
        switch (v.getId()) {
            case R.id.button1:
                result = n1 + n2;
                op = "ADD";
                Toast.makeText(getApplicationContext(), "Performs Addition",
                    Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                result = n1 - n2;
                op = "SUB";
                Toast.makeText(getApplicationContext(), "Performs Subtration",
                    Toast.LENGTH_LONG).show();
                break;
            case R.id.button3:
                result = n1 * n2;
                op = "MUL";
                Toast.makeText(getApplicationContext(), "Performs Multiplication", Toast.LENGTH_LONG).show();
                break;
            case R.id.button4:
                result = n1 / n2;
                op = "DIV";
                Toast.makeText(getApplicationContext(), "Performs Division",
                    Toast.LENGTH_LONG).show();
                break;
            case R.id.button5:
                break;
            default:
                break;
        }
        tv.setText("" + op + " " + result);
    }
}