		

lien git : https://github.com/omarelfilali/TP2_TP4_POO_API_Outillages.git	
tp2 : 
  Etape 5 :
	- Cherchez une description succincte de chaque d´ependance ajout´ee pour trouver `a quoi sert-elle :
	  	— Web :pour créer des applications Web, y compris RESTful, à l'aide de Spring MVC. il utilise Tomcat comme conteneur intégré par défaut  ;
	  	
		— JPA : Conservez les données dans les magasins SQL avec l'API Java Persistence en utilisant Spring Data et Hibernate;
		
		— Hibernate :Framework open source gérant la persistance des objets en base de données relationnelle;
		
		— H2 :Fournit une base de données en mémoire rapide qui prend en charge l'API JDBC et l'accès R2DBC, avec un faible encombrement (2 Mo). Prend en charge les modes 
		embarqué et serveur ainsi qu'une application de console basée sur un navigateur.
		
		— DevTools :pour fournir des fonctionnalités de temps de développement supplémentaires:
		
		— Thymeleaf :pour créer des applications Web MVC à l'aide des vues Thymeleaf;
	
  Etape 13 
	1. Avec quelle partie du code avons-nous parametre l’url d’appel /greeting ?
		--> @GetMapping("/greeting")
	2. Avec quelle partie du code avons-nous choisi le fichier HTML a afficher ?
		--> return "greeting";
	3. Comment envoyons-nous le nom a qui nous disons bonjour avec le second lien ?	
	En changeant la valeur de "name" dans le lien http://localhost:8080/greeting?nameGET=ENSIM
	
   Etape 17 ´
	Relancez-votre application, retournez sur la console de H2 : http://localhost:8080/
	h2-console. Avez-vous remarqu´e une diff´erence ?  
 	  --> la table ADDress est ajouté dans notre base de donneés.
 	
   Etape 18 ´
	Expliquez l’apparition de la nouvelle table en vous aidant de vos cours sur Hibernate, et de la d´ependance Hibernate de Spring. 
	  -->Hibernate s'occupe de mapper les classes Java sur les tables de la base de données à l'aide de fichiers XML et sans écrire aucune ligne de code.

	Etape 23 ´
	Pouvez-vous trouver `a quoi sert l’annotation @Autowired du code pr´ec´edent sur internet ?
 	    -->L'annotation @Autowired permet d'activer l'injection automatique de dépendance
 	    
 	 Etape 30 ´
	Expliquez la m´ethode que vous avez utilis´e pour ajouter Bootstrap :
	
      --> Ajouter Bootstrap à l'aide de WebJars
    	 Les WebJars sont des bibliothèques front_end packaged dans des fichiers d'archive Java (JAR). Ils nous permettent d'utiliser 
    	des outils de création de projet tels que Maven ou Gradle pour télécharger des dépendances côté client comme  n'importe
		 quelle autre bibliothèque externe.
		 on ajoute la dépendance webjar Bootstrap dans le pom.xml et nous pouvons ajouter des fichiers Bootstrap CSS et JS dans les vues
  
  
  
  
  
 tp4 :
 - Faut-il une cle API pour appeler DarkSky ? 
 	--> Oui, il faut utiliser l'API
 	
 - Quelle URL appeler :
 	--> https://api.meteo-concept.com/api/forecast/daily?token=68b8d2d0ce708d7c6123c61668121e6a3240c04e12afa1c241c1e5cee0f5d4fe&latlng=latVal,lngVal
  
  -Quelle méthode HTTP utiliser ?
  	--> la methode GET 
  	
 — Comment passer les parametres d’appels ?
 	--> en utilisant l'url
 — Ou est l’information dont j’ai besoin dans la reponse :
 		— Pour afficher la temp´erature du lieu vis´e par les coordonnees GPS :
 			-->  tmin et tmax 
 	    — Pour afficher la prevision de meteo du lieu vise par les coordonnees GPS :
 			--> weather