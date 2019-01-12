package com.example.shahajalalsamrat.nedittext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {
    LinearLayout linearLayout;
    int value;
    EditText [] myedit=new EditText[100];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        linearLayout=findViewById(R.id.linearlayoutid);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            String str=bundle.getString("key");
            value= Integer.parseInt(str);

        }
        for(int i=0;i<value;i++){
            myedit[i]=new EditText(this);
            myedit[i].setId(i);
            myedit[i].setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
            linearLayout.addView(myedit[i]);
        }
    }


}

