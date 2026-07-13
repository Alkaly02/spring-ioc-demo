# Spring IoC Demo

Démo comparant la création d'objets **sans** et **avec** l'Inversion de Contrôle (IoC) de Spring.

## Structure

```
src/main/java/com/lkadev/
├── withoutioc/          # Sans IoC — couplage fort
│   ├── Main.java
│   ├── Voiture.java
│   ├── Moteur.java
│   └── Pneu.java
└── withioc/             # Avec IoC — injection de dépendances Spring
    ├── Main.java
    ├── AppConfig.java
    ├── Voiture.java
    ├── Moteur.java
    └── Pneu.java
```

## Sans IoC

`Voiture` instancie elle-même ses dépendances (`Moteur`, `Pneu`) → couplage fort, difficile à tester et à maintenir.

## Avec IoC

Spring gère les dépendances via `@Component` / `@Autowired`. La configuration se fait par annotations dans `AppConfig.java`. → Couplage faible, code plus flexible.

## Exécution

```bash
mvn compile exec:java -Dexec.mainClass="com.lkadev.withoutioc.Main"
mvn compile exec:java -Dexec.mainClass="com.lkadev.withioc.Main"
```
