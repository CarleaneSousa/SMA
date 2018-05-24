package com.example.marcelomonier.iisemanademeioambiente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Programa0506Activity extends AppCompatActivity {

    CardView card0506_1, card0506_2, card0506_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programa0506);


        card0506_1 = (CardView) findViewById(R.id.card_minicursos);
        card0506_2 = (CardView) findViewById(R.id.card_oficinas);
        card0506_3 = (CardView) findViewById(R.id.card_palestras);



        card0506_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Programa0506Activity.this, MinicursosActivity.class);
                startActivity(i);
            }
        });

        card0506_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Programa0506Activity.this, OficinasActivity.class);
                startActivity(i);
            }
        });

        card0506_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Programa0506Activity.this, PalestrasActivity.class);
                startActivity(i);
            }
        });


    }
}
