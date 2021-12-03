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
   // private static EditText nome, nomePro, areaPro;
    private String nome, nomePro, areaPro, resp1, resp2, resp3, resp4;

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
                nome  = txtNome.getText().toString();
                nomePro = txtNomePro.getText().toString();
                areaPro = txtAreaPro.getText().toString();

                Intent intent = new Intent(getApplicationContext(), CalculoUltimo.class);
                intent.putExtra("nome",nome);
                intent.putExtra("nomePro",nomePro);
                intent.putExtra("areaPro",areaPro);
                intent.putExtra("resp1",resp1);
                intent.putExtra("resp2",resp2);
                intent.putExtra("resp3",resp3);
                intent.putExtra("resp4",resp4);
                        
                startActivity(intent);
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
                    resp1 = "Lalalalala";
                } else if(checkedId == R.id.rbtnNao1){
                    resp1 = "Lalalalaland";
                }
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rbtnSim2){
                    resp2  = "Lalalalala";
                } else if(checkedId == R.id.rbtnNao2){
                    resp2  = "Lalalalalvsvsa";
                }
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rbtnSim3){
                    resp3 = "Lalalalala";
                } else if(checkedId == R.id.rbtnNao3){
                    resp3  = "Lalalalalannds";
                }
            }
        });

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId == R.id.rbtnSim4){
                    resp4  = "Lalalalala";
                } else if(checkedId == R.id.rbtnNao4){
                    resp4  = "Lalalalalands";
                }
            }
        });
    }

}