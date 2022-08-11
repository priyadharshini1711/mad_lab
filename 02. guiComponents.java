package radio.button;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.view.Menu;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity implements View.OnClickListener { //private RadioButton rb1,rb2,rb3; 
    private TextView tv1;
    private RelativeLayout rl;
    private RadioButton rb1, rb2;
    int i = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1 = (TextView) findViewById(R.id.textView1);
        rl = (RelativeLayout) findViewById(R.id.gsat);
        rb1 = (RadioButton) findViewById(R.id.radioButton1);
        rb1 = (RadioButton) findViewById(R.id.radioButton2);
    }
    public void click(View v) {
        boolean on = ((RadioButton) v).isChecked();
        switch (v.getId()) {
            case R.id.radioButton1:
                if (on) {
                    tv1.setBackgroundColor(0xff00ff00);
                    tv1.setTextColor(0xffff00ff);
                    float x = 10 f;
                    tv1.setTextSize(x);
                }
                break;
            case R.id.radioButton2:
                if (on) {

                    rl.setBackgroundResource(R.drawable.ic_launcher);
                    rb1.setChecked(false);
                }
                break;
            case R.id.radioButton3:
                tv1.setClickable(true);
                Typeface face = Typeface.DEFAULT_BOLD;
                int typ = TypedValue.COMPLEX_UNIT_IN;
                tv1.setTextScaleX(typ);
                tv1.setTypeface(face);
                rb2.setChecked(false);
                break;
        }
    }
}