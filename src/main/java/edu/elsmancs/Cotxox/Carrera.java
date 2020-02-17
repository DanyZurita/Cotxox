/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elsmancs.Cotxox;


public class Carrera {
    private int tiempoEsperado;
    private int tiempoCarrera = 0;
    private float costeTotal = 0;
    private Conductor conductor;
    private final String tarjeta;
    private String origen;
    private String destino;
    private double distancia;
    private Tarifa tarifa = new Tarifa();
    
    
    public Carrera (String tarjeta){
        this.tarjeta = tarjeta;
    }
    
    public String getTarjetaCredito() {
        return this.tarjeta;
    }
    
    
    public String getOrigen(){
        return this.origen;
    }
    
    public String getDestino(){
        return this.destino;
    }
    
    public double getDistancia(){
        return this.distancia;
    }
    
    public int getTiempoEsperado(){
        return this.tiempoEsperado;
    }
    
    public double getCosteEsperado(){
        return tarifa.getCosteTotalEsperado(this);
    }
    
    public Conductor getConductor() {
        return this.conductor;
    }
    
    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }
    
    public void setOrigen(String origenInput){
        this.origen = origenInput;
    }
    
    public void setDestino(String destinoInput){
        this.destino = destinoInput;
    }
    
    public void setDistancia(double distanciaInput){
        this.distancia = distanciaInput;
    }
    
    public void setTiempoEsperado(int tiempoEsperadoInput){
        this.tiempoEsperado = tiempoEsperadoInput;
    }
    
    public void asignarConductor(PoolConductores conductores) {
            setConductor(conductores.asignarConductor());
    }
}
