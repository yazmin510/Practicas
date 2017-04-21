package com.example.a12550441.eva2_5_intents_actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Principal extends AppCompatActivity {
    Intent inLanzar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        inLanzar = new Intent (this, Secundaria.class);
    }

    public void onClick (View v) {
        startActivity(inLanzar);
        finish();
    }


}
