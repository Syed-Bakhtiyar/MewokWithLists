package com.example.syedinkisarahmed.mewwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ArrayList<String> list = new ArrayList<>();


        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");
        list.add("seven");
        list.add("eight");
        list.add("nine");
        list.add("Ten");
        ArrayAdapter<String> adList = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
        ListView listview = (ListView) findViewById(R.id.lists);
        listview.setAdapter(adList);

    }
}
