package com.dilsecoders.intellect_addict;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class book1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book1);
        PDFView pdfView=findViewById(R.id.pdfView);
        pdfView.fromAsset("wings-of-fire.pdf").load();
    }
}