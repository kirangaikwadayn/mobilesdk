package com.ayninfotech.mobilesdk.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.ayninfotech.mobilesdk.R;

public class NetBankingFragments extends Fragment {

    private Button btnPaymentnetBanking;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_netbanking, container, false);
        initViews(view);
        return view;
    }

    private void initViews(View view) {
        btnPaymentnetBanking=view.findViewById(R.id.btnPaymentnetBanking);
        btnPaymentnetBanking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}
