/**
 */
package Example;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Son</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Example.Son#getFamily <em>Family</em>}</li>
 * </ul>
 * </p>
 *
 * @see Example.ExamplePackage#getSon()
 * @model

 * @generated
 */
public interface Son extends Member {
	/**
	 * Returns the value of the '<em><b>Family</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link Example.Family#getSons <em>Sons</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Family</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Family</em>' container reference.
	 * @see #setFamily(Family)
	 * @see Example.ExamplePackage#getSon_Family()
	 * @see Example.Family#getSons
	 * @model opposite="sons" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Family getFamily();

	/**
	 * Sets the value of the '{@link Example.Son#getFamily <em>Family</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Family</em>' container reference.
	 * @see #getFamily()
	 * @generated
	 */
	void setFamily(Family value);

} // Son
