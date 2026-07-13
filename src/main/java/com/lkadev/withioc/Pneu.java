package com.lkadev.withioc;

import org.springframework.stereotype.Component;

@Component
public class Pneu {
    private String type = "Hiver";

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void rouler(){
        System.out.println("Pneu de type " + type + " roule.");
    }
}
