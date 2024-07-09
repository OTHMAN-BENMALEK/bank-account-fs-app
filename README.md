# Othman_Benmalek_Systemes-Distribuees_TP6 :Architectures Micro-services

### Première Partie : Développer un micro-service
####  1) MIcro Service avec Web Service RESTFUL : 

Ajout de 10 comptes et lancement du Service : 

![1)Architecture et utilisation de H2 database et création de 10 comptes](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/0d03f547-addf-4154-ae36-6e8efd1facd9)

La Table de accounts dans H2-DB :

![1-1)Account-db](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/863fd7f9-bf76-419b-a240-23f9ee62acb1)

Ajout de l'annotation @Enumerated pour le type :

![1-2)Ajout de @Enumerated pour le type ](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/905eec7f-9905-4662-8f1a-3b3f46b0b6f6)

Utilisation de RestController et Visualisation des Accounts :

![2)Utilisation de RestController pour récupérer les bankAccounts ](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/cd91e52d-73b1-455b-8fea-4a9e8b1315f0)

Visualisation des Accounts par id :

![2-1)Utilisation de RestController pour visualiser un bankAccount par ID](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/557f81ca-16e7-45b4-843b-9dcd3f95b8c4)

Ajout de dependance de OpenApi et ouvrir Swagger-ui : 

![3)Ajout de dependance de OpenApi et ouvrir Swagger-ui](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/20fb52a8-187e-4d93-be60-3924966f6621)

Ajout d'un compte avec la méthode POST dans Swagger-ui :

![3-1)Ajout d'un compte avec la méthode POST](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/07f8603a-c8fd-4e19-91a0-e47913f481b8)

Résultat : Le compte a été ajouté :

![3-2)Remarque que le compte à était ajouté](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/99ce6e8f-25fb-4a70-b935-335a56566e80)

Réponse de Spring Data Rest :

![3-3)Réponse de Spring Data Rest](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/27026892-b39d-4cd9-8147-1956539f5399)

Nouvelle méthode dans la Repository findbyType :

![3-4)Méthode dans la Repository findbyType](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/1c566dc4-29c2-44cd-a543-492d4ed666d8)

Projection p1 avec id et type ONLY :

![3-5)Projection p1 avec id et type ONLY](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/8d164b84-dd23-4484-a776-a9aa5484fa9b)




####  2) Micro-SERVICE wvec web service GRAPHQL :  

Ajout d'un folder et d'un fichier  graph.qls et rendre graphiql enabled true dans application properties et visualisation sur le lien :

![1)Ajouter d'un folder et d'un fichier  graphqls et ajout rendre graphiql enabled true dans application properties et visualisation sur le lien](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/c25336f7-9be7-445f-8c97-dba1aa2fb9fc)

GraphQL test avec QueryMapping :

![2)GraphQL test avec QueryMapping](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/4cbd46fe-dabf-47df-ad08-8c369a4c8c81)

Ajout d'une deuxième méthode dans le fichier graph.qls : 

![3-1)Essaie de la deuxième méthode ](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/b0c08b2b-9fa0-4ba6-9ad9-35559b0fd4c1)

Résultat :

![3-2)Résultat](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/31e1708d-463f-480e-bb87-a4727cf0612f)

Ajouter un compte :

![3-3)ADDAccount](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/1bbc6840-ad4a-4f5d-8ee4-c57b96059d09)

Ajouter un compte avec les paramètres :

![3-4)AddAccount avec les parametres](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/daf306f6-c56a-4aa0-ad35-87decf003f1f)

Mettre à jour un compte :

![3-5)UpdateAccount ](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/46bf1281-b03b-424f-ac2b-7e77d905b2fc)

Supprimer un Compte :

![3-6)Delete Account](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/5c99c000-5806-479f-bf64-fb577509e162)

Table de Customers et BankAccounts(chaque 10 comptes associé à un customer) :

![4)Table de Customers et BankAccounts(chaque 10 comptes associé à un customer) ](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/acb4036a-e7fd-4739-b9a5-3880e8067182)

Nouvelle liste des comptes :

![5)New accounts list](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/63d93aea-9e7f-4091-a56b-7f85346c8a90)

List des customers avec le balance de leurs comptes :

![6)List des customers avec le balance de leurs comptes](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/d8cd5851-9906-4505-8cea-cdc641b1075b)




### Deuxième Partie :  Développer une architecture micro-service :

Architecture générale de Projet :

![0)Architecture du projet](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/377bc48b-0332-498d-a65a-8893fe07443f)


Création du Micro-service Customer Service :



Premier test du service pour afficher les customers crées :



![1)Premier test de l'app pour affichage de cutomers](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/ca6adc7e-d1b9-41ca-a3cb-8929c99a236e)

Visualisation de la table customer-db :

![1-1)H2-db](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/1e205c0a-3342-4a39-be9d-1470c047eea6)



Création du Micro-service Accounts Service :

Ajout de deux accounts et résultat :

![2)Account service , ajout de deux accounts](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/42ded9fe-ee27-4aee-bac7-3247261bdd89)


Création du Micro-service Gateway Service :

Configuration de application.yml et test pour visualiser les customers :

![3)1)Gateway service to customers](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/dc0cee4a-52f4-4e32-ba51-a6fff73ced29)

Test pour visualiser les accounts :

![3-2)Gateway service to accounts](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/51e495e8-7cee-4a9f-a068-0b2da5c18753)


Création du Micro-service Discovery Service :

Configuration de Eureka et Ajout de l'annotation @EnableEurekaServer et test :

![4)Lancer eureka sur discovery service](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/108920d7-3c32-4ab5-a89e-b7d0470cd930)

Annulation de fichier.yml et utilisation de la méthode DiscoveryClientRouteDefinitionLocator pour avoir les routes des micro-Services :

![4-1)Config de Gateway et suppression de fichier yml ](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/df42e594-ea0f-4c5d-b677-33d956d47170)

Résultat :

![4-2)Resultat ](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/b2d54f35-6d21-4010-9838-4c3160111d6b)



Configuration de Feign , Ajoute de l'annotation @FeignClients et @EnableFeignClients , Ajout des informations de Customer de chacun de leurs compts , création d'une interface CustomerRestClient qui récupere le customer:



![5-1)Config de Feign , Ajoute de l'annotation , Ajout de Customer info in his account , création d'une interface qui récupere le customer](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/cfa7611a-c404-4288-a5f7-849e56b7ce26)

Résultat après Feign config :

![5-2)Résultat après Feign config](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/61c1bade-2d2e-4353-8091-15f034570904)

Ajout resilience 4j dependancy et arreter customerService et faire une méthode default et ajouter un circuit breaker :

![6)Ajouter resilience 4j dependancy et arreter customerService et faire une méthode default et ajouter un circuit breaker ](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/e3044c7a-8d8e-4b54-bf52-8826768faf08)

Finalement chaque compte te donne leur customer :

![7)Finalement chaque compte te donne leur customer](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/a663620e-4f73-4ee6-b952-9631985bae6c)

Crée une git repo et ajout des fichiers .properties :

![8)Crée une git repo ](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/cbdca92e-998b-4afa-b643-3e8e50df863a)

Utilisation de /default pour voir le contenu de customer-service.properties :

![8-1)Résultat de config service ](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/04b90b72-6faa-45ce-9935-4a80ecaabe31)



Test si le customerService récupére les params à partir de localHost 9999 de leur fichier de config :



![8-2)Test si le customerService récupére les params à partir de localHost 9999 de leur fichier de config](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/06c00586-7e16-4392-97a4-6aa62c86e657)



On a changé p1 et p2 , mais la config n'a pas été mis à jour , donc on a envoyé une requete post pour rafraichir les params :



![8-3)On a changé p1 et p2 , mais la config n'a pas été mis à jour , donc on a envoyé une requete post pour rafraichir les params](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/06e4062c-ebd0-4697-920f-108d9706d1e3)



Ajout des fichiers de configuration dans un repo Github, on change dans les fichiers.properties et on commit et on push et on vérifie si les parms seront à jour en utilisant une requéte HTTP :



![9)Adding the config into a repo in github , making changes in properties files and commit and pushing and checking if it changed using a http request ](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/33cfbfda-854b-4e4a-99ea-be7edc761ae3)

Nouvelles Valeurs après le Push :

![9-1)New values after pushing](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/70127de5-232e-41d2-b0ab-e6ee8bd732d6)



Ajouter un fichier docker et utiliser mvn package pour générer le fichier jar:


![10)Ajouter un fichier docker et utiliser mvn package pour générer le fichier jar](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/46c29edc-d0f2-4a68-8458-92f1e769b35d)



Ajout de Docker file dans tous les services et utilisation de la command pour créer une image :



![11)Ajout de Docker file dans tous les services et utilisation de la command pour créer une image](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/0ff2ffe3-f90f-4a7e-beb1-2c04378f9b0c)


On trouve notre Docker image avec la commande Docker images :


![11-1)On trouve notre Docker image avec la commande Docker images](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/fc8b0b3d-6edf-485a-ba0e-a0fd744aedc6)

On lance le Conteneur :

![11-2)Lancer le conteneur](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/87bcde25-98be-4d80-99c5-c3158402a2cf)


Commande pour activer le containeur en arrière plan et affichage des conteneurs actives:


![11-3)Commande pour activer le containeur en arrière plan et affichage des conteneurs actives](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/20747e2c-f24f-4f0f-bacc-7b1d11a4d228)

Arréter le conteneur :

![11-4)Arréter le conteneur](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/045d51fb-c6a2-4b1a-91a5-0a91811218ff)


On télécharge l'image de mysql en utilisant run (qui utilise pull en premier et puis il l'active) :


![11-5)On télécharge l'image de mysql en utilisant run (qui utilise pull en premier et puis il l'active)](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/218e61f8-a6d8-4045-9438-3d15f1c71750)

Utiliser la commande Docker compose up pour lancer le Docker-compose yml :

![11-6)Utiliser la commande Docker compose up pour lancer le Docker-compose yml](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/55bc12e8-499b-4d36-9672-75f704e0c463)

Résultat :

![11-7)Final](https://github.com/OTHMAN-BENMALEK/bank-account-fs-app/assets/159661363/73c59ed8-e052-4a21-8908-19f0306f0c96)


