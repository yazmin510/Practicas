package com.itechii.practica3;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Materia implements Serializable {
    private int Image;
    private String Asignatura;
    private int Creditos;
    private String Docente;

    public Materia(int image,String docente, int creditos, String asignatura) {
        this.Image = image;
        this.Docente = docente;
        this.Creditos = creditos;
        this.Asignatura = asignatura;
    }

    public String getAsignatura() {
        return Asignatura;
    }

    public int getCreditos() {
        return Creditos;
    }

    public String getDocente() {
        return Docente;
    }

    public int getImage() {
        return Image;
    }
}
