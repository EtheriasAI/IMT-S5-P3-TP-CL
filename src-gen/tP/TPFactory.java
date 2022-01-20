/**
 */
package tP;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tP.TPPackage
 * @generated
 */
public interface TPFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TPFactory eINSTANCE = tP.impl.TPFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Foyer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foyer</em>'.
	 * @generated
	 */
	Foyer createFoyer();

	/**
	 * Returns a new object of class '<em>Animal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Animal</em>'.
	 * @generated
	 */
	Animal createAnimal();

	/**
	 * Returns a new object of class '<em>Personne</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Personne</em>'.
	 * @generated
	 */
	Personne createPersonne();

	/**
	 * Returns a new object of class '<em>Benevole</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Benevole</em>'.
	 * @generated
	 */
	Benevole createBenevole();

	/**
	 * Returns a new object of class '<em>Adoptant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Adoptant</em>'.
	 * @generated
	 */
	Adoptant createAdoptant();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TPPackage getTPPackage();

} //TPFactory
