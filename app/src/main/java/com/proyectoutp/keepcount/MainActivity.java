package com.proyectoutp.keepcount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etNumberOne;
    private EditText etNumberTwo;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcularSaldo(View view) {

        etNumberOne = (EditText) findViewById(R.id.etNumberOne);
        etNumberTwo = findViewById(R.id.etNumberTwo);
        tvResult = findViewById(R.id.tvResult);

        String strNumberOne = etNumberOne.getText().toString();
        String strNumberTwo = etNumberTwo.getText().toString();
        Resources res = getResources();
        if (!strNumberOne.equals("") && !strNumberTwo.equals("") ) {
            double numberOne = Double.parseDouble(strNumberOne);
            double numberTwo = Double.parseDouble(strNumberTwo);

            double substract = (numberOne - numberTwo );

            String result = String.format("Saldo = %1$s ", String.valueOf(substract));

            tvResult.setText(result);
        } else {
            Toast.makeText(this, "Debe ingresar ambos valores", Toast.LENGTH_LONG).show();
        }

    }

    public void goToFAQ(View view) {
        Intent intentFAQ = new Intent(this, FAQ.class);
        startActivity(intentFAQ);
    }

    public void goToIngresos(View view) {
        Intent intentIngresos = new Intent(this, Ingresos.class);
        startActivity(intentIngresos);
    }

    public void goToEgresos(View view) {
        Intent intentEgresos = new Intent(this, Egresos.class);
        startActivity(intentEgresos);
    }

    public void goToMiCuentaActivity(View view) {
        Intent intentMiCuentaActivity = new Intent(this, MiCuentaActivity.class);
        startActivity(intentMiCuentaActivity);
    }

}