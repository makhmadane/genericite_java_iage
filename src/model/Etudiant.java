package model;

import enumumeration.ClasseEnum;

import java.util.concurrent.atomic.AtomicInteger;

public class Etudiant extends Personne implements IEtudiant {
    private String numero;
    private ClasseEnum classe;


    private static AtomicInteger id = new AtomicInteger(1);


    public Etudiant(String nom, String prenom, int annee, String email, ClasseEnum classe) {
        super(nom, prenom, annee, email);
        this.classe = classe;
        this.numero = generateNumero();

    }

    private String generateNumero(){
        return this.nom+
                this.nom.length()+
                (2024-this.annee)+
                "000"+this.id.getAndIncrement();

    }


    @Override
    public void sInscrire() {

    }

    @Override
    public void suivreCours() {

    }

    @Override
    public void passerExamen() {

    }
}
