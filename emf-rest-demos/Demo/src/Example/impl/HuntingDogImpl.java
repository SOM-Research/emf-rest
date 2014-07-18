/**
 */
package Example.impl;

import Example.ExamplePackage;
import Example.HuntingDog;

import Example.ref.HuntingDogRef;

import com.sun.xml.internal.bind.CycleRecoverable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.eclipse.emf.ecore.EClass;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hunting Dog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlRootElement (name="huntingdog")
@XmlSeeAlso ({HuntingDogRef.class,
Wrapper.class
})
public  class HuntingDogImpl extends DogImpl implements HuntingDog,CycleRecoverable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HuntingDogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamplePackage.Literals.HUNTING_DOG;
	}

@Override
	public Object onCycleDetected(Context arg0) {
		HuntingDogRef  ref = new HuntingDogRef();
		
		 ref.name=name;
		
		 ref.breed=breed;
		
		
		return ref;
		}
	
} //HuntingDogImpl
