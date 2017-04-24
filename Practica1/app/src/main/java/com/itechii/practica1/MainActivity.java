package com.itechii.practica1;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;


public class MainActivity extends AppCompatActivity {

    ImageView imgVwCon;
    TextView txtVwNom, txtVwAp, txtVwNum;
    ListView listView;
    ArrayList<Contactos> arrContactos;

     Contactos[] adcMisContactos = {

             new Contactos(R.drawable.contacto, "Caldera", "Karla", "6141425515","Karliux"),
             new Contactos(R.drawable.image, "Perez", "Carlos", "6141503780","Carlangas"),
             new Contactos(R.drawable.telefonos, "Aragonez", "Manuel", "6141304232","Manni Manito"),
             new Contactos(R.drawable.contacto, "Olivas", "Yadira", "6141336611","Yadis"),
             new Contactos(R.drawable.image, "Sanchez", "Pamela", "6145118495","Dorado"),
             new Contactos(R.drawable.telefonos, "Quezada", "Siara", "6143706724","Sairux"),
             new Contactos(R.drawable.contacto, "Romero", "Carlos", "6143452234","Carlitos"),
             new Contactos(R.drawable.image, "Ruiz", "Fernando", "6142563489","Fernandito"),
             new Contactos(R.drawable.telefonos, "Duarte", "Erick", "6141189237","Scar face"),
             new Contactos(R.drawable.contacto, "Marquez", "Angelica", "6144189365","Anegeliquita")
     };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView)findViewById(R.id.listView);

        arrContactos= new ArrayList<Contactos>(Arrays.asList(adcMisContactos));

        final AdapterItem adapter = new AdapterItem(this, arrContactos);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Contactos currentConctaco = adapter.getItem(position);

                Toast.makeText(MainActivity.this,"Iniciar screen de detalle para: \n" + currentConctaco.getNom(),
                        Toast.LENGTH_LONG).show();

                Intent intent = new Intent(MainActivity.this,Detalles.class);
                intent.putExtra("objContacto",currentConctaco);
                startActivity(intent);
            }
        });
    }
}
