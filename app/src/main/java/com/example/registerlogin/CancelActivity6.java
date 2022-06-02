package com.example.registerlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CancelActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel6);
        Button btn_call = findViewById(R.id.btn_call);
        Button btn_threeidiotscoding = findViewById(R.id.btn_threeidiotscoding);


    }
    public void onClick(View v){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        switch (v.getId()){
            case R.id.btn_call:
                intent.setData(Uri.parse("tel:02-515-9985"));
                startActivity(intent);
                break;
            case R.id.btn_threeidiotscoding:
                intent.setData(Uri.parse("https://watcha.com/ko-KR?utm_source=google_sa&utm_medium=search&utm_campaign=brand&utm_term=%EC%99%93%EC%B0%A8&gclid=CjwKCAjw682TBhATEiwA9crl30kiLXJIguDeHbGO75vsmO4ulL7ZJigcC9DlQUfYcmsw1PW_sGbZ9xoCsOYQAvD_BwE"));
                startActivity(intent);
                break;
        }
    }
}