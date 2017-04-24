package com.example.temporal2.eva2_practica2_restaurantes;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Restaurantes extends AppCompatActivity {

    Intent inMarcar;
    ImageView imVRes;
    TextView txtVRes, txtVDes, txtVTel, txtVDir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        imVRes = (ImageView) findViewById(R.id.imVRes);
        txtVRes = (TextView) findViewById(R.id.txtVRes);
        txtVDes = (TextView) findViewById(R.id.txtVRes);
        txtVDir = (TextView) findViewById(R.id.txtVDir);
        txtVTel = (TextView) findViewById(R.id.txtVTel);

        Intent inDatos = getIntent();

        Bundle bnDatos = inDatos.getExtras();

        imVRes.setImageResource(bnDatos.getInt("IMAGEN", R.drawable.buffalowild));
        txtVRes.setText(bnDatos.getString("RES"));
        txtVTel.setText(bnDatos.getString("TEL"));
        txtVDes.setText(bnDatos.getString("DESC"));
        txtVDir.setText(bnDatos.getString("DIR"));


        txtVTel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sTel = txtVTel.getText().toString();
                sTel = "tel:" + sTel; //URI
                inMarcar = new Intent(Intent.ACTION_CALL, Uri.parse(sTel));
                startActivity(inMarcar);
            }
        });


    }



}
