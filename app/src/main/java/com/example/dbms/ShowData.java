package com.example.dbms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.DatabaseReference;

import java.util.ArrayList;

public class ShowData extends AppCompatActivity {
    DatabaseReference databaseReference;
    ListView listview;
    ArrayList<String> arrayList=new ArrayList<>();
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
    }
}
