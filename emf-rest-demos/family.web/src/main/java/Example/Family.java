/**
 */
package Example;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Family</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Example.Family#getParents <em>Parents</em>}</li>
 *   <li>{@link Example.Family#getSons <em>Sons</em>}</li>
 *   <li>{@link Example.Family#getDaughters <em>Daughters</em>}</li>
 *   <li>{@link Example.Family#getPets <em>Pets</em>}</li>
 *   <li>{@link Example.Family#getAddress <em>Address</em>}</li>
 * </ul>
 *
 * @see Example.ExamplePackage#getFamily()
 * @model
 * @generated
 */
public interface Family extends EObject {
	/**
	 * Returns the value of the '<em><b>Parents</b></em>' containment reference list.
	 * The list contents are of type {@link Example.Parent}.
	 * It is bidirectional and its opposite is '{@link Example.Parent#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parents</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parents</em>' containment reference list.
	 * @see Example.ExamplePackage#getFamily_Parents()
	 * @see Example.Parent#getFamily
	 * @model opposite="family" containment="true" upper="2" ordered="false"
	 * @generated
	 */
	EList<Parent> getParents();

	/**
	 * Returns the value of the '<em><b>Sons</b></em>' containment reference list.
	 * The list contents are of type {@link Example.Son}.
	 * It is bidirectional and its opposite is '{@link Example.Son#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sons</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sons</em>' containment reference list.
	 * @see Example.ExamplePackage#getFamily_Sons()
	 * @see Example.Son#getFamily
	 * @model opposite="family" containment="true"
	 * @generated
	 */
	EList<Son> getSons();

	/**
	 * Returns the value of the '<em><b>Daughters</b></em>' containment reference list.
	 * The list contents are of type {@link Example.Daughter}.
	 * It is bidirectional and its opposite is '{@link Example.Daughter#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Daughters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Daughters</em>' containment reference list.
	 * @see Example.ExamplePackage#getFamily_Daughters()
	 * @see Example.Daughter#getFamily
	 * @model opposite="family" containment="true" ordered="false"
	 * @generated
	 */
	EList<Daughter> getDaughters();

	/**
	 * Returns the value of the '<em><b>Pets</b></em>' containment reference list.
	 * The list contents are of type {@link Example.Pet}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pets</em>' containment reference list.
	 * @see Example.ExamplePackage#getFamily_Pets()
	 * @model containment="true"
	 * @generated
	 */
	EList<Pet> getPets();

	/**
	 * Returns the value of the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' attribute.
	 * @see #setAddress(String)
	 * @see Example.ExamplePackage#getFamily_Address()
	 * @model unique="false" ordered="false"
	 * @generated
	 */
	String getAddress();

	/**
	 * Sets the value of the '{@link Example.Family#getAddress <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' attribute.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(String value);

} // Family
