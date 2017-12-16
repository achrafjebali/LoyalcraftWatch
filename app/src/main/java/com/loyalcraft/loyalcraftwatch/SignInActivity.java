package com.loyalcraft.loyalcraftwatch;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.UiThread;
import android.support.wearable.activity.WearableActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Arrays;

/**
 * Created by achhj on 14.12.2017.
 */

public class SignInActivity extends WearableActivity {

    Button signIn, facebook, google;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        setAmbientEnabled();

        facebook = (Button) findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                startActivity(new Intent(SignInActivity.this, MainActivity.class));
            }
        });

        google = (Button) findViewById(R.id.google);
        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignInActivity.this, MainActivity.class));

            }
        });

    }

}
