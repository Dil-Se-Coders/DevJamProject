package com.dilsecoders.intellect_addict;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.dilsecoders.intellect_addict.R;
import com.dilsecoders.intellect_addict.booksactivities.bookAdapter;
import com.dilsecoders.intellect_addict.booksactivities.books;

import java.util.ArrayList;

public class Horror extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horror);

        ListView listView6 = findViewById(R.id.ListView6);

        ArrayList<books> Horror = new ArrayList<>();
        Horror.add(new books(R.drawable.frankenstein, "Frankenstein"));
        Horror.add(new books(R.drawable.castle_of_otranto, "The Castle of Otranto"));

        bookAdapter bookAdapter6 = new bookAdapter(this, R.layout.list_row, Horror);
        listView6.setAdapter(bookAdapter6);
    }
}