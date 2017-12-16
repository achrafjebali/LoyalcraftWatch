package com.loyalcraft.loyalcraftwatch;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;

/**
 * Created by achhj on 14.12.2017.
 */

public class MyQrcodeActivity extends WearableActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myqrcode);
        setAmbientEnabled();


    }
}
