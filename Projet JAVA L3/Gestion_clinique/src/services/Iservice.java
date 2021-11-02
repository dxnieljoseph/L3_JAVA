/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.Consultation;
import entities.Patient;
import entities.RendezVous;
import entities.User;
import java.util.List;

/**
 *
 * @author Mr Demba Ndiaye
 */
public interface Iservice {
    //Patient
    public abstract int addPatient();
    public boolean findByIdPatient(int id);
    public boolean searchPatientById(int id);
    public Patient askRendezVous(String libelle, String date);
    public List<RendezVous> showAllRendezVous();
    
    public List<RendezVous> showRendezVousByLibelle(String libelle);
    
    
    //Medecin
    public boolean searchDossierMedicalPatientById(int id);
    public List<RendezVous> showRendezVousByLibelleAndDate(String libelle, String date);
    public abstract int showDetailsConsultationById(int id);
    
    
    
    
    
    
    
    
    
    
    /*Se connecter */
    public User login(String login,String password);
      
    
    
}
