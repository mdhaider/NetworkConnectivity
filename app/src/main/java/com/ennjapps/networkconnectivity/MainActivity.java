package com.ennjapps.networkconnectivity;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConnectivityManager connectionManager=(ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
       NetworkInfo networkInfo= connectionManager.getActiveNetworkInfo();
        if(networkInfo!=null && networkInfo.isConnected())

            Toast.makeText(this,"Connected to Network",Toast.LENGTH_LONG).show();
        else{
            Toast.makeText(this,"Not connected to Network",Toast.LENGTH_LONG).show();
        }
        }


    }



