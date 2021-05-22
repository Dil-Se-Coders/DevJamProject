package com.dilsecoders.intellect_addict;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.dilsecoders.intellect_addict.R;
import com.dilsecoders.intellect_addict.booksactivities.bookAdapter;
import com.dilsecoders.intellect_addict.booksactivities.books;

import java.util.ArrayList;

public class Thriller extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thriller);

        ListView listView4 = findViewById(R.id.ListView4);

        ArrayList<books> Thriller = new ArrayList<>();
        Thriller.add(new books(R.drawable.harry_potter_1,"Harry Potter and the Sorcerer's Stone"));
        Thriller.add(new books(R.drawable.harry_potter_4,"Harry Potter and the Goblet of Fire"));
        Thriller.add(new books(R.drawable.harry_potter_7,"Harry Potter and the Deathly Hallows Part:1"));
        Thriller.add(new books(R.drawable.harry_potter_8,"Harry Potter and the Deathly Hallows Part:2"));
        Thriller.add(new books(R.drawable.thirty_nine_steps,"The Thirty Nine Steps"));
        Thriller.add(new books(R.drawable.harry_potter_5, "Harry Potter and the Order of Phoenix"));

        bookAdapter bookAdapter4 = new bookAdapter(this, R.layout.list_row, Thriller);
        listView4.setAdapter(bookAdapter4);


    }
}