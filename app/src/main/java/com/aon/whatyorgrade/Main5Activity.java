package com.aon.whatyorgrade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {
    private TextView text8,text9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        text8 = (TextView)findViewById(R.id.text8);
        text9 = (TextView)findViewById(R.id.text9);
        Intent a = getIntent();
        String a2 = a.getStringExtra("name");
        String a3 = a.getStringExtra("grade");

        text8.setText(a2);
        text9.setText(a3);
    }
}
