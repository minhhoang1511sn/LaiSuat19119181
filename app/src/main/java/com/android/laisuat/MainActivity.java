package com.android.laisuat;

import static java.lang.Double.parseDouble;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText e1, e2,e3;
    Double num1, num2, num3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean getNumbers() {


        e1 = (EditText) findViewById(R.id.textview);


        e2 = (EditText) findViewById(R.id.textview1);
        e3 = (EditText) findViewById(R.id.textview2);


        String s1 = e1.getText().toString();

        String s2 = e2.getText().toString();
        String s3 = e3.getText().toString();

       if(s1 == " "|| s1.equals(null)|| s2 == " "|| s2.equals(null) || s3 == " "|| s3.equals(null))
       {
           return false;
       }
       else {
           num1 = Double.parseDouble(s1);
           num2 = Double.parseDouble(s2);
           num3 = Double.parseDouble(s3);
           return  true;
       }

    }
    public void TinhLai(View v) {
        double sum = 0;
        if (getNumbers()) {
            sum = num1 * num2 * num3/360;
        }
        String s1 = e1.getText().toString();
        double full = sum + parseDouble(s1);
        Intent intent = new Intent(MainActivity.this, result.class);
        intent.putExtra("tonglai",sum);
        intent.putExtra("sotiengui",full);
        startActivity(intent);
    }
}