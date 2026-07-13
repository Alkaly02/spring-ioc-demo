package com.lkadev.withioc;

import org.springframework.stereotype.Component;

@Component
public class Moteur {
    private String type = "Essence";

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
