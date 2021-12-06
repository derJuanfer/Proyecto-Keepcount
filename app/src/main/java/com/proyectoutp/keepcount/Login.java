package com.proyectoutp.keepcount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }
    public void goToMainActivity(View view) {
        Intent intentMainActivity = new Intent(this, MainActivity.class);
        startActivity(intentMainActivity);
    }
    public void goToMiCuentaActivity(View view) {
        Intent intentMiCuentaActivity = new Intent(this, MiCuentaActivity.class);
        startActivity(intentMiCuentaActivity);
    }
}