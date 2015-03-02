/**
 */
package Example;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Example.Member#getFirstName <em>First Name</em>}</li>
 *   <li>{@link Example.Member#getLastName <em>Last Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see Example.ExamplePackage#getMember()
 * @model abstract="true"
 *        annotation="Ecore constraints='validFirstName validLastName' roles='admin, user'"
 *        annotation="OCL validFirstName='not self.firstName.oclIsUndefined() and self.firstName <>\'\'' validLastName='not self.lastName.oclIsUndefined() and self.lastName <>\'\''"

 * @generated
 */
public interface Member extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see Example.ExamplePackage#getMember_FirstName()
	 * @model id="true" ordered="false"
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link Example.Member#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Name</em>' attribute.
	 * @see #setLastName(String)
	 * @see Example.ExamplePackage#getMember_LastName()
	 * @model unique="false"
	 * @generated
	 */
	String getLastName();

	/**
	 * Sets the value of the '{@link Example.Member#getLastName <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Name</em>' attribute.
	 * @see #getLastName()
	 * @generated
	 */
	void setLastName(String value);

} // Member
