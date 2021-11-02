/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author Mr Demba Ndiaye
 */
public class RendezVous {
    private int id;
    protected String datetime;
    protected String libelle;
    
    //attribut navigationnel
    private Secretaire secretaire;
    private Patient patient;

    public RendezVous() {
    }

    public RendezVous(int id) {
        this.id = id;
    }

    public RendezVous(String datetime, String libelle) {
        this.datetime = datetime;
        this.libelle = libelle;
    }

    public RendezVous(int id, String datetime, String libelle) {
        this.id = id;
        this.datetime = datetime;
        this.libelle = libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
      
}
