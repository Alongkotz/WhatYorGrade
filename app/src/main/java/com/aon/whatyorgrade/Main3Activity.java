package com.aon.whatyorgrade;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private TextView text5,text6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        text5 = (TextView)findViewById(R.id.text5);
        text6 = (TextView)findViewById(R.id.text6);

        Intent aaa = getIntent();

        String a2 = aaa.getStringExtra("name");
        String a3 = aaa.getStringExtra("grade");

        text5.setText(a2);
        text6.setText(a3);
    }
}