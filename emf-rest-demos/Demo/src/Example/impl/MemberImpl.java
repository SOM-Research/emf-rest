/**
 */
package Example.impl;

import Example.ExamplePackage;
import Example.Member;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Example.impl.MemberImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link Example.impl.MemberImpl#getLastName <em>Last Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MemberImpl extends EObjectImpl implements Member
{
  /**
   * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected static final String FIRST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstName()
   * @generated
   * @ordered
   */
  protected String firstName = FIRST_NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected static final String LAST_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLastName()
   * @generated
   * @ordered
   */
  protected String lastName = LAST_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MemberImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ExamplePackage.Literals.MEMBER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFirstName()
  {
    return firstName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFirstName(String newFirstName)
  {
    String oldFirstName = firstName;
    firstName = newFirstName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExamplePackage.MEMBER__FIRST_NAME, oldFirstName, firstName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLastName()
  {
    return lastName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLastName(String newLastName)
  {
    String oldLastName = lastName;
    lastName = newLastName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ExamplePackage.MEMBER__LAST_NAME, oldLastName, lastName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ExamplePackage.MEMBER__FIRST_NAME:
        return getFirstName();
      case ExamplePackage.MEMBER__LAST_NAME:
        return getLastName();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ExamplePackage.MEMBER__FIRST_NAME:
        setFirstName((String)newValue);
        return;
      case ExamplePackage.MEMBER__LAST_NAME:
        setLastName((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ExamplePackage.MEMBER__FIRST_NAME:
        setFirstName(FIRST_NAME_EDEFAULT);
        return;
      case ExamplePackage.MEMBER__LAST_NAME:
        setLastName(LAST_NAME_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ExamplePackage.MEMBER__FIRST_NAME:
        return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
      case ExamplePackage.MEMBER__LAST_NAME:
        return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (firstName: ");
    result.append(firstName);
    result.append(", lastName: ");
    result.append(lastName);
    result.append(')');
    return result.toString();
  }

} //MemberImpl
