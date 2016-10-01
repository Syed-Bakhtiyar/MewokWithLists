package com.example.syedinkisarahmed.mewwork;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Syed Inkisar Ahmed on 9/29/2016.
 */
public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Context c, ArrayList<Word> words){
    super(c,0,words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView ;
        if(v==null){
            v= LayoutInflater.from(getContext()).inflate(R.layout.activity_list_v,parent,false) ;
        }
        Word currentWord = getItem(position);
        TextView mivok = (TextView) v.findViewById(R.id.Miwok);
        mivok.setText(currentWord.getMiwokTranslationApp());
        TextView English = (TextView) v.findViewById(R.id.EnglishTranslation);
        English.setText(currentWord.getDefaultEnglishWord());
        return v;
    }
}
