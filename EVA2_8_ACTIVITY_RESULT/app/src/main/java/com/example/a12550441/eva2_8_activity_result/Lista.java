package com.example.a12550441.eva2_8_activity_result;

import android.app.Activity;
import android.content.Intent;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Lista extends AppCompatActivity implements ListView.OnItemClickListener {
    ListView lstVwComida;
    String [] asDatos = {"Tacos", "Tortas", "burritos", "Dogos", "Montados", "Gorditas", "Carne asada", "Quesadillas", "Pollo frito",
            "Enchiladas", "Flautas", "Menudo"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);
        lstVwComida=(ListView)findViewById(R.id.lstVwDatos);
        lstVwComida.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1));
        lstVwComida.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String sVal = asDatos[position];
        Intent inDatos = new Intent();
        inDatos.putExtra("COMIDA", sVal);
        setResult(Activity.RESULT_OK, inDatos);
        finish();
    }
}
