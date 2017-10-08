package com.aon.whatyorgrade;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edit1,edit2;
    private Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit1 = (EditText)findViewById(R.id.text1);
        edit2 = (EditText)findViewById(R.id.text2);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = String.valueOf(edit1.getText().toString());
                String score = String.valueOf(edit2.getText().toString());
                boolean a = true;
                if (score.length() <= 0 || name.length() <= 0) {
                    if (isValid(name)) {
                        edit1.setError("Invalid");
                    } else if (isValid(score)) {
                        edit2.setError("Invalid");
                    }
                } else {
                    int score1 = Integer.valueOf(score);
                    if (score1 < 49) {
                        String g = "F";
                        Intent send1 = new Intent(MainActivity.this, Main2Activity.class);
                        send1.putExtra("name", name);
                        send1.putExtra("grade", g);
                        startActivity(send1);

                    } else if (score1 < 59) {
                        String g = "D";
                        Intent send2 = new Intent(MainActivity.this, Main3Activity.class);
                        send2.putExtra("name", name);
                        send2.putExtra("grade", g);
                        startActivity(send2);
                    } else if (score1 < 69) {
                        String g = "C";
                        Intent send3 = new Intent(MainActivity.this, Main4Activity.class);
                        send3.putExtra("name", name);
                        send3.putExtra("grade", g);
                        startActivity(send3);
                    } else if (score1 < 79) {
                        String g = "B";
                        Intent send4 = new Intent(MainActivity.this, Main5Activity.class);
                        send4.putExtra("name", name);
                        send4.putExtra("grade", g);
                        startActivity(send4);
                    } else {
                        String g = "A";
                        Intent send5 = new Intent(MainActivity.this, Main6Activity.class);
                        send5.putExtra("name", name);
                        send5.putExtra("grade", g);
                        startActivity(send5);
                    }
                }
            }

        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder c = new AlertDialog.Builder(MainActivity.this);
                    c.setTitle("Confirm Exit");
                    c.setMessage("แน่ใจว่าต้องการที่จะออกจากแอพ ?");
                    c.setCancelable(true);
                    c.setNegativeButton("ยดเลิก", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                        }
                    });
                    c.setPositiveButton("ออก", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            finish();
                        }
                    });
            c.show();
            }
        });
    }
    private boolean isValid(String s){
        if(s.length()==0){
            return true;
        }
        else
            return false;
    }
    /*private boolean isValid2(String a){
        if(a.length()==0){
            return true;
        }
        else
            return false;
    }*/
}

