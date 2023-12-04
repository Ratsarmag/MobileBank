package com.example.mobilebank_;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.chaos.view.PinView;

public class LoginActivity extends AppCompatActivity {
    PinView pinView;
    // TODO - сделать проверку какую-либо простецкую проверку пина, даже если это сравнение со строкой
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        pinView = findViewById(R.id.PINfield);
        pinView.setPasswordHidden(false);
        pinView.requestFocus();
        Intent menu = new Intent(this, MainActivity.class);
        InputMethodManager inputMethodManager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED, InputMethodManager.HIDE_IMPLICIT_ONLY);
        pinView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if(s.toString().length() == 4) {
                    startActivity(menu);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }


    public void exitClick(View view){
        this.finishAffinity();
    }
}