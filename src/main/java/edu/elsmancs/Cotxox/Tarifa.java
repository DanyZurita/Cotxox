/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elsmancs.Cotxox;

/**
 *
 * @author Oxidoc
 */
public class Tarifa {
    private final double costeMilla = 1.35;
    private final double costeMinuto = 0.35;
    private final double costeMinimo = 5.0;
    private final double porcentajeComision = 0.2;
    
    public double getCosteMilla() {
        return this.costeMilla;
    }

    public double getCosteMinuto() {
        return this.costeMinuto;
    }

    public double getCosteMinimo() {
        return this.costeMinimo;
    }

    public double getPorcentajeComision() {
        return this.porcentajeComision;
    }
    
    public double getCosteDistancia(double distancia) {
        double totalCosteDistancia = getCosteMilla() * distancia;
        return totalCosteDistancia;
    }
    
    public double getCosteTiempo(double minutos) {
        double totalCosteTiempo = getCosteMinuto() * minutos;
        return totalCosteTiempo;
    }
    
    public double getCosteTotalEsperado(Carrera carrera) {
        double totalCosteDistancia = getCosteDistancia(carrera.getDistancia());
        double tiempoEsperadoDouble = carrera.getTiempoEsperado();
        double totalCosteTiempo = getCosteTiempo(tiempoEsperadoDouble);
        double totalCosteViaje = totalCosteDistancia + totalCosteTiempo;
        
        if (totalCosteViaje > getCosteMinimo()) {
            return totalCosteViaje;
        }
        else {
            return getCosteMinimo();
        }
        
    }
    
}
