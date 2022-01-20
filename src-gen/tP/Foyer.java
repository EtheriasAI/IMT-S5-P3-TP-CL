/**
 */
package tP;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foyer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tP.Foyer#getPersonne <em>Personne</em>}</li>
 *   <li>{@link tP.Foyer#getAnimaux <em>Animaux</em>}</li>
 *   <li>{@link tP.Foyer#getNom <em>Nom</em>}</li>
 *   <li>{@link tP.Foyer#getNomVille <em>Nom Ville</em>}</li>
 * </ul>
 *
 * @see tP.TPPackage#getFoyer()
 * @model
 * @generated
 */
public interface Foyer extends EObject {
	/**
	 * Returns the value of the '<em><b>Personne</b></em>' containment reference list.
	 * The list contents are of type {@link tP.Personne}.
	 * It is bidirectional and its opposite is '{@link tP.Personne#getFoyer <em>Foyer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personne</em>' containment reference list.
	 * @see tP.TPPackage#getFoyer_Personne()
	 * @see tP.Personne#getFoyer
	 * @model opposite="foyer" containment="true" required="true"
	 * @generated
	 */
	EList<Personne> getPersonne();

	/**
	 * Returns the value of the '<em><b>Animaux</b></em>' containment reference list.
	 * The list contents are of type {@link tP.Animal}.
	 * It is bidirectional and its opposite is '{@link tP.Animal#getFoyer <em>Foyer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animaux</em>' containment reference list.
	 * @see tP.TPPackage#getFoyer_Animaux()
	 * @see tP.Animal#getFoyer
	 * @model opposite="foyer" containment="true" required="true"
	 * @generated
	 */
	EList<Animal> getAnimaux();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see tP.TPPackage#getFoyer_Nom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link tP.Foyer#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Nom Ville</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom Ville</em>' attribute.
	 * @see #setNomVille(String)
	 * @see tP.TPPackage#getFoyer_NomVille()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getNomVille();

	/**
	 * Sets the value of the '{@link tP.Foyer#getNomVille <em>Nom Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom Ville</em>' attribute.
	 * @see #getNomVille()
	 * @generated
	 */
	void setNomVille(String value);

} // Foyer
