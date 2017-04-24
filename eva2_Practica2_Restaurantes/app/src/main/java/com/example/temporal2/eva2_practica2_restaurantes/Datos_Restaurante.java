package com.example.temporal2.eva2_practica2_restaurantes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Datos_Restaurante  {


    String sRes;
    String sDir;
    String sDes;
    int iImg;
    String sTel;

    public Datos_Restaurante(int iImg, String sRes, String sDes, String sTel, String sDir) {
        this.iImg = iImg;
        this.sRes = sRes;
        this.sDes = sDes;
        this.sTel = sTel;
        this.sDir = sDir;


    }

}
