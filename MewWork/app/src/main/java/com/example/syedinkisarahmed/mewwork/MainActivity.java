package com.example.syedinkisarahmed.mewwork;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txt1 = (TextView) findViewById(R.id.first);
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
               startActivity( i );
            }
        });
        TextView txt2 = (TextView) findViewById(R.id.two);
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              Intent i = new Intent(MainActivity.this,Family_Members.class);
                startActivity( i );
            }
        });
        TextView txt3 = (TextView) findViewById(R.id.third);
        txt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Colors.class);
                startActivity( i );
            }
        });
        TextView txt4 = (TextView) findViewById(R.id.fourth);
        txt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Pharases.class);
                startActivity( i );
            }
        });

    }
}
