package com.example.salman.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;
    String[] languages = {"Java", "C++", "Android", "Python", "C#", "Swift"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rv = (RecyclerView) findViewById(R.id.ProgrammingList);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new ProgrammingListAdapter(languages));

    }
}
