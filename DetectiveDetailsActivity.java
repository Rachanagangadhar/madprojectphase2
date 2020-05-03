package com.example.citizen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class DetectiveDetailsActivity extends AppCompatActivity {
    String detid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detective_details);
        Intent intent=getIntent();
        detid=intent.getStringExtra("id");
    }
}
