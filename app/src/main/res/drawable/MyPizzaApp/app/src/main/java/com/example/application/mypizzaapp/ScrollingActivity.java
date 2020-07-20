package com.example.application.mypizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    public void buttonOne(View view){
        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }

    public void buttonTwo(View view){
        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }

    public void buttonThree(View view){
        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }

    public void buttonFour(View view){
        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }

    public void buttonFive(View view){
        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }

    public void buttonSix(View view){
        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }

    public void buttonSeven(View view){
        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }

    public void buttonEight(View view){
        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }
}
