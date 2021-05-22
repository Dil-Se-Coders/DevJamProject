package com.dilsecoders.intellect_addict;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.dilsecoders.intellect_addict.R;
import com.dilsecoders.intellect_addict.booksactivities.bookAdapter;
import com.dilsecoders.intellect_addict.booksactivities.books;

import java.util.ArrayList;

public class Romantic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romantic);

        ListView listView2 = findViewById(R.id.ListView2);

        ArrayList<books> Romantic = new ArrayList<>();
        Romantic.add(new books(R.drawable.romantic_legendsofspain, "Romantic Legends of Spain"));
        Romantic.add(new books(R.drawable.great_gatsby, "The Great Gatsby"));
        Romantic.add(new books(R.drawable.princess_nobody, "The Princess Nobody"));
        Romantic.add(new books(R.drawable.imperfect_chemistry, "The Imperfect Chemistry"));

        bookAdapter bookAdapter2 = new bookAdapter(this, R.layout.list_row, Romantic);
        listView2.setAdapter(bookAdapter2);

    }
}