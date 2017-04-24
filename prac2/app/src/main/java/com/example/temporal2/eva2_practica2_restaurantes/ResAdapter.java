package com.example.temporal2.eva2_practica2_restaurantes;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ResAdapter extends ArrayAdapter<Datos_Restaurante> {

    Context cnContext;
    int iLayout;
    Datos_Restaurante [] dcMisDatos;

    public ResAdapter(Context context, int resource, Datos_Restaurante[] objects) {
        super(context,resource,objects);

        cnContext = context;
        iLayout = resource;
        dcMisDatos = objects;

    }

    @NonNull
    public View getView(int position, View convertView, ViewGroup parent) {

        View vwFila = convertView; //fila actual a redibujar

        ImageView imageView2;
        TextView txtVRes;
        TextView txtVDes;

        if (vwFila == null) {

            LayoutInflater liMiInflater = ((Activity)cnContext).getLayoutInflater();
            vwFila = liMiInflater.inflate(iLayout,parent,false);

        }

        imageView2 = (ImageView) vwFila.findViewById(R.id.imageView2);
        txtVRes = (TextView) vwFila.findViewById(R.id.txtVRes);
        txtVDes = (TextView) vwFila.findViewById(R.id.txtVRes);


        //Leer los datos
        Datos_Restaurante dcDato = dcMisDatos[position];
        imageView2.setImageResource(dcDato.iImg);
        txtVRes.setText(dcDato.sRes);
        txtVDes.setText(dcDato.sDes);

        return vwFila;

    }

}
