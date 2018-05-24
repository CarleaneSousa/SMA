package com.example.marcelomonier.iisemanademeioambiente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;

public class Programa0606Activity extends AppCompatActivity {


    CardView card0606_1, card0606_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programa0606);

        card0606_1 = (CardView) findViewById(R.id.gincana);
        card0606_2 = (CardView) findViewById(R.id.arraia);



    }
}
