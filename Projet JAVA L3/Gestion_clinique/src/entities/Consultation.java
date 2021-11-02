/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.List;

/**
 *
 * @author Mr Demba Ndiaye
 */
public class Consultation {
    private int id;
    private int temperature;
    private int tension;
    
    //attribut navigationnel
    private Medecin medecin;
    private Ordenance ordenance;

    public Consultation(int temperature, int tension) {
        this.temperature = temperature;
        this.tension = tension;
    }
    
    public Consultation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTension() {
        return tension;
    }

    public void setTension(int tension) {
        this.tension = tension;
    }

    public Consultation(int id, int temperature, int tension) {
        this.id = id;
        this.temperature = temperature;
        this.tension = tension;
    }
    
}
