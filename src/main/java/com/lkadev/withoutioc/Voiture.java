package com.lkadev.withoutioc;

public class Voiture {
    private Moteur moteur;
    private Pneu pneu;

    public Voiture() {
        this.moteur = new Moteur("Essence");
        this.pneu = new Pneu("Hiver");
    }

    public void demarrer(){
        moteur.demarrer();
        pneu.rouler();
        System.out.println("La voiture roule avec un moteur " + moteur.getType() + " et des pneus " + pneu.getType());
    }
}
