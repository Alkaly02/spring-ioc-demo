package com.lkadev.withoutioc;

public class Pneu {
    private String type;

    public Pneu(String type) {
        this.type = type;
    }

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
