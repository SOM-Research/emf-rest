/**
 */
package Example.impl;

import Example.Dog;
import Example.ExamplePackage;

import Example.ref.DogRef;

import com.sun.xml.internal.bind.CycleRecoverable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.eclipse.emf.ecore.EClass;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlRootElement (name="dog")
@XmlSeeAlso ({DogRef.class,
Wrapper.class,RaceDogImpl.class,HuntingDogImpl.class
})
public  class DogImpl extends PetImpl implements Dog,CycleRecoverable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamplePackage.Literals.DOG;
	}

@Override
	public Object onCycleDetected(Context arg0) {
		DogRef  ref = new DogRef();
		
		 ref.name=name;
		
		 ref.breed=breed;
		
		
		return ref;
		}
	
} //DogImpl
