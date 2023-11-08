**README.md**

# Gestion des Patients

Ce projet est une application de gestion des patients développée avec le framework Spring MVC. L'application permet de récupérer un tableau de données à partir d'une base de données sous format tableau HTML, elle permet aussi la recherche des patients spécifiques et la suppression des enregistrements.

## Captures d'écran

### Fonctionnement du Programme
![Page d'accueil](captures/programme.png)



### Page Home
![Page d'accueil](captures/home.png)

### Recherche de patients
![Recherche de patients](captures/SEARCH.png)

### Suppression de patients
![Suppression de patients](captures/delete1.png)

![Page de confirmation de suppression](captures/DELETE.png)

### Configuration de la base de données MySQL
![Configuration de la base de données MySQL](captures/mysql.png)

### Configuration de la base de données H2
![Configuration de la base de données H2](captures/h2.png)

## Fonctionnalités

- Récupération des données à partir d'une base de données.
- Recherche de patients par différents critères.
- Suppression d'enregistrements de la base de données.
- Configuration flexible des bases de données MySQL et H2.


## Configuration de la Base de Données

L'application est configurée pour utiliser H2 par défaut. Si vous souhaitez utiliser MySQL, modifiez les propriétés de la base de données dans le fichier `application.properties` :

![Configuration de la Base de Données](captures/h2_sql.png)


