package com.example.temporal2.eva2_practica2_restaurantes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.net.Uri;
import android.widget.TextView;


public class Principal extends AppCompatActivity
        implements ListView.OnItemClickListener{

    Intent inMarcar;
    ImageView imVRes;
    TextView txtVRes, txtVDes, txtVTel, txtVDir;
    ListView listVRes;


    Datos_Restaurante[] adcMisDatosRestaurante = {

            new Datos_Restaurante(R.drawable.buffalowild, "Buffalo Wild Wings", "Alitas", "4134565","Periferico"),
            new Datos_Restaurante(R.drawable.wafflewolf, "WaffleWolf", "Waffles","6144346587", "Fashion Moll"),
            new Datos_Restaurante(R.drawable.traif, "Triaf", "Comida Italiana", "4358798", "Plaza Vaarta"),
            new Datos_Restaurante(R.drawable.thaicafe, "Thai Cafe", "Mariscos y antojitos", "6144238923","Cerveceria"),
            new Datos_Restaurante(R.drawable.mochomoslogofront, "Mochomos", "Cortes", "4131321", "Plaza Sendero"),
            new Datos_Restaurante(R.drawable.homei, "Homei", "Cafe Bar", "4561376", "Paseo Bolivar"),
            new Datos_Restaurante(R.drawable.cafelore, "Cafe Lore", "Cafeteria", "6144674267", "Plaza San Angel"),
            new Datos_Restaurante(R.drawable.barrafina, "Barrafina", "Desayunos", "6144567812","Lomas Universidad"),
            new Datos_Restaurante(R.drawable.upstate, "Upstate", "Alitas", "4275394","D1")


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        listVRes = (ListView)findViewById(R.id.listVRes);

        listVRes.setAdapter(new ResAdapter(this,R.layout.lista_restaurantes,adcMisDatosRestaurante));

        listVRes.setOnItemClickListener(this);



    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        Intent inDetalles = new Intent(this, Restaurantes.class);
        //transferimos
        Bundle bnDatos = new Bundle();
        bnDatos.putInt("IMAGEN", adcMisDatosRestaurante[position].iImg);
        bnDatos.putString("RES", adcMisDatosRestaurante[position].sRes);
        bnDatos.putString("DIR", adcMisDatosRestaurante[position].sDir);
        bnDatos.putString("DESC", adcMisDatosRestaurante[position].sDes);
        bnDatos.putString("TEL", adcMisDatosRestaurante[position].sTel);


        //enviar en el intento
        inDetalles.putExtras(bnDatos);
        startActivity(inDetalles);




    }



}
