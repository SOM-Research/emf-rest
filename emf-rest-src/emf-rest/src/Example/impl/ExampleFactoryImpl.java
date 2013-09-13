/**
 */
package Example.impl;

import Example.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExampleFactoryImpl extends EFactoryImpl implements ExampleFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static ExampleFactory init()
  {
    try
    {
      ExampleFactory theExampleFactory = (ExampleFactory)EPackage.Registry.INSTANCE.getEFactory(ExamplePackage.eNS_URI);
      if (theExampleFactory != null)
      {
        return theExampleFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new ExampleFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExampleFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case ExamplePackage.FAMILY: return createFamily();
      case ExamplePackage.PARENT: return createParent();
      case ExamplePackage.SON: return createSon();
      case ExamplePackage.DAUGHTER: return createDaughter();
      case ExamplePackage.DOG: return createDog();
      case ExamplePackage.CAT: return createCat();
      case ExamplePackage.RACE_DOG: return createRaceDog();
      case ExamplePackage.HUNTING_DOG: return createHuntingDog();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Family createFamily()
  {
    FamilyImpl family = new FamilyImpl();
    return family;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parent createParent()
  {
    ParentImpl parent = new ParentImpl();
    return parent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Son createSon()
  {
    SonImpl son = new SonImpl();
    return son;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Daughter createDaughter()
  {
    DaughterImpl daughter = new DaughterImpl();
    return daughter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Dog createDog()
  {
    DogImpl dog = new DogImpl();
    return dog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Cat createCat()
  {
    CatImpl cat = new CatImpl();
    return cat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RaceDog createRaceDog()
  {
    RaceDogImpl raceDog = new RaceDogImpl();
    return raceDog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public HuntingDog createHuntingDog()
  {
    HuntingDogImpl huntingDog = new HuntingDogImpl();
    return huntingDog;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExamplePackage getExamplePackage()
  {
    return (ExamplePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static ExamplePackage getPackage()
  {
    return ExamplePackage.eINSTANCE;
  }

} //ExampleFactoryImpl
