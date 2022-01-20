/**
 */
package tP;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Animal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tP.Animal#getFoyer <em>Foyer</em>}</li>
 *   <li>{@link tP.Animal#getNom <em>Nom</em>}</li>
 *   <li>{@link tP.Animal#getAge <em>Age</em>}</li>
 *   <li>{@link tP.Animal#getDescription <em>Description</em>}</li>
 *   <li>{@link tP.Animal#getAdoptant <em>Adoptant</em>}</li>
 * </ul>
 *
 * @see tP.TPPackage#getAnimal()
 * @model
 * @generated
 */
public interface Animal extends EObject {
	/**
	 * Returns the value of the '<em><b>Foyer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tP.Foyer#getAnimaux <em>Animaux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foyer</em>' container reference.
	 * @see #setFoyer(Foyer)
	 * @see tP.TPPackage#getAnimal_Foyer()
	 * @see tP.Foyer#getAnimaux
	 * @model opposite="animaux" required="true" transient="false"
	 * @generated
	 */
	Foyer getFoyer();

	/**
	 * Sets the value of the '{@link tP.Animal#getFoyer <em>Foyer</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Foyer</em>' container reference.
	 * @see #getFoyer()
	 * @generated
	 */
	void setFoyer(Foyer value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see tP.TPPackage#getAnimal_Nom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link tP.Animal#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see tP.TPPackage#getAnimal_Age()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Int"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link tP.Animal#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tP.TPPackage#getAnimal_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tP.Animal#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Adoptant</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tP.Adoptant#getAnimaux <em>Animaux</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adoptant</em>' container reference.
	 * @see #setAdoptant(Adoptant)
	 * @see tP.TPPackage#getAnimal_Adoptant()
	 * @see tP.Adoptant#getAnimaux
	 * @model opposite="animaux" required="true" transient="false"
	 * @generated
	 */
	Adoptant getAdoptant();

	/**
	 * Sets the value of the '{@link tP.Animal#getAdoptant <em>Adoptant</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adoptant</em>' container reference.
	 * @see #getAdoptant()
	 * @generated
	 */
	void setAdoptant(Adoptant value);

} // Animal
