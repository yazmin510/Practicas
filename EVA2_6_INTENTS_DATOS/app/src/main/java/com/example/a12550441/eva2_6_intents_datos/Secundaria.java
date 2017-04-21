package com.example.a12550441.eva2_6_intents_datos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Secundaria extends AppCompatActivity {
    TextView TxtTwMos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        TxtTwMos=(TextView)findViewById(R.id.TxtTwMos);
        // ACCEDER AL INTENTO QUE LANZO SECUNDARIO
        Intent inDatos = getIntent();
        //ACCEDER AL EXTRA DEL INTENTO
        String sNom = inDatos.getStringExtra("NOMBRE");
        int iEdad = inDatos.getIntExtra("EDAD", 0);
        //USAR EL VALOR
        TxtTwMos.setText((sNom + ", Edad:" + iEdad));
    }
    public void regresar(View v) {
        finish();
    }
}
