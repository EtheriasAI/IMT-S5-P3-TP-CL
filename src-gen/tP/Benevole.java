/**
 */
package tP;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Benevole</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tP.Benevole#getTache <em>Tache</em>}</li>
 * </ul>
 *
 * @see tP.TPPackage#getBenevole()
 * @model
 * @generated
 */
public interface Benevole extends Personne {
	/**
	 * Returns the value of the '<em><b>Tache</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tache</em>' attribute.
	 * @see #setTache(String)
	 * @see tP.TPPackage#getBenevole_Tache()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getTache();

	/**
	 * Sets the value of the '{@link tP.Benevole#getTache <em>Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tache</em>' attribute.
	 * @see #getTache()
	 * @generated
	 */
	void setTache(String value);

} // Benevole
