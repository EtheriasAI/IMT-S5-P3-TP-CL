/**
 */
package tP;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see tP.TPFactory
 * @model kind="package"
 * @generated
 */
public interface TPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "tP";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/tP";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "tP";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TPPackage eINSTANCE = tP.impl.TPPackageImpl.init();

	/**
	 * The meta object id for the '{@link tP.impl.FoyerImpl <em>Foyer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tP.impl.FoyerImpl
	 * @see tP.impl.TPPackageImpl#getFoyer()
	 * @generated
	 */
	int FOYER = 0;

	/**
	 * The feature id for the '<em><b>Personne</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOYER__PERSONNE = 0;

	/**
	 * The feature id for the '<em><b>Animaux</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOYER__ANIMAUX = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOYER__NOM = 2;

	/**
	 * The feature id for the '<em><b>Nom Ville</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOYER__NOM_VILLE = 3;

	/**
	 * The number of structural features of the '<em>Foyer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOYER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Foyer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tP.impl.AnimalImpl <em>Animal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tP.impl.AnimalImpl
	 * @see tP.impl.TPPackageImpl#getAnimal()
	 * @generated
	 */
	int ANIMAL = 1;

	/**
	 * The feature id for the '<em><b>Foyer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__FOYER = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__NOM = 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__AGE = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Adoptant</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL__ADOPTANT = 4;

	/**
	 * The number of structural features of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Animal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANIMAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tP.impl.PersonneImpl <em>Personne</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tP.impl.PersonneImpl
	 * @see tP.impl.TPPackageImpl#getPersonne()
	 * @generated
	 */
	int PERSONNE = 2;

	/**
	 * The feature id for the '<em><b>Foyer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__FOYER = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__NOM = 1;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE__PRENOM = 2;

	/**
	 * The number of structural features of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Personne</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link tP.impl.BenevoleImpl <em>Benevole</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tP.impl.BenevoleImpl
	 * @see tP.impl.TPPackageImpl#getBenevole()
	 * @generated
	 */
	int BENEVOLE = 3;

	/**
	 * The feature id for the '<em><b>Foyer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEVOLE__FOYER = PERSONNE__FOYER;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEVOLE__NOM = PERSONNE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEVOLE__PRENOM = PERSONNE__PRENOM;

	/**
	 * The feature id for the '<em><b>Tache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEVOLE__TACHE = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Benevole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEVOLE_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Benevole</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BENEVOLE_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link tP.impl.AdoptantImpl <em>Adoptant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see tP.impl.AdoptantImpl
	 * @see tP.impl.TPPackageImpl#getAdoptant()
	 * @generated
	 */
	int ADOPTANT = 4;

	/**
	 * The feature id for the '<em><b>Foyer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTANT__FOYER = PERSONNE__FOYER;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTANT__NOM = PERSONNE__NOM;

	/**
	 * The feature id for the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTANT__PRENOM = PERSONNE__PRENOM;

	/**
	 * The feature id for the '<em><b>Peut Adopter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTANT__PEUT_ADOPTER = PERSONNE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Animaux</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTANT__ANIMAUX = PERSONNE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Adoptant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTANT_FEATURE_COUNT = PERSONNE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Adoptant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADOPTANT_OPERATION_COUNT = PERSONNE_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link tP.Foyer <em>Foyer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foyer</em>'.
	 * @see tP.Foyer
	 * @generated
	 */
	EClass getFoyer();

	/**
	 * Returns the meta object for the containment reference list '{@link tP.Foyer#getPersonne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Personne</em>'.
	 * @see tP.Foyer#getPersonne()
	 * @see #getFoyer()
	 * @generated
	 */
	EReference getFoyer_Personne();

	/**
	 * Returns the meta object for the containment reference list '{@link tP.Foyer#getAnimaux <em>Animaux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animaux</em>'.
	 * @see tP.Foyer#getAnimaux()
	 * @see #getFoyer()
	 * @generated
	 */
	EReference getFoyer_Animaux();

	/**
	 * Returns the meta object for the attribute '{@link tP.Foyer#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see tP.Foyer#getNom()
	 * @see #getFoyer()
	 * @generated
	 */
	EAttribute getFoyer_Nom();

	/**
	 * Returns the meta object for the attribute '{@link tP.Foyer#getNomVille <em>Nom Ville</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom Ville</em>'.
	 * @see tP.Foyer#getNomVille()
	 * @see #getFoyer()
	 * @generated
	 */
	EAttribute getFoyer_NomVille();

	/**
	 * Returns the meta object for class '{@link tP.Animal <em>Animal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Animal</em>'.
	 * @see tP.Animal
	 * @generated
	 */
	EClass getAnimal();

	/**
	 * Returns the meta object for the container reference '{@link tP.Animal#getFoyer <em>Foyer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Foyer</em>'.
	 * @see tP.Animal#getFoyer()
	 * @see #getAnimal()
	 * @generated
	 */
	EReference getAnimal_Foyer();

	/**
	 * Returns the meta object for the attribute '{@link tP.Animal#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see tP.Animal#getNom()
	 * @see #getAnimal()
	 * @generated
	 */
	EAttribute getAnimal_Nom();

	/**
	 * Returns the meta object for the attribute '{@link tP.Animal#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see tP.Animal#getAge()
	 * @see #getAnimal()
	 * @generated
	 */
	EAttribute getAnimal_Age();

	/**
	 * Returns the meta object for the attribute '{@link tP.Animal#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see tP.Animal#getDescription()
	 * @see #getAnimal()
	 * @generated
	 */
	EAttribute getAnimal_Description();

	/**
	 * Returns the meta object for the container reference '{@link tP.Animal#getAdoptant <em>Adoptant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Adoptant</em>'.
	 * @see tP.Animal#getAdoptant()
	 * @see #getAnimal()
	 * @generated
	 */
	EReference getAnimal_Adoptant();

	/**
	 * Returns the meta object for class '{@link tP.Personne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personne</em>'.
	 * @see tP.Personne
	 * @generated
	 */
	EClass getPersonne();

	/**
	 * Returns the meta object for the container reference '{@link tP.Personne#getFoyer <em>Foyer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Foyer</em>'.
	 * @see tP.Personne#getFoyer()
	 * @see #getPersonne()
	 * @generated
	 */
	EReference getPersonne_Foyer();

	/**
	 * Returns the meta object for the attribute '{@link tP.Personne#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see tP.Personne#getNom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Nom();

	/**
	 * Returns the meta object for the attribute '{@link tP.Personne#getPrenom <em>Prenom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prenom</em>'.
	 * @see tP.Personne#getPrenom()
	 * @see #getPersonne()
	 * @generated
	 */
	EAttribute getPersonne_Prenom();

	/**
	 * Returns the meta object for class '{@link tP.Benevole <em>Benevole</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Benevole</em>'.
	 * @see tP.Benevole
	 * @generated
	 */
	EClass getBenevole();

	/**
	 * Returns the meta object for the attribute '{@link tP.Benevole#getTache <em>Tache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tache</em>'.
	 * @see tP.Benevole#getTache()
	 * @see #getBenevole()
	 * @generated
	 */
	EAttribute getBenevole_Tache();

	/**
	 * Returns the meta object for class '{@link tP.Adoptant <em>Adoptant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adoptant</em>'.
	 * @see tP.Adoptant
	 * @generated
	 */
	EClass getAdoptant();

	/**
	 * Returns the meta object for the attribute '{@link tP.Adoptant#isPeutAdopter <em>Peut Adopter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Peut Adopter</em>'.
	 * @see tP.Adoptant#isPeutAdopter()
	 * @see #getAdoptant()
	 * @generated
	 */
	EAttribute getAdoptant_PeutAdopter();

	/**
	 * Returns the meta object for the containment reference list '{@link tP.Adoptant#getAnimaux <em>Animaux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Animaux</em>'.
	 * @see tP.Adoptant#getAnimaux()
	 * @see #getAdoptant()
	 * @generated
	 */
	EReference getAdoptant_Animaux();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TPFactory getTPFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link tP.impl.FoyerImpl <em>Foyer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tP.impl.FoyerImpl
		 * @see tP.impl.TPPackageImpl#getFoyer()
		 * @generated
		 */
		EClass FOYER = eINSTANCE.getFoyer();

		/**
		 * The meta object literal for the '<em><b>Personne</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOYER__PERSONNE = eINSTANCE.getFoyer_Personne();

		/**
		 * The meta object literal for the '<em><b>Animaux</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOYER__ANIMAUX = eINSTANCE.getFoyer_Animaux();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOYER__NOM = eINSTANCE.getFoyer_Nom();

		/**
		 * The meta object literal for the '<em><b>Nom Ville</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOYER__NOM_VILLE = eINSTANCE.getFoyer_NomVille();

		/**
		 * The meta object literal for the '{@link tP.impl.AnimalImpl <em>Animal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tP.impl.AnimalImpl
		 * @see tP.impl.TPPackageImpl#getAnimal()
		 * @generated
		 */
		EClass ANIMAL = eINSTANCE.getAnimal();

		/**
		 * The meta object literal for the '<em><b>Foyer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANIMAL__FOYER = eINSTANCE.getAnimal_Foyer();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMAL__NOM = eINSTANCE.getAnimal_Nom();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMAL__AGE = eINSTANCE.getAnimal_Age();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANIMAL__DESCRIPTION = eINSTANCE.getAnimal_Description();

		/**
		 * The meta object literal for the '<em><b>Adoptant</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ANIMAL__ADOPTANT = eINSTANCE.getAnimal_Adoptant();

		/**
		 * The meta object literal for the '{@link tP.impl.PersonneImpl <em>Personne</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tP.impl.PersonneImpl
		 * @see tP.impl.TPPackageImpl#getPersonne()
		 * @generated
		 */
		EClass PERSONNE = eINSTANCE.getPersonne();

		/**
		 * The meta object literal for the '<em><b>Foyer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNE__FOYER = eINSTANCE.getPersonne_Foyer();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__NOM = eINSTANCE.getPersonne_Nom();

		/**
		 * The meta object literal for the '<em><b>Prenom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSONNE__PRENOM = eINSTANCE.getPersonne_Prenom();

		/**
		 * The meta object literal for the '{@link tP.impl.BenevoleImpl <em>Benevole</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tP.impl.BenevoleImpl
		 * @see tP.impl.TPPackageImpl#getBenevole()
		 * @generated
		 */
		EClass BENEVOLE = eINSTANCE.getBenevole();

		/**
		 * The meta object literal for the '<em><b>Tache</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BENEVOLE__TACHE = eINSTANCE.getBenevole_Tache();

		/**
		 * The meta object literal for the '{@link tP.impl.AdoptantImpl <em>Adoptant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see tP.impl.AdoptantImpl
		 * @see tP.impl.TPPackageImpl#getAdoptant()
		 * @generated
		 */
		EClass ADOPTANT = eINSTANCE.getAdoptant();

		/**
		 * The meta object literal for the '<em><b>Peut Adopter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADOPTANT__PEUT_ADOPTER = eINSTANCE.getAdoptant_PeutAdopter();

		/**
		 * The meta object literal for the '<em><b>Animaux</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADOPTANT__ANIMAUX = eINSTANCE.getAdoptant_Animaux();

	}

} //TPPackage
