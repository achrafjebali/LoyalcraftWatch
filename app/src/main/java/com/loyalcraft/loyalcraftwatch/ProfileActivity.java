package com.loyalcraft.loyalcraftwatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.support.wearable.view.BoxInsetLayout;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by achhj on 14.12.2017.
 */

public class ProfileActivity extends WearableActivity {


    private ImageButton btnwallet, btnqr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        setAmbientEnabled();


        btnwallet = (ImageButton) findViewById(R.id.mywallet);
        btnqr = (ImageButton) findViewById(R.id.myqr);
        btnwallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ProfileActivity.this, MyWalletActivity.class));
            }
        });

        btnqr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(ProfileActivity.this, MyQrcodeActivity.class));
            }
        });
    }
}
