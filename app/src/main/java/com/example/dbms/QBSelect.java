package com.example.dbms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QBSelect extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;


@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qbselect);

        button=findViewById(R.id.button);
        button2=findViewById(R.id.button2);
        button3=findViewById(R.id.button3);
        button4=findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivitya();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityb();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityc();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivityd();
            }
        });



    }
    public void openActivitya()
    {
        Intent intent2 = new Intent(this, finance.class);
        startActivity(intent2);
    }
    public void openActivityb()
    {
        Intent intent2 = new Intent(this, health_care.class);
        startActivity(intent2);
    }
    public void openActivityc()
    {
        Intent intent2 = new Intent(this,Education.class);
        startActivity(intent2);
    }
    public void openActivityd()
    {
        Intent intent2 = new Intent(this, agriculture.class);
        startActivity(intent2);
    }
}