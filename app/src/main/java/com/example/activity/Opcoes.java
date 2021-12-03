package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Opcoes extends AppCompatActivity {

    Button btnMapa, btnPlantas, btnVoltar4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opcoes);

        btnPlantas = findViewById(R.id.btnPlantas);
        btnPlantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.embrapa.br/codigo-florestal/especies-nativas-para-recuperacao")));
            }
        });

        btnMapa = findViewById(R.id.btnMapa);
        btnMapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), OpcoesMapa.class);
                startActivity(intent);
            }
        });

        btnVoltar4 = findViewById(R.id.btnVoltar4);
        btnVoltar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}