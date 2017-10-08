package com.aon.whatyorgrade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {
    private TextView text10,text11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        text10 = (TextView)findViewById(R.id.text10);
        text11 = (TextView)findViewById(R.id.text11);

        Intent bb = getIntent();

        String a2 = bb.getStringExtra("name");
        String a3 = bb.getStringExtra("grade");

        text10.setText(a2);
        text11.setText(a3);
    }
}
