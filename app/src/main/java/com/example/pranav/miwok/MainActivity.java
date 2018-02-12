package com.example.pranav.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.lang.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView number =(TextView) findViewById(R.id.number);
        TextView family =(TextView) findViewById(R.id.family);
        TextView colors =(TextView) findViewById(R.id.colors);
        TextView phrases =(TextView) findViewById(R.id.text);


        number.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent number = new Intent(MainActivity.this, Number.class);
                startActivity(number);


            }
        });

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent family = new Intent(MainActivity.this,Family_Members.class);
                startActivity(family);
            }
        });

        colors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colors = new Intent(MainActivity.this,Colors.class);
                startActivity(colors);
            }
        });

        phrases.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrases = new Intent(MainActivity.this,Phrases.class);
                startActivity(phrases);
            }
        });
    }
}
