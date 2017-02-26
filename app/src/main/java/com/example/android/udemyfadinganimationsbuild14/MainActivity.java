package com.example.android.udemyfadinganimationsbuild14;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView bart,homer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //homer=(ImageView)findViewById(R.id.image_homer);
     bart=(ImageView)findViewById(R.id.image_bart);
        bart.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
       // homer.animate().alpha(1f).setDuration(2000);
    }
}
