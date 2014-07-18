/**
 */
package Example.impl;

import Example.Daughter;
import Example.ExamplePackage;
import Example.Family;
import Example.Parent;
import Example.Pet;
import Example.Son;

import Example.ref.FamilyRef;

import com.sun.xml.internal.bind.CycleRecoverable;

import java.util.Collection;

import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Example.impl.FamilyImpl#getParents <em>Parents</em>}</li>
 *   <li>{@link Example.impl.FamilyImpl#getSons <em>Sons</em>}</li>
 *   <li>{@link Example.impl.FamilyImpl#getDaughters <em>Daughters</em>}</li>
 *   <li>{@link Example.impl.FamilyImpl#getPets <em>Pets</em>}</li>
 *   <li>{@link Example.impl.FamilyImpl#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@XmlRootElement (name="family")
@XmlSeeAlso ({FamilyRef.class,
Wrapper.class
		 ,ParentImpl.class	
		 ,SonImpl.class	
		 ,DaughterImpl.class	
		 ,PetImpl.class	
})
public  class FamilyImpl extends EObjectImpl implements Family,CycleRecoverable {
	/**
	 * The cached value of the '{@link #getParents() <em>Parents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParents()
	 * @generated
	 * @ordered
	 */
	protected EList<Parent> parents;

	/**
	 * The cached value of the '{@link #getSons() <em>Sons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSons()
	 * @generated
	 * @ordered
	 */
	protected EList<Son> sons;

	/**
	 * The cached value of the '{@link #getDaughters() <em>Daughters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaughters()
	 * @generated
	 * @ordered
	 */
	protected EList<Daughter> daughters;

	/**
	 * The cached value of the '{@link #getPets() <em>Pets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPets()
	 * @generated
	 * @ordered
	 */
	protected EList<Pet> pets;

	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FamilyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamplePackage.Literals.FAMILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * XX 10
	 * <!-- end-user-doc -->
	 * @generated
	 */ 
	@XmlElementWrapper(name =  "parents")	 
	@XmlAnyElement(lax=true)
	
	public EList<Parent> getParents() {
		if (parents == null) {
			parents = new EObjectContainmentWithInverseEList<Parent>(Parent.class, this, ExamplePackage.FAMILY__PARENTS, ExamplePackage.PARENT__FAMILY);
		}
		return parents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * XX 10
	 * <!-- end-user-doc -->
	 * @generated
	 */ 
	@XmlElementWrapper(name =  "sons")	 
	@XmlAnyElement(lax=true)
	
	public EList<Son> getSons() {
		if (sons == null) {
			sons = new EObjectContainmentWithInverseEList<Son>(Son.class, this, ExamplePackage.FAMILY__SONS, ExamplePackage.SON__FAMILY);
		}
		return sons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * XX 10
	 * <!-- end-user-doc -->
	 * @generated
	 */ 
	@XmlElementWrapper(name =  "daughters")	 
	@XmlAnyElement(lax=true)
	
	public EList<Daughter> getDaughters() {
		if (daughters == null) {
			daughters = new EObjectContainmentWithInverseEList<Daughter>(Daughter.class, this, ExamplePackage.FAMILY__DAUGHTERS, ExamplePackage.DAUGHTER__FAMILY);
		}
		return daughters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * XX 10
	 * <!-- end-user-doc -->
	 * @generated
	 */ 
	@XmlElementWrapper(name =  "pets")	 
	@XmlAnyElement(lax=true)
	
	public EList<Pet> getPets() {
		if (pets == null) {
			pets = new EObjectContainmentEList<Pet>(Pet.class, this, ExamplePackage.FAMILY__PETS);
		}
		return pets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * XX 10
	 * <!-- end-user-doc -->
	 * @generated
	 */		
	@XmlElement 
	
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExamplePackage.FAMILY__ADDRESS, oldAddress, address));
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
			case ExamplePackage.FAMILY__PARENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParents()).basicAdd(otherEnd, msgs);
			case ExamplePackage.FAMILY__SONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSons()).basicAdd(otherEnd, msgs);
			case ExamplePackage.FAMILY__DAUGHTERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDaughters()).basicAdd(otherEnd, msgs);
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
			case ExamplePackage.FAMILY__PARENTS:
				return ((InternalEList<?>)getParents()).basicRemove(otherEnd, msgs);
			case ExamplePackage.FAMILY__SONS:
				return ((InternalEList<?>)getSons()).basicRemove(otherEnd, msgs);
			case ExamplePackage.FAMILY__DAUGHTERS:
				return ((InternalEList<?>)getDaughters()).basicRemove(otherEnd, msgs);
			case ExamplePackage.FAMILY__PETS:
				return ((InternalEList<?>)getPets()).basicRemove(otherEnd, msgs);
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
			case ExamplePackage.FAMILY__PARENTS:
				return getParents();
			case ExamplePackage.FAMILY__SONS:
				return getSons();
			case ExamplePackage.FAMILY__DAUGHTERS:
				return getDaughters();
			case ExamplePackage.FAMILY__PETS:
				return getPets();
			case ExamplePackage.FAMILY__ADDRESS:
				return getAddress();
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
			case ExamplePackage.FAMILY__PARENTS:
				getParents().clear();
				getParents().addAll((Collection<? extends Parent>)newValue);
				return;
			case ExamplePackage.FAMILY__SONS:
				getSons().clear();
				getSons().addAll((Collection<? extends Son>)newValue);
				return;
			case ExamplePackage.FAMILY__DAUGHTERS:
				getDaughters().clear();
				getDaughters().addAll((Collection<? extends Daughter>)newValue);
				return;
			case ExamplePackage.FAMILY__PETS:
				getPets().clear();
				getPets().addAll((Collection<? extends Pet>)newValue);
				return;
			case ExamplePackage.FAMILY__ADDRESS:
				setAddress((String)newValue);
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
			case ExamplePackage.FAMILY__PARENTS:
				getParents().clear();
				return;
			case ExamplePackage.FAMILY__SONS:
				getSons().clear();
				return;
			case ExamplePackage.FAMILY__DAUGHTERS:
				getDaughters().clear();
				return;
			case ExamplePackage.FAMILY__PETS:
				getPets().clear();
				return;
			case ExamplePackage.FAMILY__ADDRESS:
				setAddress(ADDRESS_EDEFAULT);
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
			case ExamplePackage.FAMILY__PARENTS:
				return parents != null && !parents.isEmpty();
			case ExamplePackage.FAMILY__SONS:
				return sons != null && !sons.isEmpty();
			case ExamplePackage.FAMILY__DAUGHTERS:
				return daughters != null && !daughters.isEmpty();
			case ExamplePackage.FAMILY__PETS:
				return pets != null && !pets.isEmpty();
			case ExamplePackage.FAMILY__ADDRESS:
				return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (address: ");
		result.append(address);
		result.append(')');
		return result.toString();
	}

@Override
	public Object onCycleDetected(Context arg0) {
		FamilyRef  ref = new FamilyRef();
		
		 ref.address=address;
		
		
		return ref;
		}
	
} //FamilyImpl
