package com.example.marcelomonier.iisemanademeioambiente;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.ImageView;

public class Programacao2Activity extends AppCompatActivity {


    CardView card0406, card0506, card0606;
    ImageView foto0406, foto0506, foto0606;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programacao2);



        card0406 = (CardView) findViewById(R.id.card1);
        card0506 = (CardView) findViewById(R.id.card2);
        card0606 = (CardView) findViewById(R.id.card3);




        card0406.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Programacao2Activity.this, Programa0406Activity.class);
                startActivity(i);
            }
        });


        card0506.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Programacao2Activity.this, Programa0506Activity.class);
                startActivity(i);
            }
        });


        card0606.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Programacao2Activity.this, Programa0606Activity.class);
                startActivity(i);
            }
        });

    }


    }

