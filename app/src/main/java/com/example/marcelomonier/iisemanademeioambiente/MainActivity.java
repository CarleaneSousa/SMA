package com.example.marcelomonier.iisemanademeioambiente;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    DataBaseHelper myDb;
    ImageView logo, nome_logo;
    EditText matricula, senha;
    Button btn_enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        matricula = (EditText) findViewById(R.id.edit_matricula);
        senha = (EditText) findViewById(R.id.edit_senha);

        btn_enviar = (Button) findViewById(R.id.button_enviar);


        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(i);

//                String m = matricula.getText().toString();
//                String s = senha.getText().toString();
//
//
//                Cursor res_Matricula = myDb.getMatricula();
//                Cursor res_Senha = myDb.getMatricula();
//
//                String mf = res_Matricula.toString();
//                String sf = res_Senha.toString();
//
//                StringBuffer stringBuffer = new StringBuffer();
//
//                if (mf == m && sf == s){
//
//                    Intent i = new Intent(MainActivity.this, MenuActivity.class);
//                    startActivity(i);
//
//                } else{
//
//                }




            }
        });



    }
}
