package edu.elsmancs.Cotxox;

import java.util.ArrayList;


public class Conductor {

    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private double valoracionMedia = 0.0;
    private byte valoracion;
    private boolean libre = true;
    private ArrayList<Byte> valoraciones = new ArrayList<>();
    
    
    public Conductor (String nombre) {
        this.nombre = nombre;
    }
    
    
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

    public double getValoracionMedia() {
        return valoracionMedia;
    }

    public void setValoracionMedia(float valoracionMedia) {
        this.valoracionMedia = valoracionMedia;
    }

    public double getValoracion() {
        return valoracionMedia;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }
    
   public int getNumeroValoraciones() {
        return this.valoraciones.size();
    }

    public void setValoracion(byte valoracion) {
        this.valoraciones.add(valoracion);
        this.calcularValoracionMedia();
    }

    private double calcularValoracionMedia() {
        int totalValoracionMedia = 0;
        for (byte valor : this.valoraciones) {
                totalValoracionMedia += valor;
        }
        
        this.valoracionMedia = (double) totalValoracionMedia / getNumeroValoraciones();
        return this.valoracionMedia;
    }
}
