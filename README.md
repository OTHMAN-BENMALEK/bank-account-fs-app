# bank-account-fs-app

### Première Partie : Développer un micro-service
####  - MIcro Service avec Web Service RESTFUL : 

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




####  - Micro-SERVICE wvec web service GRAPHQL :  

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
