package com.dilsecoders.intellect_addict;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.dilsecoders.intellect_addict.R;
import com.dilsecoders.intellect_addict.booksactivities.bookAdapter;
import com.dilsecoders.intellect_addict.booksactivities.books;

import java.util.ArrayList;

public class Fiction extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiction);

        ListView listView5 = findViewById(R.id.ListView5);

        ArrayList<books> Fiction = new ArrayList<>();
        Fiction.add(new books(R.drawable.harry_potter_1, "Harry Potter and the Sorcerer's Stone"));
        Fiction.add(new books(R.drawable.harry_potter_5, "Harry Potter and the Order of Phoenix"));
        Fiction.add(new books(R.drawable.harry_potter_2, "Harry Potter and the Chamber of Secrets"));
        Fiction.add(new books(R.drawable.harry_potter_4,"Harry Potter and the Goblet of Fire"));
        Fiction.add(new books(R.drawable.wonderful_wizardofoz, "The Wonderful Wizard of Oz"));

        bookAdapter bookAdapter5 = new bookAdapter(this, R.layout.list_row, Fiction);
        listView5.setAdapter(bookAdapter5);


    }
}