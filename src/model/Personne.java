package model;

public class Personne {

    //Attributs
    protected String nom;
    protected String prenom;
    protected int annee;
    protected String email;

    public Personne(String nom, String prenom, int annee, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.annee = annee;
        this.email = email;
    }
}
