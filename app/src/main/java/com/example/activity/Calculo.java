package com.example.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Calculo extends AppCompatActivity {
    Button btnProx1, btnVoltar1;
    RadioGroup rg1, rg2, rg3, rg4;
    RadioButton rbtnSim1, rbtnSim2, rbtnSim3, rbtnSim4, rbtnNao1, rbtnNao2, rbtnNao3, rbtnNao4;
    EditText txtNome, txtNomePro, txtAreaPro;
    private String nome, nomePro, areaPro, resp1, resp2, resp3, resp4;
    private boolean dados, aux1, aux2, aux3, aux4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        txtNome = findViewById(R.id.txtNome);
        txtNomePro = findViewById(R.id.txtNomePro);
        txtAreaPro = findViewById(R.id.txtAreaPro);

        rg1 = findViewById(R.id.rg1);
        rbtnSim1 = findViewById(R.id.rbtnSim1);
        rbtnNao1 = findViewById(R.id.rbtnNao1);

        rg2 = findViewById(R.id.rg2);
        rbtnSim2 = findViewById(R.id.rbtnSim2);
        rbtnNao2 = findViewById(R.id.rbtnNao2);

        rg3 = findViewById(R.id.rg3);
        rbtnSim3 = findViewById(R.id.rbtnSim3);
        rbtnNao3 = findViewById(R.id.rbtnNao3);

        rg4 = findViewById(R.id.rg4);
        rbtnSim4 = findViewById(R.id.rbtnSim4);
        rbtnNao4 = findViewById(R.id.rbtnNao4);



        CriarListenerRadio();

        btnProx1 = findViewById(R.id.btnProx1);
        btnProx1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(dados = true) {
                    nome = txtNome.getText().toString();
                    nomePro = txtNomePro.getText().toString();
                    areaPro = txtAreaPro.getText().toString();

                    Intent intent = new Intent(getApplicationContext(), CalculoUltimo.class);
                    intent.putExtra("nome", nome);
                    intent.putExtra("nomePro", nomePro);
                    intent.putExtra("areaPro", areaPro);
                    intent.putExtra("resp1", resp1);
                    intent.putExtra("resp2", resp2);
                    intent.putExtra("resp3", resp3);
                    intent.putExtra("resp4", resp4);
                    intent.putExtra("aux1", aux1);
                    intent.putExtra("aux2", aux2);
                    intent.putExtra("aux3", aux3);
                    intent.putExtra("aux4", aux4);

                    startActivity(intent);
                }else {

                }
            }
        });

        btnVoltar1 = findViewById(R.id.btnVoltar1);
        btnVoltar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
    private void CriarListenerRadio(){
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rbtnSim1){
                    resp1 = "Propriedade localizada na Amazonia Legal";
                    aux1 = true;
                } else if(checkedId == R.id.rbtnNao1){
                    resp1 = "Propriedade localizada nas demais regiões do País";
                    aux1 = false;
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rbtnSim2){
                    resp2  = "Propriedade que possui cursos d'agua precisam reservar faixa de mata cíliar com largura de:";
                    aux2 = true;
                } else if(checkedId == R.id.rbtnNao2){
                    resp2  = "Propriedade não possui cursos d'agua";
                    aux2 = false;
                }
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rbtnSim3){
                    resp3 = "Propriedade que possui lago ou lagoa natural com largura mínima de:";
                    aux3 = true;
                } else if(checkedId == R.id.rbtnNao3){
                    resp3  = "Propriedade não possui lago ou lagoa natural";
                    aux3 = false;
                }
            }
        });

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rbtnSim4){
                    resp4  = "Propriedade que possui lago ou lagoa ártificial com superfície inferior" +
                            " a 1 (um) hectare, fica dispensada a reserva da faixa de proteção";
                    aux4 = true;
                } else if(checkedId == R.id.rbtnNao4){
                    resp4  = "Propriedade não possui lago ou lagoa ártificial";
                    aux4 = false;
                }
            }
        });
    }

    private boolean checarDados(){
        if(nome.equals("") || nomePro.equals("") || areaPro.equals("") || resp1.equals("") || resp2.equals("") || resp3.equals("") || resp4.equals("")){
            dados = false;
        }else{
            dados = true;
        }
        return dados;
    }
}