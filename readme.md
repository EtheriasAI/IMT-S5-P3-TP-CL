# La SPA
## TP noté de Conception Logicielle

> Barthelme Justine
> FIL A1 2021-2024

[![N|Solid](https://fr.github.com/assets/images/logos/desktop-logo.png)](https://github.com/EtheriasAI/tp-foyers)

Vous pouvez trouver le code sur GitHub en cliquant sur le lien

### Présentation
Le projet consiste à reproduire un modèle de la SPA
L'objectif est de permettre d'ajouter des animaux des bénévoles et des adoptants pour ensuite permettre une adoption
On peut créer plusieurs foyers si on le souhaite et même importer des fichiers xmi et les sauvegarder
### Le modèle

||
| ------ | 
| 5 classes ( Foyer Animal Personne Benevole Adoptant ) | 
| Les classes Benevole et Adoptant héritent de la classe Personne |
| Les bénévoles au foyer auquel ils travaillent et les adoptant au foyer auquel ils s'enregistres et sont suivis par les bénévoles (pour savoir s'ils sont aptes à adopter)les animaux sont soient rattachés au foyer auquel il réside soit à l'adoptant s'ils sont adoptés | 
| La liste de foyers est dans la classe statique SPA et les appels de fichier dans la classe statique XMI l'application se lance dans la classe Appli | 
| Une classe de test TestFoyer est disponible |
||

### Comment ça marche

Simple application en CLI qui permet les fonctions suivantes
```sh
- Un menu est mis à disposition pour faire plusieurs choix
- Créer des foyers de la SPA et y ajouter des animaux ainsi que des bénévoles ou adoptant
- Procéder à une adoption ou permettre à un adoptant d adopter
-Charger un fichier xmi et sauvegarder les données dans un nouveau fichier xmi
```
**Un mot de passe est demandé dans l'application entrer 1234**
