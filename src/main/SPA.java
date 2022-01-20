package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tP.Adoptant;
import tP.Animal;
import tP.Benevole;
import tP.Foyer;
import tP.Personne;
import tP.TPFactory;

public class SPA {
	
	private static ArrayList<Foyer> foyers;
	private static TPFactory factory = TPFactory.eINSTANCE;
	private static Scanner sc;
	private static String read;
	private static String mdp = "1234";
	private static String nomFichier="modele_foyer.xmi";
	private static String acr="Action réussi retour au menu";
	private static String aca="Action annulée retour au menu";
	private static String menu="";
	
	public static void CLI() {
		
		XMI.init();
		init();
		
		//je charge les donnees mais je pourrais aussi choisir plus tard
		//XMI.chargement(nomFichier,foyers);
	    while(true) {
	    	System.out.println(menu);
	    	
			read = sc.nextLine();

			switch(read) {
				case"0":
					XMI.sauvegarde(nomFichier,foyers);
					return;
				case"1":
					creerFoyer();
					break;
				case"2":
					postAdoption();
					break;
				case"3":
					setPersonne();
					break;
				case"4":
					adoption();
					break;
				case"5":
					statut();
					break;
				case"6":
					affichage();
					break;
				case"7":
					System.out.println("Ecrire le nom du fichier :");
					nomFichier=sc.nextLine();
					XMI.chargement(nomFichier,foyers);
					break;
				case"8":
					System.out.println("Ancien fichier : "+ nomFichier +"\r\n");
					System.out.println("Ecrire le nouveau nom de fichier :");
					nomFichier=sc.nextLine();
					break;
			}
	    }
	}
	/**
	 * initialise le scanner et le menu
	 */
	public static void init() {
		foyers=new ArrayList<Foyer>();
		sc = new Scanner(System.in);
		read="";
		//Menu en CLI
    	menu = "0) Arreter et enregistrer\r\n"
  			+ "1) creer editer un foyer\r\n"
  			+ "2) ajouter/retirer un animal a l'adoption\r\n"
  			+ "3) ajouter un benevole ou un adoptant\r\n"
  			+ "4) un adoptant adope un animal\r\n"
  			+ "5) changer le statut d'un adoptant\r\n"
  			+ "6) afficher les donnees\r\n"
  			+ "7) charger un fichier\r\n"
  			+ "8) changer nom fichier sauvegarde";
	}
	/**
	 * Creer un nouveau foyer
	 */
	public static void creerFoyer() {
		System.out.println("nom foyer : ");
		read = sc.nextLine();
		Foyer f = factory.createFoyer();
		f.setNom(read);
		System.out.println("ville foyer : ");
		read = sc.nextLine();
		f.setNomVille(read);
		foyers.add(f);
		System.out.println(acr);
	}
	/**
	 * Ajouter ou retirer un animal a l'adoptation
	 */
	public static void postAdoption() {
		Foyer foyer = null;
		System.out.println("nom du foyer concerne : ");
		read = sc.nextLine();
		foyer=getFoyer(read);
		//besoin du foyer ou l'animal sera ou est actuellement
		if(foyer==null) {
			System.out.println("foyer non reconnu retour au menu");
			return;
		}
		System.out.println("Voulez-vous retirer ou ajouter un animal de "+foyer.getNom()+" : r/a");
		read = sc.nextLine();
		if(read.equals("a")) {
			Animal animal = factory.createAnimal();
			System.out.println("nom de l'animal a ajouter : ");
			read = sc.nextLine();
			animal.setNom(read);
			System.out.println("age de l'animal a ajouter : ");
			read = sc.nextLine();
			try {
				animal.setAge(Integer.parseInt(read));
			}catch(Exception e){
				System.out.println("Un nombre etait demande retour au menu");
			}
			System.out.println("Un petit mot sur l'animal ^^ : ");
			read = sc.nextLine();
			animal.setDescription(read);
			foyer.getAnimaux().add(animal);	
			System.out.println(acr);
		}
		else if(read.equals("r")){
			System.out.println("nom de l'animal a retirer : ");
			read = sc.nextLine();
			foyer.getAnimaux().remove(getAnimal(foyer,read));
			System.out.println(acr);
		}else System.out.println(aca);
	}
	/**
	 * Ajoute une personne
	 * il peut s'agir d'un benevole ou d'un adoptant
	 */
	public static void setPersonne() {
		Foyer f = null;
		System.out.println("nom du foyer concerne : ");
		read = sc.nextLine();
		f=getFoyer(read);
		if(f==null) {
			System.out.println("foyer non reconnu retour au menu");
			return;
		}
		Personne a = null;
		System.out.println("Voulez-vous ajouter un Benevole ou un adoptant b/a : ");
		read = sc.nextLine();
		//si c'est un benevole il effectue des taches dans le foer
		if(read.equals("b")) {
			a= factory.createBenevole();
			System.out.println("Metier du benevole : ");
			read = sc.nextLine();
			((Benevole) a).setTache(read);
		}
		//si c'est un adoptant il ne peut pas forcement adopter
		else if(read.equals("a")) {
			System.out.println("L'adoptant peut-il adopter pour l'instant ? o/n");
			read = sc.nextLine();
			a= factory.createAdoptant();
			if(read.equals("o")) ((Adoptant) a).setPeutAdopter(true);
			else ((Adoptant) a).setPeutAdopter(false);
		}
		else {System.out.println(aca);return;} 
		System.out.println("Saisir Nom ?");
		read = sc.nextLine();
		a.setNom(read);
		System.out.println("Saisir prenom ?");
		read = sc.nextLine();
		a.setPrenom(read);
		a.setFoyer(f);
		f.getPersonne().add(a);
		System.out.println(acr);
	}
	/**
	 * adoption d'un animal il faut un benevole qui effectue l'adoption
	 * pour etre sure qu'il n'y est pas de probleme (mdp : 1234)
	 * et l'adoptant avec l'animal
	 */
	public static void adoption() throws ClassCastException {
		Foyer f = null;
		System.out.println("nom du foyer concerne : ");
		read = sc.nextLine();
		f=getFoyer(read);
		if(f==null) {
			System.out.println("foyer non reconnu retour au menu");
			return;
		}
		System.out.println("mot de passe pour le changement de statut :");
		read = sc.nextLine();
		if(!read.equals(mdp)) {
			System.out.println("Kidnaping d'animaux en cours");
			return;
		}
		Benevole t = null;
		Adoptant a = null;
		Animal n = null;
		System.out.println("Prenom du benevole temoin :");
		read = sc.nextLine();
		try{t = (Benevole) getPersonne(f,read);
			if(t==null)
				throw new Exception("Le benevole n'existe "+aca);}
		catch(ClassCastException e){System.out.println("Vous avez besoin d'un benevole pour adopter "+aca);}
		catch(Exception e) {System.out.println(e.toString());return;}
		System.out.println("Prenom de l'adoptant :");
		read = sc.nextLine();
		try{a = (Adoptant) getPersonne(f,read);
			if(a==null)
				throw new Exception("L'adoptant n'existe pas "+aca);
			if(!a.isPeutAdopter())
				throw new Exception("L'adoptant ne peux pas adopter "+aca);
		}
		catch(Exception e) {System.out.println(e.toString());return;}
		System.out.println("nom de l'animal a adopter :");
		read = sc.nextLine();
		n=getAnimal(f,read);
		try{if(n==null)
				throw new Exception("L'animal n'existe pas "+aca);}
		catch(Exception e){System.out.println(e.toString());return;}
		a.setPeutAdopter(false);
		a.getAnimaux().add(n);
		f.getAnimaux().remove(n);
		System.out.println(acr);
	}
	/**
	 * un benevole permet a un adoptant d'adopter
	 */
	public static void statut() {
		Foyer f = null;
		System.out.println("nom du foyer concerne : ");
		read = sc.nextLine();
		f=getFoyer(read);
		if(f==null) {
			System.out.println("foyer non reconnu "+aca);
			return;
		}
		System.out.println("mot de passe pour le changement de statut :");
		read = sc.nextLine();
		if(!read.equals(mdp)) {
			System.out.println("Intrusion");
			return;
		}
		Personne a = null;
		Adoptant b = null;
		System.out.println("Prenom du benevole autorisant le changement de statut :");
		read = sc.nextLine();
		//Verifie qu'un acoptant ne change pas lui meme le statut d'adoption
		try{a = (Benevole) getPersonne(f,read);
			if(a==null)
				throw new Exception("Le benevole n'existe pas "+aca);}
		catch(ClassCastException e){System.out.println("Vous n'etes pas apte a changer votre statut "+aca);}
		catch(Exception e) {System.out.println(e.toString());return;}
		System.out.println("Prenom de l'adoptant :");
		read = sc.nextLine();
		try { b = (Adoptant) getPersonne(f,read);
			if(b==null)
				throw new Exception("L'adoptant n'existe pas");}
		catch(Exception e) {
			System.out.println(e.toString());
		return;}
		System.out.println(a.getNom()+" authorise " + b.getNom()+ " a adopte");
		b.setPeutAdopter(true);
		System.out.println(acr);
	}
	/**
	 * affiche toutes les donnees de chaque foyer
	 * les animaux dans les foyers mais aussi les benevoles et leur tache
	 * ainsi que les animaux adoptes par les adoptants
	 */
	public static void affichage() {
		String delimiter="\r\n_____________________________________";
	    StringBuilder sb= new StringBuilder();
	    for(int i=0; i<foyers.size();i++) {
	    	sb.append(delimiter);
	    	sb.append("\r\n Foyer "+foyers.get(i).getNom() + " :\r\nanimaux: ");
	    	for(int j = 0;j<foyers.get(i).getAnimaux().size();j++) {
	    		sb.append("\r\n"+foyers.get(i).getAnimaux().get(j).getNom() 
	    				+"(age : "+foyers.get(i).getAnimaux().get(j).getAge()
	    				+", description : "+foyers.get(i).getAnimaux().get(j).getDescription()+")"+ " ");
	    	}
	    	sb.append("\r\nbenevoles et adoptants : ");
	    	for(int j = 0;j<foyers.get(i).getPersonne().size();j++) {
	    		Personne personne =  foyers.get(i).getPersonne().get(j);  
	    		sb.append("\r\n"+personne.getNom()+" "+personne.getPrenom()+ " ");
	    		try {
	    			sb.append(((Adoptant)personne).isPeutAdopter()+ " ");
	    			var a = ((Adoptant)personne).getAnimaux();
	    			for(int z=0;z<a.size();z++)
	    				sb.append("("+a.get(z).getNom()+" "+a.get(z).getAge()+" "+a.get(z).getDescription()+")");
	    			}catch(Exception e) {}
	    		try {sb.append(((Benevole)personne).getTache());}catch(Exception e) {}
	    	}
	    }
	    System.out.println(sb);
	}
	/**
	 * cherche le foyer entre et le retourne
	 * @param nomFoyer
	 * @return le foyer
	 */
	private static Foyer getFoyer(String nomFoyer) {
		for(int i=0;i<foyers.size();i++)
			if(foyers.get(i).getNom().equals(nomFoyer))
				return foyers.get(i);
		return null;
	}
	/**
	 * cherche une personne dans un foyer
	 * @param f : foyer auquel la personne est rattache
	 * @param prenomPersonne prenom de la personne
	 * @return la personne
	 */
	private static Personne getPersonne(Foyer f,String prenomPersonne) {
		for(int i=0;i<f.getPersonne().size();i++)
			if(f.getPersonne().get(i).getPrenom().equals(prenomPersonne))
				return f.getPersonne().get(i);
		return null;
	}
	/**
	 * cherche un animal dans un foyer
	 * @param f foyer auquel l'animal est rattache
	 * @param nomAnimal nom de l'animal
	 * @return l'animal
	 */
	private static Animal getAnimal(Foyer f,String nomAnimal) {
		for(int i=0;i<f.getAnimaux().size();i++)
			if(f.getAnimaux().get(i).getNom().equals(nomAnimal))
				return f.getAnimaux().get(i);
		return null;
	}
	/**
	 * pour les tests unitaires
	 * @return la liste des foyers
	 */
	public static ArrayList<Foyer>getList(){
		return foyers;
	}
}