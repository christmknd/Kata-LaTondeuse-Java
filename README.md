# Kata-LaTondeuse-Java

## Fonctionnalités

L'application permet de :

- Initialiser une pelouse de dimensions données.
- Positionner une tondeuse avec une orientation.
- Exécuter une série d'instructions :
  - `G` : pivoter à gauche
  - `D` : pivoter à droite
  - `A` : avancer d'une case
- Empêcher la tondeuse de sortir de la pelouse.
- Retourner la position finale de chaque tondeuse.

## Choix de conception

J'ai choisi d'approcher le projet de la façon suivante : une classe = une tâche ( single responsibility principle)

- **Mower** : orchestre les déplacements de la tondeuse.
- **Orientation** : gère les rotations et le calcul de la prochaine position.
- **Lawn** : vérifie si une position est valide.
- **Position** : représente les coordonnées de la tondeuse.

## Technologies

- Java 17
- Maven
- JUnit

## Exécution des tests

```bash
mvn test
```

## Auteur

Christ Mbombo Mokonda
