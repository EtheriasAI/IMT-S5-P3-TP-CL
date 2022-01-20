package main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import tP.Foyer;
import tP.TPPackage;

public class XMI {

	private static ResourceSet rs;
	
	/**
	 * Initialise la ResourceSet pour charger et sauvegarder en XMI
	 */
	public static void init() {
		//XMI
        rs = new ResourceSetImpl();
        rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put(
            "xmi",
            new XMIResourceFactoryImpl()
        );
        rs.getPackageRegistry().put(
            TPPackage.eNS_URI,
            TPPackage.eINSTANCE
        );
	}
	/**
	 * Charge les donnees du fichier selectionne
	 * @param nomFichier fichier avec les donnees
	 * @param foyers liste des foyer qui vont etre charge
	 */
	public static void chargement(String nomFichier, ArrayList<Foyer> foyers) {
        Resource resourceLue = rs.getResource(URI.createFileURI(nomFichier), true);
        foyers.clear();
        for(int i=0;i<resourceLue.getContents().size();i++)
        	foyers.add((Foyer)(resourceLue.getContents().get(i)));
	}
	/**
	 * sauvegarde les donnees
	 * @param nomFichier nom du fichier a enregistrer
	 * @param foyers liste des foyers
	 */
	public static void sauvegarde(String nomFichier, ArrayList<Foyer> foyers) {
        Resource resource = rs.createResource(URI.createFileURI(nomFichier));
        for(int i=0; i<foyers.size();i++) {
	        Foyer racineModele = foyers.get(i);
	        resource.getContents().add(racineModele);
	        try {
	            resource.save(Collections.EMPTY_MAP);
	        }catch (IOException e) {
	            System.out.println("erreur durant la sauvegarde du modèle foyer: " + e.getMessage());
	        }
        }
	}
}
