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
import com.example.dbms.Increment;
public class keer_resp_details extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private EditText et6;
    private EditText et7;
    private EditText et8;
    private Button f_logbut;
    DatabaseReference databasefin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keer_resp_details);
        databasefin =FirebaseDatabase.getInstance().getReference("RespDetails");
        f_logbut = (Button) findViewById(R.id.f_logbut);
        Increment.RID+=1;
       // et1= (EditText) findViewById(R.id.et1);
        et2= (EditText) findViewById(R.id.et2);
        et3= (EditText) findViewById(R.id.et3);
        et4= (EditText) findViewById(R.id.et4);
        et5= (EditText) findViewById(R.id.et5);
        et6= (EditText) findViewById(R.id.et6);
        et7= (EditText) findViewById(R.id.et7);
        et8= (EditText) findViewById(R.id.et8);

        f_logbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addfanswer();
                openActivity100();
            }
        });
    } private void addfanswer(){
        String rid= Integer.toString(Increment.RID+1);
        String Surveyor_ID=et2.getText().toString().trim();
        String Name=et3.getText().toString().trim();
        String Age=et4.getText().toString().trim();
        String Sex=et5.getText().toString().trim();
        String Village=et6.getText().toString().trim();
        String NoOfFamilyMembers=et7.getText().toString().trim();
        String MaritalStatus=et8.getText().toString().trim();
        if(!TextUtils.isEmpty(Surveyor_ID)){
            String id=databasefin.push().getKey();
            RespDetails fin=new RespDetails(rid,Surveyor_ID,Name,Age,Sex,Village,NoOfFamilyMembers,MaritalStatus);
            databasefin.child(id).setValue(fin);
            Toast.makeText(this,"Answers saved",Toast.LENGTH_LONG).show();        }else{
            Toast.makeText(this,"You should enter all the answers",Toast.LENGTH_LONG).show();
        }
    }
    public void openActivity100()
    {
        Intent intent = new Intent(this, QBSelect.class);
        startActivity(intent);
    }
}