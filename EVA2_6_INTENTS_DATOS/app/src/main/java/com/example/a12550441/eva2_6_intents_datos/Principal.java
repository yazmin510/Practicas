package com.example.a12550441.eva2_6_intents_datos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    EditText edTxtNom, edTxtEdad;
    Intent inDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edTxtNom= (EditText)findViewById(R.id.edTxtNom);
        edTxtEdad= (EditText)findViewById(R.id.edTxtEdad);

    }
    public void onClickS (View v){
        String sCade= edTxtNom.getText().toString();
        int iEdad = Integer.parseInt(edTxtEdad.getText().toString());
        inDatos = new Intent (this, Secundaria.class);
        //Agregamos los datos
        inDatos.putExtra("NOMBRE", sCade);
        inDatos.putExtra("EDAD", iEdad);
        startActivity(inDatos);
    }
}
