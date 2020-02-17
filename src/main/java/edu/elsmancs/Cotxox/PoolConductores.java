package edu.elsmancs.Cotxox;

import java.util.ArrayList;


public class PoolConductores {
    private ArrayList<Conductor> poolConductores = new ArrayList<>();
    private Conductor conductor = null;
    
    
    public PoolConductores(ArrayList<Conductor> listaConductores) {
        this.poolConductores = listaConductores;
    }
    
    public Conductor asignarConductor() {
        for (Conductor conductor : this.poolConductores) {
            if (conductor.isLibre()) {
                return conductor;
            }
        }
        return this.conductor;
    }
    
    
}
