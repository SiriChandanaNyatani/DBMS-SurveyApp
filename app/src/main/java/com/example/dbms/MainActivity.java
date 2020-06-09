package com.example.dbms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private Button logbut;
    public EditText R_Email;
    private EditText R_Password;
    DatabaseReference databaseSurveyors;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseSurveyors= FirebaseDatabase.getInstance().getReference("Surveyor");
        logbut = (Button) findViewById(R.id.R_LogBut);
        R_Email = (EditText) findViewById(R.id.R_EID);
        R_Password = (EditText) findViewById(R.id.R_Password);
        logbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addSurveyor();
                openActivity2();
            }
        });
    }
    private void addSurveyor(){
        String email=R_Email.getText().toString().trim();
        String password=R_Password.getText().toString().trim();
        if(!TextUtils.isEmpty(email)){
           String id=databaseSurveyors.push().getKey();
           Surveyor surveyor=new Surveyor(id,email,password);
           databaseSurveyors.child(id).setValue(surveyor);
           Toast.makeText(this,"Surveyor added",Toast.LENGTH_LONG).show();        }else{
            Toast.makeText(this,"You should enter a name",Toast.LENGTH_LONG).show();
            Increment ob=new Increment(email);
        }
    }
    public void openActivity2()
    {
        Intent intent = new Intent(this, keer_resp_details.class);
        startActivity(intent);
    }
}