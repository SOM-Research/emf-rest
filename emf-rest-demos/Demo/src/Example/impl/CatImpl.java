/**
 */
package Example.impl;

import Example.Cat;
import Example.ExamplePackage;

import Example.ref.CatRef;

import com.sun.xml.internal.bind.CycleRecoverable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.eclipse.emf.ecore.EClass;

import webmapi.service.configuration.Wrapper;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
@XmlRootElement (name="cat")
@XmlSeeAlso ({CatRef.class,
Wrapper.class
})
public  class CatImpl extends PetImpl implements Cat,CycleRecoverable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExamplePackage.Literals.CAT;
	}

@Override
	public Object onCycleDetected(Context arg0) {
		CatRef  ref = new CatRef();
		
		 ref.name=name;
		
		 ref.breed=breed;
		
		
		return ref;
		}
	
} //CatImpl
