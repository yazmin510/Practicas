package com.example.a12550441.eva2_8_activity_result;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Principal extends AppCompatActivity {
    TextView txtVwDat;
    Intent inPedirDatos, inMostrarLista;
    final static int SECUNDARIA = 1000;
    final static int MI_LISTA = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtVwDat = (TextView) findViewById(R.id.txtVwDat);
        inPedirDatos = new Intent(this, Secundaria.class);
        inMostrarLista = new Intent(this, Lista.class);

    }
    public void onClick(View v){
        startActivityForResult(inPedirDatos, SECUNDARIA);
    }


    public void onCLickLista(View w){
        startActivity(inMostrarLista);
    }

    @Override
    protected void onActivityResult (int requestCode, int resultCode, Intent data){


    super.onActivityResult(requestCode, resultCode, data);
    //AHORITA PROCESAMOS ESTO
    if(requestCode == SECUNDARIA){
        if(resultCode == Activity.RESULT_OK){
            //PROCESAR LOS DATOS
            String sCade = data.getStringExtra("DATOS");
            txtVwDat.setText(sCade);
        }
}else if (requestCode == Activity.RESULT_OK){
        String sCade = data.getStringExtra("COMIDA");
        txtVwDat.setText(sCade);
    }
    }
}