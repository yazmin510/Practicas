package com.itechii.practica1;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Contactos implements Serializable {

    private int iImg;
    private String Nom;
    private string Ap;
    private String Num;
    private String Alias;

    public Contactos(int iImg, String ap, String nom, String num, String alias) {
        this.iImg = iImg;
        this.Ap = ap;
        this.Nom = nom;
        this.Num = num;
        this.Alias = alias;
    }

    public int getiImg() {
        return iImg;
    }
    public String getNom() {
        return Nom;
    }

    public String getAp() {
        return Ap;
    }

    public String getNum() {
        return Num;
    }

    public String getAlias() {
        return Alias;
    }
}
