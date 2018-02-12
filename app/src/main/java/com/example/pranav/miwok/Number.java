package com.example.pranav.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Number extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Numberlist> numberlists = new ArrayList<Numberlist>();
        numberlists.add(new Numberlist("lutti", "one", R.drawable.miwok));
        numberlists.add(new Numberlist("otiiko", "two", R.drawable.miwok));
        numberlists.add(new Numberlist("tolookosu", "three", R.drawable.miwok));
        numberlists.add(new Numberlist("oyyisa", "four", R.drawable.miwok));
        numberlists.add(new Numberlist("massokka", "five", R.drawable.miwok));
        numberlists.add(new Numberlist("temmokka", "six", R.drawable.miwok));
        numberlists.add(new Numberlist("kenekaku", "seven", R.drawable.miwok));
        numberlists.add(new Numberlist("kawinta", "eight", R.drawable.miwok));
        numberlists.add(new Numberlist("wo'e", "nine", R.drawable.miwok));
        numberlists.add(new Numberlist("na'aacha", "ten", R.drawable.miwok));
        numberlists.add(new Numberlist("lutti", "one", R.drawable.miwok));
        numberlists.add(new Numberlist("otiiko", "two", R.drawable.miwok));
        numberlists.add(new Numberlist("tolookosu", "three", R.drawable.miwok));
        numberlists.add(new Numberlist("oyyisa", "four", R.drawable.miwok));
        numberlists.add(new Numberlist("massokka", "five", R.drawable.miwok));
        numberlists.add(new Numberlist("temmokka", "six", R.drawable.miwok));
        numberlists.add(new Numberlist("kenekaku", "seven", R.drawable.miwok));
        numberlists.add(new Numberlist("kawinta", "eight", R.drawable.miwok));
        numberlists.add(new Numberlist("wo'e", "nine", R.drawable.miwok));
        numberlists.add(new Numberlist("na'aacha", "ten", R.drawable.miwok));


        NumberlistAdopter numberAdapter = new NumberlistAdopter(this, numberlists);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_words);
        listView.setAdapter(numberAdapter);
    }
}
