package com.example.marcelomonier.iisemanademeioambiente;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.widget.ImageView;

public class Programa0406Activity extends AppCompatActivity {


    CardView card0406_1, card0406_2, card0406_3;
    ImageView foto0406, foto0506, foto0606;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_programa0406);

        card0406_1 = (CardView) findViewById(R.id.ciclismo);
        card0406_2 = (CardView) findViewById(R.id.coffe_break);
        card0406_3 = (CardView) findViewById(R.id.mesa_redonda);



    }
}
