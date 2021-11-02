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
public class User {
    private int id;
    protected String nom;
    protected String prenom;
    protected String login;
    protected String password;
    protected String role;

    public User() {
    }
    //Update
    public User(int id,String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.id = id;
    }
    //insert
    public User(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }
    
    
    //Insert User

    public User(int id, String nom, String prenom, String login, String password, String role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.password = password;
        this.role = role;
        
    }
    //Delete User

    public User(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    
       
}
