package com.example.thais.desafio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

        Button btn1;
        ImageView jogador1;
        ImageView jogador2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        jogador1 = findViewById(R.id.jogador1);
        jogador2 = findViewById(R.id.jogador2);
    }

    public void jogar(View view) {
        int dado1 = 0;
        int dado2 = 0;
        Random rand = new Random();

        dado1 = rand.nextInt(6);
        dado2 = rand.nextInt(6);

        int[] imgDado = {
            R.drawable.icon,
            R.drawable.icon2,
            R.drawable.icon3,
            R.drawable.icon4,
            R.drawable.icon5,
            R.drawable.icon6
        };

        switch(dado1){
            case 1:
                jogador1.setImageResource(imgDado[1]);
                break;
            case 2:
                jogador1.setImageResource(imgDado[2]);
                break;
            case 3:
                jogador1.setImageResource(imgDado[3]);
                break;
            case 4:
                jogador1.setImageResource(imgDado[4]);
                break;
            case 5:
                jogador1.setImageResource(imgDado[5]);
                break;
            case 6:
                jogador1.setImageResource(imgDado[6]);
                break;
        }
        switch(dado2){
            case 1:
                jogador2.setImageResource(imgDado[1]);
                break;
            case 2:
                jogador2.setImageResource(imgDado[2]);
                break;
            case 3:
                jogador2.setImageResource(imgDado[3]);
                break;
            case 4:
                jogador2.setImageResource(imgDado[4]);
                break;
            case 5:
                jogador2.setImageResource(imgDado[5]);
                break;
            case 6:
                jogador2.setImageResource(imgDado[6]);
                break;
        }

        if(dado1 > dado2){
            Toast.makeText(this,"O jogador 1 venceu!", Toast.LENGTH_LONG).show();
        }if(dado2 > dado1){
            Toast.makeText(this,"O jogador 2 venceu!", Toast.LENGTH_LONG).show();
        }else{
            Toast.makeText(this,"Empate!", Toast.LENGTH_LONG).show();
        }
    }
}
