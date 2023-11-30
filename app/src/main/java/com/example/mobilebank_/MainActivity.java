package com.example.mobilebank_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double money = 5000;
    private TextView moneyLabel;
    Bundle arguments = getIntent().getExtras();
    int limit = arguments.getInt("limit");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        moneyLabel = findViewById(R.id.money);
        moneyLabel.setText(String.valueOf(money));
    }
    public void exitClick(View view){
        this.finishAffinity();
    }

    public void profileClick(View view){
        Intent profile = new Intent(this, ProfileActivity.class);
        startActivity(profile);
    }
    public void remittanceClick(View view){
        Intent remittance = new Intent(this, RemittanceActivity.class);
        remittance.putExtra("limit", limit);
        remittance.putExtra("money", money);
        startActivity(remittance);
    }
    public void payClick(View view){
        Intent pay = new Intent(this, PayActivity.class);
        pay.putExtra("limit", limit);
        pay.putExtra("money", money);
        startActivity(pay);
    }

    public void officeClick(View view){
        Intent office = new Intent(this, OfficeActivity.class);
        startActivity(office);
    }
}