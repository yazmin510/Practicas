package com.example.a12550441.eva2_5_intents_actividades;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Secundaria extends AppCompatActivity {
    Intent inLanzarP;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        inLanzarP = new Intent (this, Principal.class);
    }
    public void onClickS (View v){
        startActivity(inLanzarP);
    }
}
