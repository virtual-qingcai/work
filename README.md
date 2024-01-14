# Système de Prédiction d'Âge - Informations sur les Membres de l'Équipe

## Membres de l'Équipe

### 1. Alex 刘俊 (ID: 1201024050)
   - **Rôle :** Développeur
   - **Responsabilités :**
     - Implémentation de la classe `People` dans le package `people.management.web.data`.
     - Contribution à la conception et à la mise en œuvre de la partie `people-service`.
     - Participer à la gestion des informations liées aux "People".

### 2. Marcel 赵智元 (ID: 1201024051)
   - **Rôle :** Développeur
   - **Responsabilités :**
     - Implémentation de la classe `PeopleResource` dans le package `people.management.web.resource`.
     - Collaboration à la conception et à l'implémentation de la partie `people-service`.
     - Participation à la création et à la gestion des services Web liés aux "People".

### 3. Enzo 吴鸣之 (ID: 1201024055)
   - **Rôle :** Développeur
   - **Responsabilités :**
     - Contribution à l'implémentation de la classe `PeopleService` pour la gestion des informations sur les "People".
     - Participation à la conception et à la réalisation de la partie `people-service`.
     - Intégration et test de la fonctionnalité de prédiction d'âge avec l'API externe.

## Objectif Global
Notre projet a pour objectif la conception d'un système de prédiction d'âge. Ce système analyse les noms des individus via un serveur local et prédit leur âge.

## Composants
Notre code se divise en deux parties : `people-service` et `people-client`.

### Partie `people-service`
1. **people-data**
   - Implémentation de la classe Java `People` dans le package `people.management.web.data`.
   - Utilisation des annotations de liaison XML de Java `@XmlRootElement`.

2. **people-resource**
   - Implémentation de la classe Java `PeopleResource` dans le package `people.management.web.resource`.
   - Classe de ressource JAX-RS pour gérer les requêtes Web liées aux "People".

3. **people-service**
   - Implémentation de la classe Java `PeopleService` pour la gestion des informations sur les "People".

### Partie `people-client`
1. Définition de l'URL de base du service Web lié aux "People".
   ```java
   private static String webServiceUrl = "http://localhost:8080/people.management.web/api/peoples";
   ```

2. Définition de l'URL de base de l'API de prédiction d'âge.
   ```java
   private static String agePredictionUrl = "https://age-prediction.p.rapidapi.com/";
   ```

3. Définition de la clé API nécessaire pour accéder à l'API de prédiction d'âge. Remarque : Remplacez cette clé par votre clé API réelle.
   ```java
   private static String apiKey = "ce29177fc8msh21571b40ebdf7a9p160914jsna39882ebc4c6";
   ```

4. Méthode principale (`main`)
   - Création de deux objets `People` (Alice et Bob).
   - Opérations d'ajout, récupération, suppression et prédiction d'âge.

5. Méthode d'ajout
   ```java
   private static Integer add(String name, Float grade)
   ```

6. Méthode de suppression
   ```java
   private static Boolean delete(Integer id)
   ```

7. Méthode de récupération
   ```java
   private static People get(Integer id)
   ```

8. Méthode de prédiction d'âge
   ```java
   private static void predictAge(String name)
   ```

En résumé, notre système de prédiction d'âge combine ces composants pour réaliser la prédiction d'âge locale et interagir avec un service Web de gestion d'informations sur les personnes.
