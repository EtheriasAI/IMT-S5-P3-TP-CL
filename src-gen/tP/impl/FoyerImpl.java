/**
 */
package tP.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tP.Animal;
import tP.Foyer;
import tP.Personne;
import tP.TPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Foyer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tP.impl.FoyerImpl#getPersonne <em>Personne</em>}</li>
 *   <li>{@link tP.impl.FoyerImpl#getAnimaux <em>Animaux</em>}</li>
 *   <li>{@link tP.impl.FoyerImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link tP.impl.FoyerImpl#getNomVille <em>Nom Ville</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FoyerImpl extends MinimalEObjectImpl.Container implements Foyer {
	/**
	 * The cached value of the '{@link #getPersonne() <em>Personne</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonne()
	 * @generated
	 * @ordered
	 */
	protected EList<Personne> personne;

	/**
	 * The cached value of the '{@link #getAnimaux() <em>Animaux</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimaux()
	 * @generated
	 * @ordered
	 */
	protected EList<Animal> animaux;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomVille() <em>Nom Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomVille()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_VILLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomVille() <em>Nom Ville</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomVille()
	 * @generated
	 * @ordered
	 */
	protected String nomVille = NOM_VILLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FoyerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TPPackage.Literals.FOYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Personne> getPersonne() {
		if (personne == null) {
			personne = new EObjectContainmentWithInverseEList<Personne>(Personne.class, this, TPPackage.FOYER__PERSONNE,
					TPPackage.PERSONNE__FOYER);
		}
		return personne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Animal> getAnimaux() {
		if (animaux == null) {
			animaux = new EObjectContainmentWithInverseEList<Animal>(Animal.class, this, TPPackage.FOYER__ANIMAUX,
					TPPackage.ANIMAL__FOYER);
		}
		return animaux;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPPackage.FOYER__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomVille() {
		return nomVille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomVille(String newNomVille) {
		String oldNomVille = nomVille;
		nomVille = newNomVille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPPackage.FOYER__NOM_VILLE, oldNomVille, nomVille));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TPPackage.FOYER__PERSONNE:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getPersonne()).basicAdd(otherEnd, msgs);
		case TPPackage.FOYER__ANIMAUX:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAnimaux()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TPPackage.FOYER__PERSONNE:
			return ((InternalEList<?>) getPersonne()).basicRemove(otherEnd, msgs);
		case TPPackage.FOYER__ANIMAUX:
			return ((InternalEList<?>) getAnimaux()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TPPackage.FOYER__PERSONNE:
			return getPersonne();
		case TPPackage.FOYER__ANIMAUX:
			return getAnimaux();
		case TPPackage.FOYER__NOM:
			return getNom();
		case TPPackage.FOYER__NOM_VILLE:
			return getNomVille();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TPPackage.FOYER__PERSONNE:
			getPersonne().clear();
			getPersonne().addAll((Collection<? extends Personne>) newValue);
			return;
		case TPPackage.FOYER__ANIMAUX:
			getAnimaux().clear();
			getAnimaux().addAll((Collection<? extends Animal>) newValue);
			return;
		case TPPackage.FOYER__NOM:
			setNom((String) newValue);
			return;
		case TPPackage.FOYER__NOM_VILLE:
			setNomVille((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TPPackage.FOYER__PERSONNE:
			getPersonne().clear();
			return;
		case TPPackage.FOYER__ANIMAUX:
			getAnimaux().clear();
			return;
		case TPPackage.FOYER__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case TPPackage.FOYER__NOM_VILLE:
			setNomVille(NOM_VILLE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TPPackage.FOYER__PERSONNE:
			return personne != null && !personne.isEmpty();
		case TPPackage.FOYER__ANIMAUX:
			return animaux != null && !animaux.isEmpty();
		case TPPackage.FOYER__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case TPPackage.FOYER__NOM_VILLE:
			return NOM_VILLE_EDEFAULT == null ? nomVille != null : !NOM_VILLE_EDEFAULT.equals(nomVille);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (nom: ");
		result.append(nom);
		result.append(", nomVille: ");
		result.append(nomVille);
		result.append(')');
		return result.toString();
	}

} //FoyerImpl
