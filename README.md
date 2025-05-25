# TP0 : Tests Unitaires avec JUnit 5

Ce projet contient les solutions pour le TP0 sur les tests unitaires avec JUnit 5, implémentées en Java. L'objectif est d'apprendre à configurer JUnit 5, écrire des tests unitaires, et appliquer le principe du **category class equivalence testing** pour tester des classes Java. Chaque exercice inclut des tests pour détecter et corriger les erreurs dans le code fourni.

## Objectifs
- Installer et configurer JUnit 5 dans IntelliJ IDEA.
- Écrire des tests unitaires avec les annotations et assertions de JUnit 5.
- Utiliser le principe du **category class equivalence testing** pour couvrir les cas valides, invalides, et limites.
- Identifier et corriger les erreurs dans le code via les tests unitaires.
- Gérer un projet avec Git et GitHub.

## Structure du projet
- **src/main/java/com/example/tp0/** : Contient les classes Java :
  - `Calculator.java`
  - `Person.java`
  - `Stack.java`
  - `Fibonacci.java`
  - `Prime.java`
  - `Factorial.java`
  - `BankAccount.java`
  - `Matrix.java`
- **src/test/java/com/example/tp0/** : Contient les classes de test JUnit 5 correspondantes :
  - `CalculatorTest.java`
  - `PersonTest.java`
  - `StackTest.java`
  - `FibonacciTest.java`
  - `PrimeTest.java`
  - `FactorialTest.java`
  - `BankAccountTest.java`
  - `MatrixTest.java`
- **pom.xml** : Fichier de configuration Maven avec les dépendances JUnit 5.
- **README.md** : Ce fichier.


Exercices et tests utilisés

Exercice 1 : Person

Classe : Person (méthodes getFullName, isAdult)
Tests :
getFullName : Prénom et nom valides ("John Doe"), prénom ou nom vide, prénom ou nom null
isAdult : Âge >= 18 (ex. : 18, 25), âge < 18 (ex. : 17, 0), âge négatif

Problèmes détectés :
getFullName : NullPointerException pour prénom ou nom null.
Constructeur : Accepte des âges négatifs.

Corrections :
Ajout de validations dans le constructeur pour interdire null et âges négatifs.

Fichier de test : PersonTest.java


Exercice 2 : Stack

Classe : Stack (méthodes push, pop, peek, isEmpty, size)
Tests :
push : Ajout dans pile vide, ajout multiple, ajout après expansion (11 éléments)
pop : Retrait sur pile non vide, pile vide (IllegalStateException)
peek : Consultation sur pile non vide, pile vide (IllegalStateException)
isEmpty : Pile vide (true), pile non vide (false)
size : Pile vide (0), pile avec éléments (ex. : 2)

Problèmes détectés : Aucun, la classe fonctionne correctement.
Fichier de test : StackTest.java


Exercice 3 : Fibonacci

Classe : Fibonacci (méthode fibonacci)
Tests :
n = 0 → 0
n = 1 → 1
n = 2, 3, 5, 10 → 1, 2, 5, 55
n < 0 → IllegalArgumentException

Problèmes détectés : Débordement d'entier pour grands n (ex. : n > 46).
Corrections : Utilisation de BigInteger pour gérer les grands nombres.
Fichier de test : FibonacciTest.java


Exercice 4 : Prime

Classe : Prime (méthode isPrime)
Tests :
Nombres premiers : 2, 3, 17, 97 → true
Nombres non premiers : 4, 9 → false
Nombres < 2 : 1, 0, -1 → false

Problèmes détectés : Aucun, l'algorithme est correct.
Fichier de test : PrimeTest.java


Exercice 5 : Factorial

Classe : Factorial (méthode factorial)
Tests :
n = 0 → 1
n = 1, 2, 5, 10 → 1, 2, 120, 3_628_800
n < 0 → IllegalArgumentException

Problèmes détectés : Débordement d'entier pour grands n (ex. : n > 12).
Corrections : Utilisation de BigInteger pour gérer les grands nombres.
Fichier de test : FactorialTest.java


Exercice Bonus 1 : BankAccount

Classe : BankAccount (méthodes deposit, withdraw, transfer, addInterest, getBalance)
Tests :
deposit : Montant positif (50.0), négatif ou zéro (IllegalArgumentException)
withdraw : Montant valide (50.0), montant > solde (IllegalStateException), négatif ou zéro (IllegalArgumentException)
transfer : Transfert valide (30.0), compte null (NullPointerException)
addInterest : Taux positif (0.05), taux négatif (IllegalArgumentException)
Constructeur : Solde négatif (IllegalArgumentException)

Problèmes détectés :
Constructeur : Accepte solde négatif.
deposit : Accepte montant = 0.
addInterest : Accepte taux négatif.

Corrections : Validation des paramètres dans le constructeur et deposit.
Fichier de test : BankAccountTest.java


Exercice Bonus 2 : Matrix

Classe : Matrix (méthodes set, get, add, multiply, transpose, toString)
Tests :
set/get : Définition et récupération dans une matrice 2x2
add : Addition de matrices, matrice null (NullPointerException), tailles différentes (IllegalArgumentException)
multiply : Multiplication de matrices, matrice null (NullPointerException), tailles différentes (IllegalArgumentException)
transpose : Transposition d'une matrice 2x2
toString : Format de sortie correct
Constructeur : Taille non positive (IllegalArgumentException)

Problèmes détectés :
Constructeur : Accepte taille <= 0 (NegativeArraySizeException).
set/get : Pas de validation des indices.

Corrections : Validation deічні

System: de la taille et des indices dans Matrix.

Fichier de test : MatrixTest.java


## Auteur:

[BOUKHIBAR Mounir]
