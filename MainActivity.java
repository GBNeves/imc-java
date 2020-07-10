package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnCalcularOnClick(View v){

        TextView lblResultado = (TextView)findViewById(R.id.lblResultado);
        EditText txtPeso = (EditText) findViewById(R.id.txtPeso);
        EditText txtAltura = (EditText) findViewById(R.id.txtAltura);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

        float resultado = peso / (altura * altura);
        if(resultado < 19){
            //abaixo
            lblResultado.setText("Abaixo do peso!");
        }
        else if(resultado > 32){
            //obeso
            lblResultado.setText("Acima do peso!");
        }
        else{
            //ok
            lblResultado.setText("Peso ok!");
        }
    }
}