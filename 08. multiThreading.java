packagecom.example.multithreading;
importandroid.app.Activity;
importandroid.os.Bundle;
importandroid.os.Handler;
importandroid.view.Menu;
importandroid.view.View;
importandroid.widget.Button;
importandroid.widget.TextView;
public class MainActivity extends Activity {
    Handler hand = new Handler();
    Button clickme;
    TextView timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        timer = (TextView) findViewById(R.id.timer);
        clickme = (Button) findViewById(R.id.clickme);
        hand.postDelayed(run, 1000);
    }
    Runnable run = new Runnable() {
        @Override
        public void run() {
            updateTime();
        }
    };
    public void updateTime() {
        timer.setText("" + (Integer.parseInt(timer.getText().toString()) - 1));
        if (Integer.parseInt(timer.getText().toString()) == 0) {
            clickme.setVisibility(View.VISIBLE);
        } else {
            hand.postDelayed(run, 1000);
        }
    }
    public void clicker(View view) {
        hand.postDelayed(run, 1000);
        timer.setText("10");
        clickme.setVisibility(View.INVISIBLE);
    }
}