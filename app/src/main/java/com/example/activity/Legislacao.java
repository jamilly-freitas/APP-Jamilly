package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Legislacao extends AppCompatActivity {
    Button btnLei1, btnLei2, btnVoltar3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legislacao);

        btnLei1 = findViewById(R.id.btnLei1);
        btnLei1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.planalto.gov.br/ccivil_03/_ato2011-2014/2012/lei/l12651.htm")));
            }
        });

        btnLei2 = findViewById(R.id.btnLei2);
        btnLei2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.planalto.gov.br/ccivil_03/_ato2011-2014/2012/lei/L12727.htm")));
            }
        });

        btnVoltar3 = findViewById(R.id.btnVoltar3);
        btnVoltar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}