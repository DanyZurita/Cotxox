package edu.elsmancs.Cotxox;

import java.util.ArrayList;


public class Conductor {

    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private float valioracionMedia = 0;
    private int valoracion;
    private boolean libre = true;
    
    
    public Conductor () {}
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public float getValioracionMedia() {
        return valioracionMedia;
    }

    public void setValioracionMedia(float valioracionMedia) {
        this.valioracionMedia = valioracionMedia;
    }

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }
    
   
}
