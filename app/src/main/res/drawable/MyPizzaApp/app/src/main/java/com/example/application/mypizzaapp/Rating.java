package com.example.application.mypizzaapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class Rating extends AppCompatActivity {

    float myRatee= 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener(){
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {

                int rate = (int) v;
                String message = null;
                myRatee = ratingBar.getRating();

                switch (rate){
                    case 1:
                        message="oh";
                        break;
                    case 2:
                        message="sorry";
                        break;
                    case 3:
                        message="nice";
                        break;
                    case 4:
                        message="good";
                        break;
                    case 5:
                        message="excellent";
                        break;

                }
                Toast.makeText(Rating.this, message , Toast.LENGTH_SHORT).show();

            }
        });


    }
    public void onClick(View view){
        Toast.makeText(Rating.this,"your rate is:"+myRatee,Toast.LENGTH_SHORT).show();
    }

}
