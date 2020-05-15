//03-05-2020 10117191-RizalMaulana-IF5
package com.apps.rizalmaulana.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private int waktu_loading = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent hoem = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(hoem);
                finish();
            }
        },waktu_loading);
    }
}
