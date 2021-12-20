package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculoUltimo extends AppCompatActivity {
    Button btnVoltar2;
    TextView txtRespNome, txtRespArea, txtRespNomeP, txtResp1, txtResp2,txtResp3, txtResp4, txtPorcent80, txtPorcent35, txtPorcent20,
            txtCurso1, txtCurso2, txtCurso3, txtCurso4, txtCurso5, txtNatu;
    private String porcent80, porcent35, porcent20, curso1, curso2, curso3, curso4, curso5, natu;
    private boolean aux1, aux2, aux3, aux4;

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
        txtResp2= findViewById(R.id.txtResp2);
        txtResp3= findViewById(R.id.txtResp3);
        txtResp4= findViewById(R.id.txtResp4);

        double valor = Double.parseDouble(txtRespArea.getText().toString());

        txtPorcent80 = findViewById(R.id.txtPorcent80);
        txtPorcent35 = findViewById(R.id.txtPorcent35);
        txtPorcent20 = findViewById(R.id.txtPorcent20);
        txtCurso1 = findViewById(R.id.txtCurso1);
        txtCurso2 = findViewById(R.id.txtCurso2);
        txtCurso3 = findViewById(R.id.txtCurso3);
        txtCurso4 = findViewById(R.id.txtCurso4);
        txtCurso5 = findViewById(R.id.txtCurso5);
        txtNatu = findViewById(R.id.txtNatu);

        txtResp1.setText(dados.getString("resp1"));
        aux1 = dados.getBoolean("aux1");
        if(aux1){
            porcent80 = "Se sua propriedade for localizada na área florestal você precisará de"
                    + valor * 0.8 + "hectares reservados para Área de Preservação Permanente";
            porcent35 = "Se sua propriedade for localizada em área fechada você precisará de"
                    + valor * 0.35 + "hectares reservados para Área de Preservação Permanente";
            porcent20 = "Se sua propriedade for localizada na área de campos gerais, você precisará de"
                    + valor * 0.2 + "hectares reservados para Área de Preservação Permanente";
            txtPorcent20.setText(porcent20);
            txtPorcent35.setText(porcent35);
            txtPorcent80.setText(porcent80);
        } else{
            porcent20 =  "Sua propriedade precisará de" + valor * 0.2 + "hectares reservados para Áreas de preservação permanente";
            txtPorcent20.setText(porcent20);
        }

        txtResp2.setText(dados.getString("resp2"));
        aux2 = dados.getBoolean("aux2");
        if(aux2){
            curso1 = "30 (trinta) metros, para cursos d'água com largura inferior a 10 (dez) metros;";
            curso2 = "50 (cinquenta) metros, para cursos d'água com largura de 10 (dez) a 50 (cinquenta) metros;";
            curso3 = "100 (cem) metros, para os cursos d'água com largura de 50 (cinquenta) a 200 (duzentos) metros;";
            curso4 = "200 (duzentos) metros, para os cursos d'água com largura de 200 (duzentos) a 600 (seiscentos) metros;";
            curso5 = "500 (quinhentos) metros, para os cursos d'água com largura superior a 600 (seiscentos) metros;";
            txtCurso1.setText(curso1);
            txtCurso2.setText(curso2);
            txtCurso3.setText(curso3);
            txtCurso4.setText(curso4);
            txtCurso5.setText(curso5);
        }

        txtResp3.setText(dados.getString("resp3"));
        aux3 = dados.getBoolean("aux3");
        if(aux3){
            natu = " 100 (cem) metros, exceto para o corpo d'água com até 20 (vinte) " +
                    "hectares de superfície, cuja faixa marginal será de 50 (cinquenta) metros;";
            txtNatu.setText(natu);
        }
        txtResp4.setText(dados.getString("resp4"));
        aux4 = dados.getBoolean("aux4");

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