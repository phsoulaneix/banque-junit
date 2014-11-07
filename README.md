banque-junit
============

JUNIT
---------------------
* A l’aide de JUnit, compléter la classe de test ArgentDAOImplMemoryTest et créer une classe de test pour chacun des beans développé ci-dessus.
* Toutes les possibilités doivent être testées (y compris, validation de paramètres, exceptions, etc...). 
* Implemennter certaine classe pour faire passer les tests au vert pour ArgentDAO.
* Vérifier à l’aide d’Emma que l’ensemble des cas sont couverts (http://www.eclemma.org/installation.html).
* Compléter vos tests si besoin


Mockito 
-------------------
Ajouter la dépendance à Mockito (scope test).
    
On décide à présent d’implémenter BanqueManger, ce service s’appuie sur les DAO précédemment développés. On décide de tester ce service (commencer par la méthode addClient)à l’aide de mocks.
On va donc écrire une test qui s’appuie sur Mockito : qui crée les mocks des DAO et les injecte (dans une méthode @Before)

Aide : http://blog.soat.fr/2013/07/mockito-ou-comment-faciliter-lecriture-de-tests-unitaires/

Base De Données
-----------------
On décide maintenant d’implémenter une version “base de données” de nos DAOs. Ecrire de nouveaux DAOs qui effectue les lectures/ecritures dans une base de données relationnelle (à base de SQL-standard, en utilisant, par exemple, ID pour générer les clés primaires).
Écrire les tests unitaires à base de mocks sur les DAOs préalablement créés.

Nous allons maintenant créer des tests d’intégration. Choisir un SGBDR de votre choix (si possible installé sur votre machine) et importer la dépendance dans votre projet. Créer des tests d’intégration (suffixés IT au lieu de Test) qui effectuent directement les appels (tests boite noire). Pour gérer la base de données, utiliser le plugin maven sql-maven-plugin (http://mojo.codehaus.org/sql-maven-plugin/) afin de gérer l’initialisation de la base de données (drop + création du schéma).