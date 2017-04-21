package com.example.a12550441.eva2_7_intentos_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
    TextView TxtVwDat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        TxtVwDat=(TextView)findViewById(R.id.TxtVwDat);
        Intent inDatos = getIntent();
        Bundle bDatos = inDatos.getExtras();
        String sNom= bDatos.getString("NOMBRE");
        int iEdad = bDatos.getInt("EDAD", 0);
        boolean bSex = bDatos.getBoolean("SEXO");
        if (bSex)
            TxtVwDat.setText(" NOMBRE: " + sNom + " EDAD: " + iEdad + " Sexo: Mucho");
        else
            TxtVwDat.setText(" NOMBRE: " + sNom + " EDAD: " + iEdad + " Sexo: Poco");
    }
    public void onClickS (View v){

    }
}
