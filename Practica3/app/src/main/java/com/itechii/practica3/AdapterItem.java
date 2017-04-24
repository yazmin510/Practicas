package com.itechii.practica3;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterItem extends BaseAdapter {
    protected Activity activity;
    protected ArrayList<Materia> items;

    public AdapterItem(Activity activity, ArrayList<Materia> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Materia getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        View v = view;

        if (view == null) {
            LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            v = inf.inflate(R.layout.lista, null);
        }

        Materia materia = items.get(position);

        TextView Asignatura = (TextView) v.findViewById(R.id.txt_Asig);
        Asignatura.setText(materia.getAsignatura());

        ImageView imagen = (ImageView) v.findViewById(R.id.iv_Img);
        imagen.setImageResource(materia.getImage());

        return v;
    }
}
