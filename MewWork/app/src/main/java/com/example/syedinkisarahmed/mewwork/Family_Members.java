package com.example.syedinkisarahmed.mewwork;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Family_Members extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family__members);
        ArrayList<Word> list = new ArrayList<Word>();


        list.add(new Word("One","Lutti"));
        list.add(new Word("Two","Lutti"));
        list.add(new Word("Three","Lutti"));
        list.add(new Word("Four","Lutti"));
        list.add(new Word("Five","Lutti"));
        list.add(new Word("six","Lutti"));
        list.add(new Word("Seven","Lutti"));
        list.add(new Word("Eight","Lutti"));
        list.add(new Word("Nine","Lutti"));
        list.add(new Word("Ten","Lutti"));
        WordAdapter adList = new WordAdapter(this, list);
        ListView listview = (ListView) findViewById(R.id.grdv);
        listview.setAdapter(adList);

    }
}
