/**
 */
package Example.util;

import Example.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Example.ExamplePackage
 * @generated
 */
public class ExampleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ExamplePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleSwitch() {
		if (modelPackage == null) {
			modelPackage = ExamplePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ExamplePackage.FAMILY: {
				Family family = (Family)theEObject;
				T result = caseFamily(family);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExamplePackage.MEMBER: {
				Member member = (Member)theEObject;
				T result = caseMember(member);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExamplePackage.PARENT: {
				Parent parent = (Parent)theEObject;
				T result = caseParent(parent);
				if (result == null) result = caseMember(parent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExamplePackage.SON: {
				Son son = (Son)theEObject;
				T result = caseSon(son);
				if (result == null) result = caseMember(son);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExamplePackage.DAUGHTER: {
				Daughter daughter = (Daughter)theEObject;
				T result = caseDaughter(daughter);
				if (result == null) result = caseMember(daughter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExamplePackage.PET: {
				Pet pet = (Pet)theEObject;
				T result = casePet(pet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExamplePackage.DOG: {
				Dog dog = (Dog)theEObject;
				T result = caseDog(dog);
				if (result == null) result = casePet(dog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExamplePackage.CAT: {
				Cat cat = (Cat)theEObject;
				T result = caseCat(cat);
				if (result == null) result = casePet(cat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExamplePackage.RACE_DOG: {
				RaceDog raceDog = (RaceDog)theEObject;
				T result = caseRaceDog(raceDog);
				if (result == null) result = caseDog(raceDog);
				if (result == null) result = casePet(raceDog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ExamplePackage.HUNTING_DOG: {
				HuntingDog huntingDog = (HuntingDog)theEObject;
				T result = caseHuntingDog(huntingDog);
				if (result == null) result = caseDog(huntingDog);
				if (result == null) result = casePet(huntingDog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Family</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Family</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFamily(Family object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Member</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMember(Member object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParent(Parent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Son</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Son</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSon(Son object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Daughter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Daughter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDaughter(Daughter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePet(Pet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDog(Dog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCat(Cat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Race Dog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Race Dog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRaceDog(RaceDog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hunting Dog</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hunting Dog</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHuntingDog(HuntingDog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ExampleSwitch
