package com.diabia.diabia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    TextView lblLoading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblLoading = (TextView) findViewById(R.id.lblLoading);

        new CountDownTimer(4000, 1000){
            @Override
            public void onTick(long millisUntilFinished) { }

            @Override
            public void onFinish() {
                goMenu();
                finish();
            }
        }.start();

    }

    public void goMenu(){
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }
}
