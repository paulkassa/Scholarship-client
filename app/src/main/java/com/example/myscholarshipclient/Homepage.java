package com.example.myscholarshipclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
    }

    public void gotoNext(View view) {
        Intent intent = new Intent(Homepage.this,GetdataInRecyclerView.class);
        startActivity(intent);
    }
}