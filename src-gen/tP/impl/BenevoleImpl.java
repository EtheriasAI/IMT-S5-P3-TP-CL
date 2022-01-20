/**
 */
package tP.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import tP.Benevole;
import tP.TPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Benevole</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tP.impl.BenevoleImpl#getTache <em>Tache</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BenevoleImpl extends PersonneImpl implements Benevole {
	/**
	 * The default value of the '{@link #getTache() <em>Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTache()
	 * @generated
	 * @ordered
	 */
	protected static final String TACHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTache() <em>Tache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTache()
	 * @generated
	 * @ordered
	 */
	protected String tache = TACHE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BenevoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TPPackage.Literals.BENEVOLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTache() {
		return tache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTache(String newTache) {
		String oldTache = tache;
		tache = newTache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPPackage.BENEVOLE__TACHE, oldTache, tache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TPPackage.BENEVOLE__TACHE:
			return getTache();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case TPPackage.BENEVOLE__TACHE:
			setTache((String) newValue);
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
		case TPPackage.BENEVOLE__TACHE:
			setTache(TACHE_EDEFAULT);
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
		case TPPackage.BENEVOLE__TACHE:
			return TACHE_EDEFAULT == null ? tache != null : !TACHE_EDEFAULT.equals(tache);
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
		result.append(" (tache: ");
		result.append(tache);
		result.append(')');
		return result.toString();
	}

} //BenevoleImpl
