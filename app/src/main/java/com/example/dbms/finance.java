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
public class finance extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private Button f_logbut;
    DatabaseReference databasefin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finance);
        databasefin =FirebaseDatabase.getInstance().getReference("FinanceQB_Answers");
        f_logbut = (Button) findViewById(R.id.f_logbut);
        Increment.RID+=1;
        et1= (EditText) findViewById(R.id.et1);
        et2= (EditText) findViewById(R.id.et2);
        et3= (EditText) findViewById(R.id.et3);
        et4= (EditText) findViewById(R.id.et4);
        et5= (EditText) findViewById(R.id.et5);
        f_logbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addfanswer();
                openActivity100();
            }
        });
    } private void addfanswer(){
        String rid= Integer.toString(Increment.RID);
        String Answer1=et1.getText().toString().trim();
        String Answer2=et2.getText().toString().trim();
        String Answer3=et3.getText().toString().trim();
        String Answer4=et4.getText().toString().trim();
        String Answer5=et5.getText().toString().trim();
        if(!TextUtils.isEmpty(Answer1)){
            String id=databasefin.push().getKey();
            FinanceQB_Answers fin=new FinanceQB_Answers(id,rid,Answer1,Answer2,Answer3,Answer4,Answer5);
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