package com.example.a12550441.eva2_8_activity_result;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Secundaria extends AppCompatActivity {
    EditText edtTxtDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secundaria);
        edtTxtDatos = (EditText)findViewById(R.id.edtTxtDatos);
    }
    public void onClickS(View v){
        String sDato = edtTxtDatos.getText().toString();
        Intent inDatos = new Intent();
        inDatos.putExtra("DATOS", sDato);
        setResult(Activity.RESULT_OK, inDatos);
        finish();
    }
    public void Cancelar (View v){
        setResult(Activity.RESULT_CANCELED);
        finish();
    }
}
