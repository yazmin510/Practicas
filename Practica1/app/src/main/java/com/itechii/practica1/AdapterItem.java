package com.itechii.practica1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdapterItem extends BaseAdapter{

    protected Activity activity;
    protected ArrayList<Contactos> items;

    public AdapterItem(Activity activity, ArrayList<Contactos> items) {
        this.activity = activity;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Contactos getItem(int i) {
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
            v = inf.inflate(R.layout.list_item, null);
        }

        Contactos contactos = items.get(position);

        TextView Surname = (TextView) v.findViewById(R.id.tv_surname);
        Surname.setText(contactos.getAp());

        TextView Name = (TextView) v.findViewById(R.id.tv_name);
        Name.setText(contactos.getNom());

        ImageView imagen = (ImageView) v.findViewById(R.id.iv_avatar);
        imagen.setImageResource(contactos.getiImg());

        return v;
    }
}
