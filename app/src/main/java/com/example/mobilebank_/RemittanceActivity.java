package com.example.mobilebank_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RemittanceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remittance);
    }
    public void menuClick(View view){
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }
}