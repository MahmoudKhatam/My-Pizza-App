package com.example.application.mypizzaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class offers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offers);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }
    public void orderOne(View view){

        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }
    public void orderTwo(View view){

        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }
    public void orderThree(View view){

        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }
    public void orderFour(View view){

        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }
    public void orderFive(View view){

        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }
    public void orderSix(View view){

        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }
    public void orderSeven(View view){

        Intent intent = new Intent(this,myorder.class);
        startActivity(intent);
    }

}
