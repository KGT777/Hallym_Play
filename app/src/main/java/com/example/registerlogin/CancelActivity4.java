package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CancelActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel4);
        Button btn_call = findViewById(R.id.btn_call);
        Button btn_threeidiotscoding = findViewById(R.id.btn_threeidiotscoding);


    }
    public void onClick(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()){
            case R.id.btn_call:
                intent.setData(Uri.parse("tel:080-822-1416"));
                startActivity(intent);
                break;
            case R.id.btn_threeidiotscoding:
                intent.setData(Uri.parse("https://www.disneyplus.com/ko-kr?cid=DSS-Search-Google-71700000088460638-&s_kwcid=AL!8468!3!584589737512!b!!g!!%EB%94%94%EC%A6%88%EB%8B%88&gclid=CjwKCAjw682TBhATEiwA9crl34IfxRZya__ljEh1Nt0kd8BqAV-s55EoohrcF5nF1vwglc8EHv55AxoCTo4QAvD_BwE&gclsrc=aw.ds"));
                startActivity(intent);
                break;
        }
    }
}