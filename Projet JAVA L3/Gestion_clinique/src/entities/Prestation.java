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
public class Prestation extends RendezVous{

    private int codeprestation;
    private String libelle;
    
    //attribut navigationnel
    private  ResponsablePrestation responsablePrestation; 
    
    public Prestation() {
    }

    public Prestation(int codeprestation, String libelle, String datetime) {
        super(datetime, libelle);
        this.codeprestation = codeprestation;
    }

    public Prestation( int codeprestation, int id, String datetime, String libelle) {
        super(id, datetime, libelle);
        this.codeprestation = codeprestation;
    }

    public Prestation(int codeprestation, String libelle) {
        this.codeprestation = codeprestation;
        this.libelle = libelle;
    }



    public int getCodeprestation() {
        return codeprestation;
    }

    public void setCodeprestation(int codeprestation) {
        this.codeprestation = codeprestation;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    
    
}
