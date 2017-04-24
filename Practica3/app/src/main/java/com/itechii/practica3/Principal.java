package com.itechii.practica3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class Principal extends AppCompatActivity {

    ListView listView;
    ArrayList<Materia> arrMateria;

    Materia[] addMateria= {
            new Materia(R.drawable.isic, "Benny",5,"Arquitectura de Computadoras"),
            new Materia(R.drawable.bd, "Ignacio", 4, "Base de Datos"),
            new Materia(R.drawable.images, "Conchita", 5,"Programación Orientada a Objetos"),
            new Materia(R.drawable.bd, "Talavera", 4, "Taller de base de datos"),
            new Materia(R.drawable.bin, "Miriam", 5,"Sistemas operativos"),
            new Materia(R.drawable.miscimg, "Ilya", 5, "Ingeneria de software")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        listView = (ListView)findViewById(R.id.listView);

        arrMateria= new ArrayList<Materia>(Arrays.asList(addMateria));

        final AdapterItem adapter = new AdapterItem(this, arrMateria);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Materia materia = adapter.getItem(position);

                Toast.makeText(Principal.this,"Iniciar screen de detalle para: \n" + materia.getAsignatura(),
                        Toast.LENGTH_LONG).show();

                Intent intent = new Intent(Principal.this,Detalles.class);
                intent.putExtra("objMateria",materia);
                startActivity(intent);
            }
        });
    }
}
