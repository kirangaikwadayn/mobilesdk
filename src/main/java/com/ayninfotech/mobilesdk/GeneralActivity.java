package com.ayninfotech.mobilesdk;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.ayninfotech.mobilesdk.fragments.CardFragments;
import com.ayninfotech.mobilesdk.fragments.NetBankingFragments;
import com.ayninfotech.mobilesdk.fragments.UPIFragments;
import com.ayninfotech.mobilesdk.fragments.WalletFragments;

public class GeneralActivity extends AppCompatActivity {

    private String str;
    FragmentManager myFragmentManager;
    FragmentTransaction myFragmentTransaction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general);

        str = getIntent().getStringExtra("from");

        if (str.equalsIgnoreCase("nav_card")) {
            myFragmentManager = getSupportFragmentManager();
            myFragmentTransaction = myFragmentManager.beginTransaction();
            myFragmentTransaction.replace(R.id.containerView, new CardFragments()).commit();
        }else if (str.equalsIgnoreCase("nav_netbanking")) {

            myFragmentManager = getSupportFragmentManager();
            myFragmentTransaction = myFragmentManager.beginTransaction();
            myFragmentTransaction.replace(R.id.containerView, new NetBankingFragments()).commit();
        } else if (str.equalsIgnoreCase("nav_wallet")) {
            myFragmentManager = getSupportFragmentManager();
            myFragmentTransaction = myFragmentManager.beginTransaction();
            myFragmentTransaction.replace(R.id.containerView, new UPIFragments()).commit();
        } else if (str.equalsIgnoreCase("nav_upi")) {
            myFragmentManager = getSupportFragmentManager();
            myFragmentTransaction = myFragmentManager.beginTransaction();
            myFragmentTransaction.replace(R.id.containerView, new WalletFragments()).commit();
        }
    }

}
