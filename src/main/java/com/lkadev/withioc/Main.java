package com.lkadev.withioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.lkadev");
        Voiture voiture = context.getBean(Voiture.class);
        voiture.demarrer();

        System.out.println();
        System.out.println("========================== Avec Annotation ==========================");
        System.out.println();

        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Voiture v = ctx.getBean(Voiture.class);
        v.demarrer();
    }
}
