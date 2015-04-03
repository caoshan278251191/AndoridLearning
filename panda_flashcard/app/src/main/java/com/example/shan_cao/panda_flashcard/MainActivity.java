package com.example.shan_cao.panda_flashcard;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends ActionBarActivity {
     LinearLayout backgroud;
     Button btnGreen,btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        backgroud=(LinearLayout) findViewById(R.id.background);
        btnGreen=(Button) findViewById(R.id.btnGreen);
        btnBlue=(Button) findViewById(R.id.btnBlue);

        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // click the button here
                backgroud.setBackgroundColor(Color.parseColor("#00ff00"));
            }
        });
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                backgroud.setBackgroundColor(Color.parseColor("#0000ff"));
            }
        });
    }


}
