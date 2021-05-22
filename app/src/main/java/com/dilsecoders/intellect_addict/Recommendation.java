package com.dilsecoders.intellect_addict;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.dilsecoders.intellect_addict.R;
import com.dilsecoders.intellect_addict.booksactivities.bookAdapter;
import com.dilsecoders.intellect_addict.booksactivities.books;

import java.util.ArrayList;

public class Recommendation extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);

        ListView listView1 = findViewById(R.id.ListView1);

        ArrayList<books> Inspirational = new ArrayList<>();
        Inspirational.add(new books(R.drawable.wings_of_fire, "Wings of Fire"));
        Inspirational.add(new books(R.drawable.modern_mythology, "Modern Mythology"));
        Inspirational.add(new books(R.drawable.princess_nobody, "Princess Nobody"));
        Inspirational.add(new books(R.drawable.power_ofpositivethinking, "Power of Positive Thinking"));
        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });

        bookAdapter bookAdapter1 = new bookAdapter(this, R.layout.list_row, Inspirational);
        listView1.setAdapter(bookAdapter1);


    }
}