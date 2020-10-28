package com.diabia.diabia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
    }

    public void btnAnswer_Click(View v){
        String buttonText = ((Button) v).getText().toString();
        Toast.makeText(getApplicationContext(), buttonText, Toast.LENGTH_SHORT).show();
    }
}
