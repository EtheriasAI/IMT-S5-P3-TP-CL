# La SPA
## TP noté de Conception Logicielle

> Barthelme Justine
> FIL A1 2021-2024

[![N|Solid](https://fr.github.com/assets/images/logos/desktop-logo.png)](https://github.com/EtheriasAI/tp-foyers)
Vous pouvez trouver le code sur GitHub en cliquant sur le lien

### Presentation
Le projet consiste à reproduire un modèle de la SPA
L'objectif est de permettre d'ajouter des animaux des benevoles et des adoptants pour ensuite permettre une adoption
On peut créer plusieurs foyers si on le souhaite et meme importer des fichiers xmi et les sauvegarder
### Le modele

||
| ------ | 
| 5 classes ( Foyer Animal Personne Benevole Adoptant ) | 
| Les classes Benevole et Adoptant héritent de la classe Personne |
| Les benevoles au foyer auquel il travaille et les adoptant au foyer auquel il s'enregistre et sont suivis par les benevoles (pour savoir s'ils sont aptes à adopter)les animaux sont soient rattachés au foyer auquel il réside soit à l'adoptant s'ils sont adoptés | 
| La liste de foyers est dans la clase statique SPA et les appels de fichier dans la classe statique XMI l'application se lance dans la classe Appli | 
| Une classe de test TestFoyer est disponible |
||

### Comment ça marche

Simple application en CLI qui permet les fonctions suivantes
```sh
- Menu est mis à disposition pour faire plusieurs choix
- Créer des foyers de la SPA et y ajouter des animaux ainsi que des benevoles ou adoptant
- Procéder à une adoption ou permettre à un adoptant d adopter
-Charger un fichier xmi et sauvegarder les donnees dans un nouveau fichier xmi
```
**Un mot de passe est demandé dans l'application entrer 1234**