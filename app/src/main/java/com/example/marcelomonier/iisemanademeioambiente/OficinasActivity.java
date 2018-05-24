package com.example.marcelomonier.iisemanademeioambiente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class OficinasActivity extends AppCompatActivity {

    CardView card_oficina_1, card_oficina_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oficinas);



        card_oficina_1 = (CardView) findViewById(R.id.card_alana);
        card_oficina_2 = (CardView) findViewById(R.id.card_regia);


    }
}
