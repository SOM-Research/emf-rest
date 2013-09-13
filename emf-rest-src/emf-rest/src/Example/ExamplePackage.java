/**
 */
package Example;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Example.ExampleFactory
 * @model kind="package"
 * @generated
 */
public interface ExamplePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "Example";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://emf-rest.com/Example";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "Example";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ExamplePackage eINSTANCE = Example.impl.ExamplePackageImpl.init();

  /**
   * The meta object id for the '{@link Example.impl.FamilyImpl <em>Family</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Example.impl.FamilyImpl
   * @see Example.impl.ExamplePackageImpl#getFamily()
   * @generated
   */
  int FAMILY = 0;

  /**
   * The feature id for the '<em><b>Parents</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY__PARENTS = 0;

  /**
   * The feature id for the '<em><b>Sons</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY__SONS = 1;

  /**
   * The feature id for the '<em><b>Daughters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY__DAUGHTERS = 2;

  /**
   * The feature id for the '<em><b>Pets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY__PETS = 3;

  /**
   * The feature id for the '<em><b>Address</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY__ADDRESS = 4;

  /**
   * The number of structural features of the '<em>Family</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FAMILY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link Example.impl.MemberImpl <em>Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Example.impl.MemberImpl
   * @see Example.impl.ExamplePackageImpl#getMember()
   * @generated
   */
  int MEMBER = 1;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__FIRST_NAME = 0;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER__LAST_NAME = 1;

  /**
   * The number of structural features of the '<em>Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMBER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link Example.impl.ParentImpl <em>Parent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Example.impl.ParentImpl
   * @see Example.impl.ExamplePackageImpl#getParent()
   * @generated
   */
  int PARENT = 2;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT__FIRST_NAME = MEMBER__FIRST_NAME;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT__LAST_NAME = MEMBER__LAST_NAME;

  /**
   * The feature id for the '<em><b>Family</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT__FAMILY = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Parent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARENT_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link Example.impl.SonImpl <em>Son</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Example.impl.SonImpl
   * @see Example.impl.ExamplePackageImpl#getSon()
   * @generated
   */
  int SON = 3;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SON__FIRST_NAME = MEMBER__FIRST_NAME;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SON__LAST_NAME = MEMBER__LAST_NAME;

  /**
   * The feature id for the '<em><b>Family</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SON__FAMILY = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Son</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SON_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link Example.impl.DaughterImpl <em>Daughter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Example.impl.DaughterImpl
   * @see Example.impl.ExamplePackageImpl#getDaughter()
   * @generated
   */
  int DAUGHTER = 4;

  /**
   * The feature id for the '<em><b>First Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAUGHTER__FIRST_NAME = MEMBER__FIRST_NAME;

  /**
   * The feature id for the '<em><b>Last Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAUGHTER__LAST_NAME = MEMBER__LAST_NAME;

  /**
   * The feature id for the '<em><b>Family</b></em>' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAUGHTER__FAMILY = MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Daughter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DAUGHTER_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link Example.impl.PetImpl <em>Pet</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Example.impl.PetImpl
   * @see Example.impl.ExamplePackageImpl#getPet()
   * @generated
   */
  int PET = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PET__NAME = 0;

  /**
   * The feature id for the '<em><b>Breed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PET__BREED = 1;

  /**
   * The number of structural features of the '<em>Pet</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PET_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link Example.impl.DogImpl <em>Dog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Example.impl.DogImpl
   * @see Example.impl.ExamplePackageImpl#getDog()
   * @generated
   */
  int DOG = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOG__NAME = PET__NAME;

  /**
   * The feature id for the '<em><b>Breed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOG__BREED = PET__BREED;

  /**
   * The number of structural features of the '<em>Dog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOG_FEATURE_COUNT = PET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link Example.impl.CatImpl <em>Cat</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Example.impl.CatImpl
   * @see Example.impl.ExamplePackageImpl#getCat()
   * @generated
   */
  int CAT = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAT__NAME = PET__NAME;

  /**
   * The feature id for the '<em><b>Breed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAT__BREED = PET__BREED;

  /**
   * The number of structural features of the '<em>Cat</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CAT_FEATURE_COUNT = PET_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link Example.impl.RaceDogImpl <em>Race Dog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Example.impl.RaceDogImpl
   * @see Example.impl.ExamplePackageImpl#getRaceDog()
   * @generated
   */
  int RACE_DOG = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RACE_DOG__NAME = DOG__NAME;

  /**
   * The feature id for the '<em><b>Breed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RACE_DOG__BREED = DOG__BREED;

  /**
   * The number of structural features of the '<em>Race Dog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RACE_DOG_FEATURE_COUNT = DOG_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link Example.impl.HuntingDogImpl <em>Hunting Dog</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see Example.impl.HuntingDogImpl
   * @see Example.impl.ExamplePackageImpl#getHuntingDog()
   * @generated
   */
  int HUNTING_DOG = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUNTING_DOG__NAME = DOG__NAME;

  /**
   * The feature id for the '<em><b>Breed</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUNTING_DOG__BREED = DOG__BREED;

  /**
   * The number of structural features of the '<em>Hunting Dog</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HUNTING_DOG_FEATURE_COUNT = DOG_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link Example.Family <em>Family</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Family</em>'.
   * @see Example.Family
   * @generated
   */
  EClass getFamily();

  /**
   * Returns the meta object for the containment reference list '{@link Example.Family#getParents <em>Parents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parents</em>'.
   * @see Example.Family#getParents()
   * @see #getFamily()
   * @generated
   */
  EReference getFamily_Parents();

  /**
   * Returns the meta object for the containment reference list '{@link Example.Family#getSons <em>Sons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sons</em>'.
   * @see Example.Family#getSons()
   * @see #getFamily()
   * @generated
   */
  EReference getFamily_Sons();

  /**
   * Returns the meta object for the containment reference list '{@link Example.Family#getDaughters <em>Daughters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Daughters</em>'.
   * @see Example.Family#getDaughters()
   * @see #getFamily()
   * @generated
   */
  EReference getFamily_Daughters();

  /**
   * Returns the meta object for the containment reference list '{@link Example.Family#getPets <em>Pets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Pets</em>'.
   * @see Example.Family#getPets()
   * @see #getFamily()
   * @generated
   */
  EReference getFamily_Pets();

  /**
   * Returns the meta object for the attribute '{@link Example.Family#getAddress <em>Address</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Address</em>'.
   * @see Example.Family#getAddress()
   * @see #getFamily()
   * @generated
   */
  EAttribute getFamily_Address();

  /**
   * Returns the meta object for class '{@link Example.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Member</em>'.
   * @see Example.Member
   * @generated
   */
  EClass getMember();

  /**
   * Returns the meta object for the attribute '{@link Example.Member#getFirstName <em>First Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>First Name</em>'.
   * @see Example.Member#getFirstName()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_FirstName();

  /**
   * Returns the meta object for the attribute '{@link Example.Member#getLastName <em>Last Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Last Name</em>'.
   * @see Example.Member#getLastName()
   * @see #getMember()
   * @generated
   */
  EAttribute getMember_LastName();

  /**
   * Returns the meta object for class '{@link Example.Parent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parent</em>'.
   * @see Example.Parent
   * @generated
   */
  EClass getParent();

  /**
   * Returns the meta object for the container reference '{@link Example.Parent#getFamily <em>Family</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Family</em>'.
   * @see Example.Parent#getFamily()
   * @see #getParent()
   * @generated
   */
  EReference getParent_Family();

  /**
   * Returns the meta object for class '{@link Example.Son <em>Son</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Son</em>'.
   * @see Example.Son
   * @generated
   */
  EClass getSon();

  /**
   * Returns the meta object for the container reference '{@link Example.Son#getFamily <em>Family</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Family</em>'.
   * @see Example.Son#getFamily()
   * @see #getSon()
   * @generated
   */
  EReference getSon_Family();

  /**
   * Returns the meta object for class '{@link Example.Daughter <em>Daughter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Daughter</em>'.
   * @see Example.Daughter
   * @generated
   */
  EClass getDaughter();

  /**
   * Returns the meta object for the container reference '{@link Example.Daughter#getFamily <em>Family</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Family</em>'.
   * @see Example.Daughter#getFamily()
   * @see #getDaughter()
   * @generated
   */
  EReference getDaughter_Family();

  /**
   * Returns the meta object for class '{@link Example.Pet <em>Pet</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pet</em>'.
   * @see Example.Pet
   * @generated
   */
  EClass getPet();

  /**
   * Returns the meta object for the attribute '{@link Example.Pet#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see Example.Pet#getName()
   * @see #getPet()
   * @generated
   */
  EAttribute getPet_Name();

  /**
   * Returns the meta object for the attribute '{@link Example.Pet#getBreed <em>Breed</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Breed</em>'.
   * @see Example.Pet#getBreed()
   * @see #getPet()
   * @generated
   */
  EAttribute getPet_Breed();

  /**
   * Returns the meta object for class '{@link Example.Dog <em>Dog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dog</em>'.
   * @see Example.Dog
   * @generated
   */
  EClass getDog();

  /**
   * Returns the meta object for class '{@link Example.Cat <em>Cat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Cat</em>'.
   * @see Example.Cat
   * @generated
   */
  EClass getCat();

  /**
   * Returns the meta object for class '{@link Example.RaceDog <em>Race Dog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Race Dog</em>'.
   * @see Example.RaceDog
   * @generated
   */
  EClass getRaceDog();

  /**
   * Returns the meta object for class '{@link Example.HuntingDog <em>Hunting Dog</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hunting Dog</em>'.
   * @see Example.HuntingDog
   * @generated
   */
  EClass getHuntingDog();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  ExampleFactory getExampleFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link Example.impl.FamilyImpl <em>Family</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Example.impl.FamilyImpl
     * @see Example.impl.ExamplePackageImpl#getFamily()
     * @generated
     */
    EClass FAMILY = eINSTANCE.getFamily();

    /**
     * The meta object literal for the '<em><b>Parents</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAMILY__PARENTS = eINSTANCE.getFamily_Parents();

    /**
     * The meta object literal for the '<em><b>Sons</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAMILY__SONS = eINSTANCE.getFamily_Sons();

    /**
     * The meta object literal for the '<em><b>Daughters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAMILY__DAUGHTERS = eINSTANCE.getFamily_Daughters();

    /**
     * The meta object literal for the '<em><b>Pets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FAMILY__PETS = eINSTANCE.getFamily_Pets();

    /**
     * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FAMILY__ADDRESS = eINSTANCE.getFamily_Address();

    /**
     * The meta object literal for the '{@link Example.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Example.impl.MemberImpl
     * @see Example.impl.ExamplePackageImpl#getMember()
     * @generated
     */
    EClass MEMBER = eINSTANCE.getMember();

    /**
     * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__FIRST_NAME = eINSTANCE.getMember_FirstName();

    /**
     * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMBER__LAST_NAME = eINSTANCE.getMember_LastName();

    /**
     * The meta object literal for the '{@link Example.impl.ParentImpl <em>Parent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Example.impl.ParentImpl
     * @see Example.impl.ExamplePackageImpl#getParent()
     * @generated
     */
    EClass PARENT = eINSTANCE.getParent();

    /**
     * The meta object literal for the '<em><b>Family</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PARENT__FAMILY = eINSTANCE.getParent_Family();

    /**
     * The meta object literal for the '{@link Example.impl.SonImpl <em>Son</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Example.impl.SonImpl
     * @see Example.impl.ExamplePackageImpl#getSon()
     * @generated
     */
    EClass SON = eINSTANCE.getSon();

    /**
     * The meta object literal for the '<em><b>Family</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SON__FAMILY = eINSTANCE.getSon_Family();

    /**
     * The meta object literal for the '{@link Example.impl.DaughterImpl <em>Daughter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Example.impl.DaughterImpl
     * @see Example.impl.ExamplePackageImpl#getDaughter()
     * @generated
     */
    EClass DAUGHTER = eINSTANCE.getDaughter();

    /**
     * The meta object literal for the '<em><b>Family</b></em>' container reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DAUGHTER__FAMILY = eINSTANCE.getDaughter_Family();

    /**
     * The meta object literal for the '{@link Example.impl.PetImpl <em>Pet</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Example.impl.PetImpl
     * @see Example.impl.ExamplePackageImpl#getPet()
     * @generated
     */
    EClass PET = eINSTANCE.getPet();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PET__NAME = eINSTANCE.getPet_Name();

    /**
     * The meta object literal for the '<em><b>Breed</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PET__BREED = eINSTANCE.getPet_Breed();

    /**
     * The meta object literal for the '{@link Example.impl.DogImpl <em>Dog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Example.impl.DogImpl
     * @see Example.impl.ExamplePackageImpl#getDog()
     * @generated
     */
    EClass DOG = eINSTANCE.getDog();

    /**
     * The meta object literal for the '{@link Example.impl.CatImpl <em>Cat</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Example.impl.CatImpl
     * @see Example.impl.ExamplePackageImpl#getCat()
     * @generated
     */
    EClass CAT = eINSTANCE.getCat();

    /**
     * The meta object literal for the '{@link Example.impl.RaceDogImpl <em>Race Dog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Example.impl.RaceDogImpl
     * @see Example.impl.ExamplePackageImpl#getRaceDog()
     * @generated
     */
    EClass RACE_DOG = eINSTANCE.getRaceDog();

    /**
     * The meta object literal for the '{@link Example.impl.HuntingDogImpl <em>Hunting Dog</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see Example.impl.HuntingDogImpl
     * @see Example.impl.ExamplePackageImpl#getHuntingDog()
     * @generated
     */
    EClass HUNTING_DOG = eINSTANCE.getHuntingDog();

  }

} //ExamplePackage
