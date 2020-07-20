package com.example.application.mypizzaapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class extras extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras);

        String[] myExtra = {"salad","ketchup","sodas","icecream","cake","coffe","tea","juice"};

        ListAdapter myAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,myExtra);
        ListView myListView = (ListView) findViewById(R.id.myListView);
        myListView.setAdapter(myAdapter);



    }


}
