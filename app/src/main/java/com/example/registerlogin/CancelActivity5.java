package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CancelActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel5);
        Button btn_call = findViewById(R.id.btn_call);
        Button btn_threeidiotscoding = findViewById(R.id.btn_threeidiotscoding);


    }
    public void onClick(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()){
            case R.id.btn_call:
                intent.setData(Uri.parse("tel:1600-9800"));
                startActivity(intent);
                break;
            case R.id.btn_threeidiotscoding:
                intent.setData(Uri.parse("https://www.coupangplay.com/"));
                startActivity(intent);
                break;
        }
    }
}