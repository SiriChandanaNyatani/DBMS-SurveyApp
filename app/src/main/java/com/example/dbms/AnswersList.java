package com.example.dbms;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AnswersList extends ArrayAdapter<FinanceQB_Answers> {
    private Activity context;
    private List<FinanceQB_Answers> answerslist;
    public AnswersList(Activity context, List<FinanceQB_Answers> answerslist){
        super(context,R.layout.list_layout,answerslist);
        this.context=context;
        this.answerslist=answerslist;


    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View listViewItem=inflater.inflate(R.layout.list_layout,null,true);
        TextView textViewans1=(TextView)listViewItem.findViewById(R.id.textView);
        TextView textViewans2=(TextView)listViewItem.findViewById(R.id.textView2);
        TextView textViewans3=(TextView)listViewItem.findViewById(R.id.textView3);
        TextView textViewans4=(TextView)listViewItem.findViewById(R.id.textView4);
        TextView textViewans5=(TextView)listViewItem.findViewById(R.id.textView5);
        FinanceQB_Answers fa=answerslist.get(position);
        textViewans1.setText(fa.getAnswer1());
        textViewans2.setText(fa.getAnswer1());
        textViewans3.setText(fa.getAnswer2());

        return listViewItem;
    }


}
