package model;

import java.util.Set;

public class Professeur extends  Personne implements IProfesseur {

    private Set<String> specialite;

    public Professeur(String nom, String prenom, int annee, String email, Set<String> specialite) {
        super(nom, prenom, annee, email);
        this.specialite = specialite;
    }

    @Override
    public void enseigner() {

    }

    @Override
    public void corrigerExamen() {

    }
}
