package com.itechii.practica3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        Intent intent = getIntent();
        Materia materia = (Materia) intent.getSerializableExtra("objMateria");

        ImageView Image = (ImageView)findViewById(R.id.iv_prof);
        TextView Asignatura = (TextView) findViewById(R.id.tv_asig);
        TextView Creditos = (TextView) findViewById(R.id.tv_cre);
        TextView Docente = (TextView) findViewById(R.id.tv_Doc);

        Image.setImageResource(materia.getImage());
        Asignatura.setText(materia.getAsignatura());
        Creditos.setText(""+materia.getCreditos());
        Docente.setText(materia.getDocente());

    }
}
