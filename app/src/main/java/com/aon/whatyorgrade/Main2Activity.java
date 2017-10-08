package com.aon.whatyorgrade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView text3,text4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        text3 = (TextView)findViewById(R.id.text3);
        text4 = (TextView)findViewById(R.id.text4);

        Intent aa = getIntent();

        String a2 = aa.getStringExtra("name");
        String a3 = aa.getStringExtra("grade");

        text3.setText(a2);
        text4.setText(a3);
    }
}
