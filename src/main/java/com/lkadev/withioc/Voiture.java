package com.lkadev.withioc;

import org.springframework.stereotype.Component;

@Component
public class Voiture {
    private final Moteur moteur;
    private final Pneu pneu;

    public Voiture(Moteur moteur, Pneu pneu) {
        this.moteur = moteur;
        this.pneu = pneu;
    }

    public void demarrer(){
        moteur.demarrer();
        pneu.rouler();
        System.out.println("La voiture roule avec un moteur " + moteur.getType() + " et des pneus " + pneu.getType());
    }
}
