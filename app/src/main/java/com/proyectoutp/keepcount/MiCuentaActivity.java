package com.proyectoutp.keepcount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MiCuentaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_cuenta);
    }

    public void goToLogin(View view){
        Intent intentLogin = new Intent(this, Login.class);
        startActivity(intentLogin);
    }
    public void goToMainActivity(View view) {
        Intent intentMainActivity = new Intent(this, MainActivity.class);
        startActivity(intentMainActivity);
    }
}