package com.example.a12550441.eva2_7_intentos_bundles;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

public class Principal extends AppCompatActivity {
    EditText edTxtNom, edTxtEdad;
    RadioButton rdBtnMuc;
    Intent inLanzarSec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edTxtNom= (EditText) findViewById(R.id.edTxtNom);
        edTxtEdad= (EditText)findViewById(R.id.edTxtEdad);
        rdBtnMuc= (RadioButton)findViewById(R.id.rdBtnMuc);
    }
    public  void onClickP(View v) {
        //LEER LOS WIDGETS
        String sNom = edTxtNom.getText().toString();
        int iEdad = Integer.parseInt(edTxtEdad.getText().toString());
        boolean bSex = rdBtnMuc.isChecked();
        inLanzarSec = new Intent(this, Secundaria.class);
        //CREAR EK BUNDLE
        Bundle bDatos = new Bundle();
        bDatos.putString("NOMBRE", sNom);
        bDatos.putInt("EDAD", iEdad);
        bDatos.putBoolean("SEXO", bSex);
        // MANDAR EK BUNDLE
        inLanzarSec.putExtras(bDatos);
        startActivity(inLanzarSec);

    }
}
