package com.example.kelimeoyunu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class BolumlerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bolumler);
    }

    public void btnbolum1(View view) {
        String tag = (String) view.getTag();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                    Intent i = new Intent(getApplicationContext(),YukleniyorActivity.class);
                    i.putExtra("tag",tag);
                    startActivity(i);
            }
        },150);
    }
}