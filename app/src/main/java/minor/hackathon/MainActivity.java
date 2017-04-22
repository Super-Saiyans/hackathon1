package minor.hackathon;

import android.app.ProgressDialog;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.location.LocationManager;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.altbeacon.beacon.Beacon;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.BeaconTransmitter;
import org.altbeacon.beacon.Identifier;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Handler;

public class MainActivity extends AppCompatActivity {

    Button b,b2,b3,b4,b5,b6,b7,b8,b9;
    Beacon beacon,beacon1,beacon4,beacon2,beacon3,beacon5,beacon6,beacon7,beacon8;
    ProgressDialog p;
      BeaconTransmitter beaconTransmitter = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button) findViewById(R.id.button);
        b2=(Button) findViewById(R.id.button2);
        b3=(Button) findViewById(R.id.button3);
        b4=(Button) findViewById(R.id.button4);
        b5=(Button) findViewById(R.id.button5);
        b6=(Button) findViewById(R.id.button6);
        b7=(Button) findViewById(R.id.button7);
        b8=(Button) findViewById(R.id.button8);
        b9=(Button) findViewById(R.id.stop);


        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();// mBluetoothAdapter.enable();
        LocationManager locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if( !locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ) {
            startActivity(new Intent(android.provider.Settings.ACTION_LOCATION_SOURCE_SETTINGS));

            return;
        }


        p=new ProgressDialog(this);
        p.setMessage("Sending Message");
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                {
p.show();
                    byte [] ab = new byte[18];
                    ab[0]=(byte)(0xF4);
                    Identifier encodedUrlIdentifier = Identifier.fromBytes(ab, 0, 17, false);
                    Log.i("confirm",""+getHex(ab)+"   "+ab.length);
                    ArrayList<Identifier> identifiers = new ArrayList<Identifier>();
                    identifiers.add(encodedUrlIdentifier);
                    beacon4 = new Beacon.Builder()
                            .setIdentifiers(identifiers)
                            .setManufacturer(0x0118)
                            .setTxPower(-59)
                            .setRssi(1)
                            .build();
                    BeaconParser beaconParser = new BeaconParser()
                            .setBeaconLayout(BeaconParser.EDDYSTONE_URL_LAYOUT);
   beaconTransmitter = new BeaconTransmitter(getApplicationContext(), beaconParser);

                    beaconTransmitter.startAdvertising(beacon4);
                    Log.i("confirm",getHex(ab)+"   "+ab.length);

                }


            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                {
                    p.show();
                    byte [] ab = new byte[18];
                    ab[0]=(byte)(0xF3);
                    Identifier encodedUrlIdentifier = Identifier.fromBytes(ab, 0, 17, false);
                    Log.i("confirm",""+getHex(ab)+"   "+ab.length);
                    ArrayList<Identifier> identifiers = new ArrayList<Identifier>();
                    identifiers.add(encodedUrlIdentifier);
                    beacon4 = new Beacon.Builder()
                            .setIdentifiers(identifiers)
                            .setManufacturer(0x0118)
                            .setTxPower(-59)
                            .setRssi(1)
                            .build();
                    BeaconParser beaconParser = new BeaconParser()
                            .setBeaconLayout(BeaconParser.EDDYSTONE_URL_LAYOUT);
                    beaconTransmitter = new BeaconTransmitter(getApplicationContext(), beaconParser);

                    beaconTransmitter.startAdvertising(beacon4);
                    Log.i("confirm",getHex(ab)+"   "+ab.length);

                }


            }
        });

        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                p.show();

                 {

                    byte [] ab = new byte[18];
                    ab[0]=(byte)(0xF1);
                    Identifier encodedUrlIdentifier = Identifier.fromBytes(ab, 0, 17, false);
                    Log.i("confirm",""+getHex(ab)+"   "+ab.length);
                    ArrayList<Identifier> identifiers = new ArrayList<Identifier>();
                    identifiers.add(encodedUrlIdentifier);
                    beacon1 = new Beacon.Builder()
                            .setIdentifiers(identifiers)
                            .setManufacturer(0x0118)
                            .setTxPower(-59)
                            .build();
                    BeaconParser beaconParser = new BeaconParser()
                            .setBeaconLayout(BeaconParser.EDDYSTONE_URL_LAYOUT);
 beaconTransmitter = new BeaconTransmitter(getApplicationContext(), beaconParser);

                    beaconTransmitter.startAdvertising(beacon1);
                    Log.i("confirm",getHex(ab)+"   "+ab.length);





                }


            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

p.show();

                {

                    byte [] ab = new byte[18];
                    ab[0]=(byte)(0xF2);
                    Identifier encodedUrlIdentifier = Identifier.fromBytes(ab, 0, 17, false);
                    Log.i("confirm",""+getHex(ab)+"   "+ab.length);
                    ArrayList<Identifier> identifiers = new ArrayList<Identifier>();
                    identifiers.add(encodedUrlIdentifier);
                    beacon = new Beacon.Builder()
                            .setIdentifiers(identifiers)
                            .setManufacturer(0x0118)
                            .setTxPower(-59).setRssi(1)
                            .build();
                    BeaconParser beaconParser = new BeaconParser()
                            .setBeaconLayout(BeaconParser.EDDYSTONE_URL_LAYOUT);
   beaconTransmitter = new BeaconTransmitter(getApplicationContext(), beaconParser);

                    beaconTransmitter.startAdvertising(beacon);
                    Log.i("confirm",getHex(ab)+"   "+ab.length);
                 //              beaconTransmitter.stopAdvertising();

                }


            }
        });




        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                p.show();

                {

                    byte [] ab = new byte[18];
                    ab[0]=(byte)(0xF5);
                    Identifier encodedUrlIdentifier = Identifier.fromBytes(ab, 0, 17, false);
                    Log.i("confirm",""+getHex(ab)+"   "+ab.length);
                    ArrayList<Identifier> identifiers = new ArrayList<Identifier>();
                    identifiers.add(encodedUrlIdentifier);
                    beacon = new Beacon.Builder()
                            .setIdentifiers(identifiers)
                            .setManufacturer(0x0118)
                            .setTxPower(-59).setRssi(1)
                            .build();
                    BeaconParser beaconParser = new BeaconParser()
                            .setBeaconLayout(BeaconParser.EDDYSTONE_URL_LAYOUT);
 beaconTransmitter = new BeaconTransmitter(getApplicationContext(), beaconParser);

                    beaconTransmitter.startAdvertising(beacon);
                    Log.i("confirm",getHex(ab)+"   "+ab.length);
                    //              beaconTransmitter.stopAdvertising();

                }


            }
        });



        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                p.show();

                {

                    byte [] ab = new byte[18];
                    ab[0]=(byte)(0xF6);
                    Identifier encodedUrlIdentifier = Identifier.fromBytes(ab, 0, 17, false);
                    Log.i("confirm",""+getHex(ab)+"   "+ab.length);
                    ArrayList<Identifier> identifiers = new ArrayList<Identifier>();
                    identifiers.add(encodedUrlIdentifier);
                    beacon = new Beacon.Builder()
                            .setIdentifiers(identifiers)
                            .setManufacturer(0x0118)
                            .setTxPower(-59).setRssi(1)
                            .build();
                    BeaconParser beaconParser = new BeaconParser()
                            .setBeaconLayout(BeaconParser.EDDYSTONE_URL_LAYOUT);
                   beaconTransmitter = new BeaconTransmitter(getApplicationContext(), beaconParser);

                    beaconTransmitter.startAdvertising(beacon);
                    Log.i("confirm",getHex(ab)+"   "+ab.length);
                    //              beaconTransmitter.stopAdvertising();

                }


            }
        });


        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                p.show();

                {

                    byte [] ab = new byte[18];
                    ab[0]=(byte)(0xF7);
                    Identifier encodedUrlIdentifier = Identifier.fromBytes(ab, 0, 17, false);
                    Log.i("confirm",""+getHex(ab)+"   "+ab.length);
                    ArrayList<Identifier> identifiers = new ArrayList<Identifier>();
                    identifiers.add(encodedUrlIdentifier);
                    beacon = new Beacon.Builder()
                            .setIdentifiers(identifiers)
                            .setManufacturer(0x0118)
                            .setTxPower(-59).setRssi(1)
                            .build();
                    BeaconParser beaconParser = new BeaconParser()
                            .setBeaconLayout(BeaconParser.EDDYSTONE_URL_LAYOUT);
                   beaconTransmitter = new BeaconTransmitter(getApplicationContext(), beaconParser);

                    beaconTransmitter.startAdvertising(beacon);
                    Log.i("confirm",getHex(ab)+"   "+ab.length);
                    //              beaconTransmitter.stopAdvertising();

                }


            }
        });



        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                p.show();

                {

                    byte [] ab = new byte[18];
                    ab[0]=(byte)(0xF8);
                    Identifier encodedUrlIdentifier = Identifier.fromBytes(ab, 0, 17, false);
                    Log.i("confirm",""+getHex(ab)+"   "+ab.length);
                    ArrayList<Identifier> identifiers = new ArrayList<Identifier>();
                    identifiers.add(encodedUrlIdentifier);
                    beacon = new Beacon.Builder()
                            .setIdentifiers(identifiers)
                            .setManufacturer(0x0118)
                            .setTxPower(-59).setRssi(1)
                            .build();
                    BeaconParser beaconParser = new BeaconParser()
                            .setBeaconLayout(BeaconParser.EDDYSTONE_URL_LAYOUT);
                  beaconTransmitter = new BeaconTransmitter(getApplicationContext(), beaconParser);

                    beaconTransmitter.startAdvertising(beacon);
                    Log.i("confirm",getHex(ab)+"   "+ab.length);
                    //              beaconTransmitter.stopAdvertising();

                }


            }
        });


        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                p.dismiss();

                {

                    beaconTransmitter.stopAdvertising();

                }


            }
        });





    }
    public static String getHex( byte [] raw ) {
        final String HEXES = "0123456789ABCDEF";
        if ( raw == null ) {
            return null;
        }
        final StringBuilder hex = new StringBuilder( 2 * raw.length );
        for ( final byte b : raw ) {
            hex.append(HEXES.charAt((b & 0xF0) >> 4))
                    .append(HEXES.charAt((b & 0x0F)));
        }
        return hex.toString();
    }


}
