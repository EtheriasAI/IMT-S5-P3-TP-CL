/**
 */
package tP;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Adoptant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tP.Adoptant#isPeutAdopter <em>Peut Adopter</em>}</li>
 *   <li>{@link tP.Adoptant#getAnimaux <em>Animaux</em>}</li>
 * </ul>
 *
 * @see tP.TPPackage#getAdoptant()
 * @model
 * @generated
 */
public interface Adoptant extends Personne {
	/**
	 * Returns the value of the '<em><b>Peut Adopter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Peut Adopter</em>' attribute.
	 * @see #setPeutAdopter(boolean)
	 * @see tP.TPPackage#getAdoptant_PeutAdopter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isPeutAdopter();

	/**
	 * Sets the value of the '{@link tP.Adoptant#isPeutAdopter <em>Peut Adopter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Peut Adopter</em>' attribute.
	 * @see #isPeutAdopter()
	 * @generated
	 */
	void setPeutAdopter(boolean value);

	/**
	 * Returns the value of the '<em><b>Animaux</b></em>' containment reference list.
	 * The list contents are of type {@link tP.Animal}.
	 * It is bidirectional and its opposite is '{@link tP.Animal#getAdoptant <em>Adoptant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animaux</em>' containment reference list.
	 * @see tP.TPPackage#getAdoptant_Animaux()
	 * @see tP.Animal#getAdoptant
	 * @model opposite="adoptant" containment="true" required="true"
	 * @generated
	 */
	EList<Animal> getAnimaux();

} // Adoptant
