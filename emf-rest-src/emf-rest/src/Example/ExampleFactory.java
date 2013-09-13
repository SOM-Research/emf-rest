/**
 */
package Example;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Example.ExamplePackage
 * @generated
 */
public interface ExampleFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExampleFactory eINSTANCE = Example.impl.ExampleFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Family</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Family</em>'.
   * @generated
   */
  Family createFamily();

  /**
   * Returns a new object of class '<em>Parent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parent</em>'.
   * @generated
   */
  Parent createParent();

  /**
   * Returns a new object of class '<em>Son</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Son</em>'.
   * @generated
   */
  Son createSon();

  /**
   * Returns a new object of class '<em>Daughter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Daughter</em>'.
   * @generated
   */
  Daughter createDaughter();

  /**
   * Returns a new object of class '<em>Dog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dog</em>'.
   * @generated
   */
  Dog createDog();

  /**
   * Returns a new object of class '<em>Cat</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cat</em>'.
   * @generated
   */
  Cat createCat();

  /**
   * Returns a new object of class '<em>Race Dog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Race Dog</em>'.
   * @generated
   */
  RaceDog createRaceDog();

  /**
   * Returns a new object of class '<em>Hunting Dog</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hunting Dog</em>'.
   * @generated
   */
  HuntingDog createHuntingDog();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ExamplePackage getExamplePackage();

} //ExampleFactory
