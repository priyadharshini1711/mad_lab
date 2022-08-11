packagegps.location;
//import android.R; 
importandroid.app.Activity;
importandroid.os.Bundle;
importandroid.view.View;
importandroid.widget.Button;
importandroid.widget.Toast;
public class GPSlocationActivity extends Activity {
    /** Called when the activity is first created. */
    Button btnShowLocation;
    GPStracegps;
    @Override
    public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.main);
            btnShowLocation = (Button) findViewById(R.id.show_Location);
            btnShowLocation.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        // TODO Auto-generated method stub 
                        gps = new GPStrace(GPSlocationActivity.this);
                        if (gps.canGetLocation()) {
                            double latitude = gps.getLatitude();
                            double longitude = gps.getLongtiude();
                            Toast.makeText(getApplicationContext(), "Your Location is \
                                nLat: "+latitude+"\
                                nLong: "+longitude, Toast.LENGTH_LONG).show(); } else  {
                                    gps.showSettingAlert();
                                }
                            }
                        });
                }
            }