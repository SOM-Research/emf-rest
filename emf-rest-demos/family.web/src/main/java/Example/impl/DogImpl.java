/**
 */
package Example.impl;

import Example.Dog;
import Example.ExamplePackage;

import Example.proxy.DogProxy;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.eclipse.emf.ecore.EClass;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dog</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
@XmlRootElement(name = "dog")
@XmlSeeAlso({ DogProxy.class, Wrapper.class, RaceDogImpl.class, HuntingDogImpl.class })
public class DogImpl extends PetImpl implements Dog {
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

} //DogImpl
