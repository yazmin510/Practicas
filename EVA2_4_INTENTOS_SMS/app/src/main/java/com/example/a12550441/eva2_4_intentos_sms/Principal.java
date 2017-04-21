package com.example.a12550441.eva2_4_intentos_sms;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class Principal extends AppCompatActivity {
    EditText edTxtTel, edTxtMens;
    Intent inMens;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        edTxtTel = (EditText) findViewById(R.id.edTxtTel);
        edTxtMens = (EditText) findViewById(R.id.edTxtMens);

}
    public void miClick (View v) {
    String stel = edTxtTel.getText().toString();
    stel = "smsto:" +stel;
    String smensa = edTxtMens.getText().toString();
    inMens = new Intent(Intent.ACTION_SENDTO, Uri.parse(stel));
    inMens.putExtra("sms_body", smensa);
    startActivity(inMens);
    }

}