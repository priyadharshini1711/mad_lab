packagegps.location;
importandroid.app.AlertDialog;
importandroid.app.Service;
importandroid.content.Context;
importandroid.content.DialogInterface;
importandroid.content.Intent;
importandroid.location.Location;
importandroid.location.LocationListener;
importandroid.location.LocationManager;
importandroid.os.Bundle;
importandroid.os.IBinder;
importandroid.provider.Settings;
public class GPStrace extends Service implements LocationListener {
    private final Context context;
    booleanisGPSEnabled = false;
    booleancanGetLocation = false;
    booleanisNetworkEnabled = false;
    Location location;
    double latitude;
    doublelongtitude;
    private static final long MIN_DISTANCE_CHANGE_FOR_UPDATES = 10;
    private static final long MIN_TIME_BW_UPDATES = 1000 * 60 * 1;
    protectedLocationManagerlocationManager;
    publicGPStrace(Context context) {
        this.context = context;
        getLocation();
    }
    public Location getLocation() {
        try {
            locationManager = (LocationManager) context.getSystemService(LOCATION_SERVICE);
            isGPSEnabled = locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER);
            isNetworkEnabled = locationManager.isProviderEnabled(LocationManager.NETWORK_PRO VI DER);
            if (!isGPSEnabled && !isNetworkEnabled) {} else {
                this.canGetLocation = true;
                if (isNetworkEnabled) {
                    locationManager.requestLocationUpdates(
                        LocationManager.NETWORK_PROVIDER,
                        MIN_TIME_BW_UPDATES,
                        MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                }
                if (locationManager != null) {
                    location = locationManager.getLastKnownLocation(LocationManager.NETWORK_PROVID ER);
                    if (location != null) {
                        latitude = location.getLatitude();
                        longtitude = location.getLongitude();
                    }
                }
            }
            if (isGPSEnabled) {
                if (location == null) {
                    locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, MIN_TIME_ B W_UPDATES, MIN_DISTANCE_CHANGE_FOR_UPDATES, this);
                    if (locationManager != null) {
                        location = locationManager.getLastKnownLocation(LocationManager.GPS_PROVIDER);
                        if (location != null) {
                            latitude = location.getLatitude();
                            longtitude = location.getLongitude();
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return location;
    }
    public void stopUsingGPS() {
        if (locationManager != null) {
            locationManager.removeUpdates(GPStrace.this);
        }
    }
    public double getLatitude() {
        if (location != null) {
            latitude = location.getLatitude();
        }
        return latitude;
    }
    public double getLongtiude() {
        if (location != null) {
            longtitude = location.getLatitude();
        }
        returnlongtitude;
    }
    publicbooleancanGetLocation() {
        returnthis.canGetLocation;
    }
    public void showSettingAlert() {
        AlertDialog.BuilderalertDialog = new AlertDialog.Builder(context);
        alertDialog.setTitle("GPS is settings");
        alertDialog.setMessage("GPS is not enabled.Do you want to go to setting menu?");
        alertDialog.setPositiveButton("settings", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterfacedialog, int which) {
                Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                context.startActivity(intent);
            }
        });
        alertDialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // TODO Auto-generated method stub 
                dialog.cancel();
            }
        });
        alertDialog.show();
    }
    @Override
    public void onLocationChanged(Location location) {
        // TODO Auto-generated method stub 
    }
    @Override
    public void onProviderDisabled(String provider) {
        // TODO Auto-generated method stub 
    }
    @Override
    public void onProviderEnabled(String provider) {
        // TODO Auto-generated method stub
    }
    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) { // TODO Auto-generated method stub 
    }
    @Override
    publicIBinderonBind(Intent intent) {
        // TODO Auto-generated method stub 
        return null;
    }
}