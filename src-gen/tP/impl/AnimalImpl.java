/**
 */
package tP.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;
import tP.Adoptant;
import tP.Animal;
import tP.Foyer;
import tP.TPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Animal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tP.impl.AnimalImpl#getFoyer <em>Foyer</em>}</li>
 *   <li>{@link tP.impl.AnimalImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link tP.impl.AnimalImpl#getAge <em>Age</em>}</li>
 *   <li>{@link tP.impl.AnimalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tP.impl.AnimalImpl#getAdoptant <em>Adoptant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnimalImpl extends MinimalEObjectImpl.Container implements Animal {
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
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnimalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TPPackage.Literals.ANIMAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Foyer getFoyer() {
		if (eContainerFeatureID() != TPPackage.ANIMAL__FOYER)
			return null;
		return (Foyer) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFoyer(Foyer newFoyer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newFoyer, TPPackage.ANIMAL__FOYER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFoyer(Foyer newFoyer) {
		if (newFoyer != eInternalContainer()
				|| (eContainerFeatureID() != TPPackage.ANIMAL__FOYER && newFoyer != null)) {
			if (EcoreUtil.isAncestor(this, newFoyer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFoyer != null)
				msgs = ((InternalEObject) newFoyer).eInverseAdd(this, TPPackage.FOYER__ANIMAUX, Foyer.class, msgs);
			msgs = basicSetFoyer(newFoyer, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPPackage.ANIMAL__FOYER, newFoyer, newFoyer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TPPackage.ANIMAL__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPPackage.ANIMAL__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPPackage.ANIMAL__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Adoptant getAdoptant() {
		if (eContainerFeatureID() != TPPackage.ANIMAL__ADOPTANT)
			return null;
		return (Adoptant) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdoptant(Adoptant newAdoptant, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newAdoptant, TPPackage.ANIMAL__ADOPTANT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdoptant(Adoptant newAdoptant) {
		if (newAdoptant != eInternalContainer()
				|| (eContainerFeatureID() != TPPackage.ANIMAL__ADOPTANT && newAdoptant != null)) {
			if (EcoreUtil.isAncestor(this, newAdoptant))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAdoptant != null)
				msgs = ((InternalEObject) newAdoptant).eInverseAdd(this, TPPackage.ADOPTANT__ANIMAUX, Adoptant.class,
						msgs);
			msgs = basicSetAdoptant(newAdoptant, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TPPackage.ANIMAL__ADOPTANT, newAdoptant,
					newAdoptant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case TPPackage.ANIMAL__FOYER:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetFoyer((Foyer) otherEnd, msgs);
		case TPPackage.ANIMAL__ADOPTANT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetAdoptant((Adoptant) otherEnd, msgs);
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
		case TPPackage.ANIMAL__FOYER:
			return basicSetFoyer(null, msgs);
		case TPPackage.ANIMAL__ADOPTANT:
			return basicSetAdoptant(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case TPPackage.ANIMAL__FOYER:
			return eInternalContainer().eInverseRemove(this, TPPackage.FOYER__ANIMAUX, Foyer.class, msgs);
		case TPPackage.ANIMAL__ADOPTANT:
			return eInternalContainer().eInverseRemove(this, TPPackage.ADOPTANT__ANIMAUX, Adoptant.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case TPPackage.ANIMAL__FOYER:
			return getFoyer();
		case TPPackage.ANIMAL__NOM:
			return getNom();
		case TPPackage.ANIMAL__AGE:
			return getAge();
		case TPPackage.ANIMAL__DESCRIPTION:
			return getDescription();
		case TPPackage.ANIMAL__ADOPTANT:
			return getAdoptant();
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
		case TPPackage.ANIMAL__FOYER:
			setFoyer((Foyer) newValue);
			return;
		case TPPackage.ANIMAL__NOM:
			setNom((String) newValue);
			return;
		case TPPackage.ANIMAL__AGE:
			setAge((Integer) newValue);
			return;
		case TPPackage.ANIMAL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case TPPackage.ANIMAL__ADOPTANT:
			setAdoptant((Adoptant) newValue);
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
		case TPPackage.ANIMAL__FOYER:
			setFoyer((Foyer) null);
			return;
		case TPPackage.ANIMAL__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case TPPackage.ANIMAL__AGE:
			setAge(AGE_EDEFAULT);
			return;
		case TPPackage.ANIMAL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case TPPackage.ANIMAL__ADOPTANT:
			setAdoptant((Adoptant) null);
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
		case TPPackage.ANIMAL__FOYER:
			return getFoyer() != null;
		case TPPackage.ANIMAL__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case TPPackage.ANIMAL__AGE:
			return age != AGE_EDEFAULT;
		case TPPackage.ANIMAL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case TPPackage.ANIMAL__ADOPTANT:
			return getAdoptant() != null;
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
		result.append(", age: ");
		result.append(age);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AnimalImpl
