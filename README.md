# Projet de Prédiction d'Âge

## Objectif Global
Notre projet vise à concevoir un système de prédiction d'âge qui analyse les noms des individus via un serveur local et prédit leur âge.

## Composants
### Partie people-service
#### 1. people-data
Ce code représente une classe Java, nommée `People`, située dans le package `people.management.web.data`. Cette classe utilise les annotations de liaison XML de Java `@XmlRootElement`, indiquant que les instances de cette classe peuvent être converties en format XML.

#### 2. people-resource
Ce code représente une classe Java, nommée `PeopleResource`, située dans le package `people.management.web.resource`. Cette classe est une classe de ressource JAX-RS (Java API for RESTful Web Services), utilisée pour gérer les requêtes Web liées aux "People".

#### 3. people-service
Ce code représente une classe Java, nommée `PeopleService`, utilisée pour gérer les informations relatives aux "People".

### Partie people-client
#### 1. Définition de l'URL de base du service Web lié aux "People".
```java
private static String webServiceUrl = "http://localhost:8080/people.management.web/api/peoples";
```

#### 2. Définition de l'URL de base de l'API de prédiction d'âge.
```java
private static String agePredictionUrl = "https://age-prediction.p.rapidapi.com/";
```

#### 3. Définition de la clé API nécessaire pour accéder à l'API de prédiction d'âge. Remarque : Remplacez cette clé par votre clé API réelle.
```java
private static String apiKey = "ce29177fc8msh21571b40ebdf7a9p160914jsna39882ebc4c6";
```

#### 4. Méthode principale
La méthode principale (`main`) crée deux objets `People` (Alice et Bob) et effectue diverses opérations telles que l'ajout, la récupération, la suppression et la prédiction d'âge.

#### 5. Méthode d'ajout
La méthode `add` est utilisée pour ajouter des informations sur une personne en appelant une requête POST vers le service Web, et elle renvoie l'ID de la personne nouvellement ajoutée.

```java
private static Integer add(String name, Float grade)
```

#### 6. Méthode de suppression
La méthode `delete` est utilisée pour supprimer les informations d'une personne ayant un ID spécifique en appelant une requête DELETE vers le service Web, et elle renvoie un booléen indiquant le succès ou l'échec de l'opération.

```java
private static Boolean delete(Integer id)
```

#### 7. Méthode de récupération
La méthode `get` est utilisée pour récupérer les informations d'une personne ayant un ID spécifique en appelant une requête GET vers le service Web, et elle renvoie l'objet `People` récupéré.

```java
private static People get(Integer id)
```

#### 8. Méthode de prédiction d'âge
La méthode `predictAge` est utilisée pour appeler l'API de prédiction d'âge en construisant et envoyant une requête GET, puis affiche le résultat de la prédiction dans la console.

```java
private static void predictAge(String name)
```

En résumé, le système de prédiction d'âge est constitué de ces composants, permettant la prédiction d'âge locale ainsi que l'interaction avec un service Web de gestion d'informations sur les personnes.
