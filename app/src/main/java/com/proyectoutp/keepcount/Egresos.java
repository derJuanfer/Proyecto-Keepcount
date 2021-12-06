package com.proyectoutp.keepcount;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Egresos extends AppCompatActivity {

    private EditText etNumberOne;
    private EditText etNumberTwo;
    private EditText etDescr;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egresos);
    }

    public void calcularSaldo(View view) {

        etNumberOne = (EditText) findViewById(R.id.etNumberOne);
        etNumberTwo = findViewById(R.id.etNumberTwo);
        etDescr = findViewById(R.id.etDescr);
        tvResult = findViewById(R.id.tvResult);

        String strNumberOne = etNumberOne.getText().toString();
        String strNumberTwo = etNumberTwo.getText().toString();
        Resources res = getResources();
        if (!strNumberOne.equals("") && !strNumberTwo.equals("") ) {
            double numberOne = Double.parseDouble(strNumberOne);
            double numberTwo = Double.parseDouble(strNumberTwo);

            double add = (numberOne + numberTwo );

            String result = String.format("Total = %1$s ", String.valueOf(add));

            tvResult.setText(result);
        } else {
            Toast.makeText(this, "Debe ingresar al menos un valor y 0 en el otro", Toast.LENGTH_LONG).show();
        }

    }

    public void limpiarFormulario(View view) {
        etNumberOne.setText("");
        etNumberTwo.setText("");
        etDescr.setText("");
        tvResult.setText("");
    }

    public void goToMainActivity(View view) {
        Intent intentMainActivity = new Intent(this, MainActivity.class);
        startActivity(intentMainActivity);
    }

}