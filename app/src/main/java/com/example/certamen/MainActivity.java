package com.example.certamen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText Peso, Estatura, ValorIMC;




    Spinner SpinnerSex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Peso = findViewById(R.id.textPeso);
        Estatura = findViewById(R.id.textEstatura);
        ValorIMC = findViewById(R.id.textIMC);



    }
    public void Calcular (View view){
        String PesoPersona = Peso.getText().toString();
        String EstaturaPersona = Estatura.getText().toString();
        Double Estatura = Double.parseDouble(EstaturaPersona)/100.0;
        Double IMC = Double.parseDouble(PesoPersona) /(Estatura * Estatura);
        if (IMC>18.5){
            Toast.makeText(this, "Estás bajo peso", Toast.LENGTH_SHORT).show();
        } else{
            Toast.makeText(this, "Estás con el peso adecuado", Toast.LENGTH_SHORT).show();
        }

    }



}