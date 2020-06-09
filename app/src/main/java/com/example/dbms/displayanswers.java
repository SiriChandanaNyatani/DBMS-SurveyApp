package com.example.dbms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class displayanswers extends AppCompatActivity {
    ListView listviewans;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayanswers);
        listviewans=(ListView)findViewById(R.id.listviewans);

    }
}
