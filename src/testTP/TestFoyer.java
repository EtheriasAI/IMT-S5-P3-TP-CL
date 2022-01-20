package testTP;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import main.SPA;
import main.XMI;
import tP.Animal;
import tP.Foyer;
import tP.Personne;
import tP.TPFactory;
import tP.Adoptant;

class TestFoyer {

	@Test
	void testCLI(){
		/*System.out.println("test ajout de donnees");
		SPA.init();
		SPA.creerFoyer();
		SPA.affichage();
		SPA.postAdoption();
		SPA.setPersonne();*/
	}
	@Test
	void testAdoption() {
		/*setData();
		System.out.println("test d'une adoption");
		SPA.adoption();
		SPA.affichage();*/
	}
	@Test
	void testStatut() {
		setData();
		System.out.println("test d'un changement de statut");
		SPA.statut();
		SPA.affichage();
	}
	@Test
	void testXMI() {
		TPFactory factory = TPFactory.eINSTANCE;
		Foyer foyer = factory.createFoyer();
		ArrayList<Foyer> lesFoyers = new ArrayList<Foyer>();
		lesFoyers.add(foyer);
		lesFoyers.add(foyer);
		XMI.init();
		XMI.sauvegarde("test.xmi",lesFoyers);
		XMI.chargement("test.xmi",lesFoyers);
	}
	void setData() {
		TPFactory factory = TPFactory.eINSTANCE;
		Foyer foyer = factory.createFoyer();
		Personne benevole = factory.createBenevole();
		Personne adoptant = factory.createAdoptant();
		Animal animal = factory.createAnimal();
		foyer.setNom("Skypea");
		benevole.setPrenom("Robin");
		adoptant.setPrenom("Nami");
		animal.setNom("Chopper");
		((Adoptant)adoptant).setPeutAdopter(true);
		foyer.getAnimaux().add(animal);
		foyer.getPersonne().add(adoptant);
		foyer.getPersonne().add(benevole);
		SPA.init();
		SPA.getList().add(foyer);
	}
}
