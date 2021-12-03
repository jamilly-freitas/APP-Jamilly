package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnCalculo, btnOpc, btnLegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalculo = findViewById(R.id.btnCalculo);
        btnCalculo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculo.class);
                startActivity(intent);
            }
        });

        btnLegis = findViewById(R.id.btnLegis);
        btnLegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Legislacao.class);
                startActivity(intent);
            }
        });

        btnOpc = findViewById(R.id.btnOpc);
        btnOpc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Opcoes.class);
                startActivity(intent);
            }
        });

    }
}