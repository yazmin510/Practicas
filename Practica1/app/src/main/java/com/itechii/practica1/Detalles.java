package com.itechii.practica1;

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
        Contactos contactos = (Contactos)intent.getSerializableExtra("objContacto");

        ImageView ivImage = (ImageView)findViewById(R.id.imgVwCon);
        TextView Name = (TextView) findViewById(R.id.txtVwNom);
        TextView Apellido = (TextView) findViewById(R.id.txtVwAp);
        TextView Numero = (TextView) findViewById(R.id.txtVwNum);
        TextView Alias = (TextView) findViewById(R.id.txtAlias);

        ivImage.setImageResource(contactos.getiImg());
        Name.setText("Nombre : " + contactos.getNom());
        Apellido.setText("Apellido : "+contactos.getAp());
        Numero.setText("Numero : "+contactos.getNum());
        Alias.setText("Alias : "+contactos.getAlias());
    }
}
