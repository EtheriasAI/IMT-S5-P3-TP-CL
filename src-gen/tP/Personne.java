/**
 */
package tP;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Personne</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tP.Personne#getFoyer <em>Foyer</em>}</li>
 *   <li>{@link tP.Personne#getNom <em>Nom</em>}</li>
 *   <li>{@link tP.Personne#getPrenom <em>Prenom</em>}</li>
 * </ul>
 *
 * @see tP.TPPackage#getPersonne()
 * @model
 * @generated
 */
public interface Personne extends EObject {
	/**
	 * Returns the value of the '<em><b>Foyer</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link tP.Foyer#getPersonne <em>Personne</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Foyer</em>' container reference.
	 * @see #setFoyer(Foyer)
	 * @see tP.TPPackage#getPersonne_Foyer()
	 * @see tP.Foyer#getPersonne
	 * @model opposite="personne" required="true" transient="false"
	 * @generated
	 */
	Foyer getFoyer();

	/**
	 * Sets the value of the '{@link tP.Personne#getFoyer <em>Foyer</em>}' container reference.
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
	 * @see tP.TPPackage#getPersonne_Nom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link tP.Personne#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Prenom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prenom</em>' attribute.
	 * @see #setPrenom(String)
	 * @see tP.TPPackage#getPersonne_Prenom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getPrenom();

	/**
	 * Sets the value of the '{@link tP.Personne#getPrenom <em>Prenom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prenom</em>' attribute.
	 * @see #getPrenom()
	 * @generated
	 */
	void setPrenom(String value);

} // Personne
