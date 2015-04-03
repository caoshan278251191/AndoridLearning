package com.example.shan_cao.changegreenandblue;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;


public class MainActivity extends ActionBarActivity {
    RelativeLayout background;
    Button btnBlue, btnGreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        background= (RelativeLayout)findViewById(R.id.background);
        btnGreen=(Button)findViewById(R.id.btnGreen);
        btnBlue=(Button)findViewById(R.id.btnBlue);

        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#00ff00"));
            }
        });

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                background.setBackgroundColor(Color.parseColor("#0000ff"));
            }
        });



    }



}
