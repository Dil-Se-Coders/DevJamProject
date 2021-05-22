package com.dilsecoders.intellect_addict;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.dilsecoders.intellect_addict.R;
import com.dilsecoders.intellect_addict.booksactivities.bookAdapter;
import com.dilsecoders.intellect_addict.booksactivities.books;

import java.util.ArrayList;

public class Mystery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mystery);

        ListView listView3 = findViewById(R.id.ListView3);

        ArrayList<books> Mystery = new ArrayList<>();
        Mystery.add(new books(R.drawable.wonderful_wizardofoz, "The Wonderful Wizard of Oz"));
        Mystery.add(new books(R.drawable.thirty_nine_steps, "The Thirty Nine Steps"));
        Mystery.add(new books(R.drawable.harry_potter_6, "Harry Potter and the Half Blood Prince"));
        Mystery.add(new books(R.drawable.harry_potter_3, "Harry Potter and the Prisoner of Azkaban"));
        Mystery.add(new books(R.drawable.harry_potter_2, "Harry Potter and the Chamber of Secrets"));

        bookAdapter bookAdapter3 = new bookAdapter(this, R.layout.list_row, Mystery);
        listView3.setAdapter(bookAdapter3);
    }
}