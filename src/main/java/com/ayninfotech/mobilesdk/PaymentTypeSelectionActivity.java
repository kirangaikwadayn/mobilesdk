package com.ayninfotech.mobilesdk;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class PaymentTypeSelectionActivity extends AppCompatActivity{


    private TextView txtCard;
    private TextView txtNetbanking;
    private TextView txtWallet;
    private TextView txtUPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_type_selection);
        initViews();

    }

    private void initViews() {
        txtCard=findViewById(R.id.txtCard);
        txtNetbanking=findViewById(R.id.txtNetbanking);
        txtWallet=findViewById(R.id.txtWallet);
        txtUPI=findViewById(R.id.txtUPI);

        txtCard.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {
                txtCard.setBackground(getDrawable(R.color.colorPrimaryDark));
                navigateGeneralActivity("nav_card");
            }
        });
        txtNetbanking.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {
                txtNetbanking.setBackground(getDrawable(R.color.colorPrimaryDark));
                navigateGeneralActivity("nav_netbanking");
            }
        });
        txtWallet.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {
                txtWallet.setBackground(getDrawable(R.color.colorPrimaryDark));
                navigateGeneralActivity("nav_wallet");
            }
        });
        txtUPI.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NewApi")
            @Override
            public void onClick(View v) {
                txtUPI.setBackground(getDrawable(R.color.colorPrimaryDark));
                navigateGeneralActivity("nav_upi");
            }
        });
    }


    public void navigateGeneralActivity(String FragmentName){
        Intent intent = new Intent(PaymentTypeSelectionActivity.this, GeneralActivity.class);
        intent.putExtra("from", FragmentName);
        startActivity(intent);
    }


}
