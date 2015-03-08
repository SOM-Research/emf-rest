/**
 */
package Example.impl;

import Example.ExamplePackage;
import Example.HuntingDog;

import Example.proxy.HuntingDogProxy;

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
@XmlSeeAlso ({HuntingDogProxy.class,
Wrapper.class
})
public  class HuntingDogImpl extends DogImpl implements HuntingDog {
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

} //HuntingDogImpl
