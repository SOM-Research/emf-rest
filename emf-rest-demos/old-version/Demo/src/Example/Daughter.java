/**
 */
package Example;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daughter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Example.Daughter#getFamily <em>Family</em>}</li>
 * </ul>
 * </p>
 *
 * @see Example.ExamplePackage#getDaughter()
 * @model

 * @generated
 */
public interface Daughter extends Member {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Example.Family#getDaughters <em>Daughters</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' container reference.
	 * @see #setFamily(Family)
	 * @see Example.ExamplePackage#getDaughter_Family()
	 * @see Example.Family#getDaughters
	 * @model opposite="daughters" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Family getFamily();

	/**
	 * Sets the value of the '{@link Example.Daughter#getFamily <em>Family</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' container reference.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(Family value);

} // Daughter
