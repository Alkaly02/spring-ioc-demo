package com.lkadev.withoutioc;

public class Moteur {
    private String type;

    public Moteur(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void demarrer(){
        System.out.println("Moteur " + type + " démarré.");
    }
}
