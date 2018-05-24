package com.example.marcelomonier.iisemanademeioambiente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class MinicursosActivity extends AppCompatActivity {


    CardView cardMinicurso_1, cardMinicurso_2, cardMinicurso_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minicursos);


        cardMinicurso_1 = (CardView) findViewById(R.id.card_minicursos_felipe);
        cardMinicurso_2 = (CardView) findViewById(R.id.card_minicursos_pedro);
        cardMinicurso_3 = (CardView) findViewById(R.id.card_minicursos_joyce);



    }
}
