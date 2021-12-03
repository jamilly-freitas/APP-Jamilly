package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalculoUltimo extends AppCompatActivity {
    Button btnVoltar2;
    //EditText txtRespNome, txtRespArea, txtRespNomeP, txtResp1, txtResp2,txtResp3, txtResp4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_ultimo);

//        txtRespNome.findViewById(R.id.txtRespNome);
//        txtRespNomeP.findViewById(R.id.txtRespNomeP);
//        txtRespArea.findViewById(R.id.txtRespArea);
//
//        txtResp1.findViewById(R.id.txtResp1);
//        txtResp2.findViewById(R.id.txtResp3);
//        txtResp3.findViewById(R.id.txtResp4);
//        txtResp4.findViewById(R.id.txtResp4);

//        txtRespNome.setText(Calculo.nome.toString());
//        txtRespNomeP.setText(Calculo.nomePro.toString());
//        txtRespArea.setText(Calculo.areaPro.toString());
//        txtResp1.setText(Calculo.resp1.toString());
//        txtResp2.setText(Calculo.resp2.toString());
//        txtResp3.setText(Calculo.resp3.toString());
//        txtResp4.setText(Calculo.resp4.toString());

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