package com.example.a22checknetworksource;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view){
        ConnectivityManager connectivityManager = (ConnectivityManager)getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        if (null != networkInfo) {
            if (networkInfo.getType() == ConnectivityManager.TYPE_MOBILE) {
                Toast.makeText(this, "基地台", Toast.LENGTH_SHORT).show();
            } else if (networkInfo.getType() == ConnectivityManager.TYPE_WIFI) {
                Toast.makeText(this, "WIFI", Toast.LENGTH_SHORT).show();
            }
        }
        else {
            Toast.makeText(this, "無網路可用", Toast.LENGTH_SHORT).show();
        }
    }
}