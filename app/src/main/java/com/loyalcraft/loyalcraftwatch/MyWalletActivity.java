package com.loyalcraft.loyalcraftwatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by achhj on 14.12.2017.
 */

public class MyWalletActivity extends WearableActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mywallet);
        setAmbientEnabled();


    }
}

