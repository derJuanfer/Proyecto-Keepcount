package com.proyectoutp.keepcount;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FAQ extends AppCompatActivity {
    private TextView preg1, resp1, preg2, resp2, preg3, resp3, preg4, resp4, preg5, resp5, preg6, resp6, preg7, resp7, preg8, resp8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        preg1 = (TextView) findViewById(R.id.preg1);
        preg2 = (TextView) findViewById(R.id.preg2);
        preg3 = (TextView) findViewById(R.id.preg3);
        preg4 = (TextView) findViewById(R.id.preg4);
        preg5 = (TextView) findViewById(R.id.preg5);
        preg6 = (TextView) findViewById(R.id.preg6);
        preg7 = (TextView) findViewById(R.id.preg7);
        preg8 = (TextView) findViewById(R.id.preg8);
        resp1 = (TextView) findViewById(R.id.resp1);
        resp2 = (TextView) findViewById(R.id.resp2);
        resp3 = (TextView) findViewById(R.id.resp3);
        resp4 = (TextView) findViewById(R.id.resp4);
        resp5 = (TextView) findViewById(R.id.resp5);
        resp6 = (TextView) findViewById(R.id.resp6);
        resp7 = (TextView) findViewById(R.id.resp7);
        resp8 = (TextView) findViewById(R.id.resp8);
        resp1.setVisibility(View.GONE);
        resp2.setVisibility(View.GONE);
        resp3.setVisibility(View.GONE);
        resp4.setVisibility(View.GONE);
        resp5.setVisibility(View.GONE);
        resp6.setVisibility(View.GONE);
        resp7.setVisibility(View.GONE);
        resp8.setVisibility(View.GONE);

        preg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resp1.getVisibility() == View.GONE) {
                    resp1.setVisibility(View.VISIBLE);
                }else{
                    resp1.setVisibility(View.GONE);
                }

            }
        });

        preg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resp2.getVisibility() == View.GONE) {
                    resp2.setVisibility(View.VISIBLE);
                }else{
                    resp2.setVisibility(View.GONE);
                }

            }
        });

        preg3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resp3.getVisibility() == View.GONE) {
                    resp3.setVisibility(View.VISIBLE);
                }else{
                    resp3.setVisibility(View.GONE);
                }

            }
        });

        preg4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resp4.getVisibility() == View.GONE) {
                    resp4.setVisibility(View.VISIBLE);
                }else{
                    resp4.setVisibility(View.GONE);
                }

            }
        });

        preg5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resp5.getVisibility() == View.GONE) {
                    resp5.setVisibility(View.VISIBLE);
                }else{
                    resp5.setVisibility(View.GONE);
                }

            }
        });

        preg6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resp6.getVisibility() == View.GONE) {
                    resp6.setVisibility(View.VISIBLE);
                }else{
                    resp6.setVisibility(View.GONE);
                }

            }
        });

        preg7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resp7.getVisibility() == View.GONE) {
                    resp7.setVisibility(View.VISIBLE);
                }else{
                    resp7.setVisibility(View.GONE);
                }

            }
        });

        preg8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resp8.getVisibility() == View.GONE) {
                    resp8.setVisibility(View.VISIBLE);
                }else{
                    resp8.setVisibility(View.GONE);
                }

            }
        });

    }

    public void goToMainActivity(View view) {
        Intent intentMainActivity = new Intent(this, MainActivity.class);
        startActivity(intentMainActivity);
    }
}