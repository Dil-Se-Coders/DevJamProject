package com.dilsecoders.intellect_addict;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
        public void InspirationPg(View view){
            Intent intent1 = new Intent(MainActivity2.this, Recommendation.class);
            startActivity(intent1);

        }
        public void RomanticPg (View view){
            Intent intent2 = new Intent(MainActivity2.this, Romantic.class);
            startActivity(intent2);

        }
        public void MysteryPg (View view){
            Intent intent3 = new Intent(MainActivity2.this, Mystery.class);
            startActivity(intent3);

        }
        public void ThrillerPg (View view){
            Intent intent4 = new Intent(MainActivity2.this, Thriller.class);
            startActivity(intent4);

        }
        public void FictionPg (View view){
            Intent intent5 = new Intent(MainActivity2.this, Fiction.class);
            startActivity(intent5);

        }
        public void HorrorPg (View view){
            Intent intent6 = new Intent(MainActivity2.this, Horror.class);
            startActivity(intent6);

        }
}
