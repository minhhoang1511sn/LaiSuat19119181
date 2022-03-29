package com.android.laisuat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class result extends AppCompatActivity {
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t1 = (TextView) findViewById(R.id.textView3);

        t2 = (TextView) findViewById(R.id.textView8);
        Intent intent = getIntent();
        double a = intent.getDoubleExtra("tonglai",0.0);
        String lai = Double.toString(a);
        double b = intent.getDoubleExtra("sotiengui",0.0);
        String tongtien = Double.toString(b);
        t1.setText(lai);
        t2.setText(tongtien);
    }

    public void Camera(View view) throws IOException {
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        int REQUEST_ID_IMAGE_CAPTURE = 100;
        // Start camera and wait for the results.
        this.startActivityForResult(intent, REQUEST_ID_IMAGE_CAPTURE);
        if(intent.resolveActivity(getPackageManager())==null)
        {
                Intent intent2 = new Intent(result.this, MainActivity.class);
                startActivity(intent2);
        }
    }

}