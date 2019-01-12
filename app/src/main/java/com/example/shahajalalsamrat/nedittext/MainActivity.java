package com.example.shahajalalsamrat.nedittext;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText input;
    Button press;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input=findViewById(R.id.inputedittextid);
        press=findViewById(R.id.PressButtonid);
        press.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.PressButtonid){
            Intent intent=new Intent(MainActivity.this,SecondActivity.class);
            intent.putExtra("key",input.getText().toString());
            startActivity(intent);
        }
    }
}
