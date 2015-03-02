/**
 */
package Example.impl;

import Example.Daughter;
import Example.ExamplePackage;
import Example.Family;

import Example.ref.DaughterRef;

import com.sun.xml.internal.bind.CycleRecoverable;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Daughter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Example.impl.DaughterImpl#getFamily <em>Family</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlRootElement (name="daughter")
@XmlSeeAlso ({DaughterRef.class,
Wrapper.class
		 ,FamilyImpl.class	
})
public  class DaughterImpl extends MemberImpl implements Daughter,CycleRecoverable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DaughterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamplePackage.Literals.DAUGHTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * XX 10
	 * <!-- end-user-doc -->
	 * @generated
	 */	 
	@XmlAnyElement(lax=true)
	
	public Family getFamily() {
		if (eContainerFeatureID() != ExamplePackage.DAUGHTER__FAMILY) return null;
		return (Family)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFamily(Family newFamily, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFamily, ExamplePackage.DAUGHTER__FAMILY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(Family newFamily) {
		if (newFamily != eInternalContainer() || (eContainerFeatureID() != ExamplePackage.DAUGHTER__FAMILY && newFamily != null)) {
			if (EcoreUtil.isAncestor(this, newFamily))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFamily != null)
				msgs = ((InternalEObject)newFamily).eInverseAdd(this, ExamplePackage.FAMILY__DAUGHTERS, Family.class, msgs);
			msgs = basicSetFamily(newFamily, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamplePackage.DAUGHTER__FAMILY, newFamily, newFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExamplePackage.DAUGHTER__FAMILY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFamily((Family)otherEnd, msgs);
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
			case ExamplePackage.DAUGHTER__FAMILY:
				return basicSetFamily(null, msgs);
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
			case ExamplePackage.DAUGHTER__FAMILY:
				return eInternalContainer().eInverseRemove(this, ExamplePackage.FAMILY__DAUGHTERS, Family.class, msgs);
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
			case ExamplePackage.DAUGHTER__FAMILY:
				return getFamily();
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
			case ExamplePackage.DAUGHTER__FAMILY:
				setFamily((Family)newValue);
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
			case ExamplePackage.DAUGHTER__FAMILY:
				setFamily((Family)null);
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
			case ExamplePackage.DAUGHTER__FAMILY:
				return getFamily() != null;
		}
		return super.eIsSet(featureID);
	}

@Override
	public Object onCycleDetected(Context arg0) {
		DaughterRef  ref = new DaughterRef();
		
		 ref.firstName=firstName;
		
		 ref.lastName=lastName;
		
		
		return ref;
		}
	
} //DaughterImpl
