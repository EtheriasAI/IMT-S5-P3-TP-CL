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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tP.Adoptant;
import tP.Animal;
import tP.TPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Adoptant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tP.impl.AdoptantImpl#isPeutAdopter <em>Peut Adopter</em>}</li>
 *   <li>{@link tP.impl.AdoptantImpl#getAnimaux <em>Animaux</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AdoptantImpl extends PersonneImpl implements Adoptant {
	/**
	 * The default value of the '{@link #isPeutAdopter() <em>Peut Adopter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPeutAdopter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PEUT_ADOPTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPeutAdopter() <em>Peut Adopter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPeutAdopter()
	 * @generated
	 * @ordered
	 */
	protected boolean peutAdopter = PEUT_ADOPTER_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdoptantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TPPackage.Literals.ADOPTANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPeutAdopter() {
		return peutAdopter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPeutAdopter(boolean newPeutAdopter) {
		boolean oldPeutAdopter = peutAdopter;
		peutAdopter = newPeutAdopter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPPackage.ADOPTANT__PEUT_ADOPTER, oldPeutAdopter,
					peutAdopter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Animal> getAnimaux() {
		if (animaux == null) {
			animaux = new EObjectContainmentWithInverseEList<Animal>(Animal.class, this, TPPackage.ADOPTANT__ANIMAUX,
					TPPackage.ANIMAL__ADOPTANT);
		}
		return animaux;
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
		case TPPackage.ADOPTANT__ANIMAUX:
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
		case TPPackage.ADOPTANT__ANIMAUX:
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
		case TPPackage.ADOPTANT__PEUT_ADOPTER:
			return isPeutAdopter();
		case TPPackage.ADOPTANT__ANIMAUX:
			return getAnimaux();
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
		case TPPackage.ADOPTANT__PEUT_ADOPTER:
			setPeutAdopter((Boolean) newValue);
			return;
		case TPPackage.ADOPTANT__ANIMAUX:
			getAnimaux().clear();
			getAnimaux().addAll((Collection<? extends Animal>) newValue);
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
		case TPPackage.ADOPTANT__PEUT_ADOPTER:
			setPeutAdopter(PEUT_ADOPTER_EDEFAULT);
			return;
		case TPPackage.ADOPTANT__ANIMAUX:
			getAnimaux().clear();
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
		case TPPackage.ADOPTANT__PEUT_ADOPTER:
			return peutAdopter != PEUT_ADOPTER_EDEFAULT;
		case TPPackage.ADOPTANT__ANIMAUX:
			return animaux != null && !animaux.isEmpty();
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
		result.append(" (peutAdopter: ");
		result.append(peutAdopter);
		result.append(')');
		return result.toString();
	}

} //AdoptantImpl
