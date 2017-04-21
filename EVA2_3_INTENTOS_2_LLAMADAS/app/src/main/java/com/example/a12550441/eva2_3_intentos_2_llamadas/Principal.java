package com.example.a12550441.eva2_3_intentos_2_llamadas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Principal extends AppCompatActivity {
    EditText txtTel;
    Intent inLlamar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        txtTel = (EditText)findViewById(R.id.txtTel);
    }
    public void onClick(View v){
        String stel = txtTel.getText().toString();
        stel = "tel: " + stel;
        inLlamar = new Intent(Intent.ACTION_CALL, Uri.parse(stel));
        startActivity(inLlamar);
    }
}
