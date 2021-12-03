package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalculoUltimo extends AppCompatActivity {
    Button btnVoltar2;
    TextView txtRespNome, txtRespArea, txtRespNomeP, txtResp1, txtResp2,txtResp3, txtResp4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_ultimo);
        Bundle dados = getIntent().getExtras();


        txtRespNome = findViewById(R.id.txtRespNome);
        txtRespNomeP = findViewById(R.id.txtRespNomeP);
        txtRespArea = findViewById(R.id.txtRespArea);

        txtRespNome.setText(dados.getString("nome"));
        txtRespNomeP.setText(dados.getString("nomePro"));
        txtRespArea.setText(dados.getString("areaPro"));

        txtResp1= findViewById(R.id.txtResp1);
        txtResp2= findViewById(R.id.txtResp3);
        txtResp3= findViewById(R.id.txtResp4);
        txtResp4= findViewById(R.id.txtResp4);


        txtResp1.setText(dados.getString("resp1"));
        txtResp2.setText(dados.getString("resp2"));
        txtResp3.setText(dados.getString("resp3"));
        txtResp4.setText(dados.getString("resp4"));

        btnVoltar2 = findViewById(R.id.btnVoltar2);
        btnVoltar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Calculo.class);
                startActivity(intent);
            }
        });

    }
}