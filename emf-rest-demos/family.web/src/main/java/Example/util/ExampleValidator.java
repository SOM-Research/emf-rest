/**
 */
package Example.util;

import Example.*;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see Example.ExamplePackage
 * @generated
 */
public class ExampleValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final ExampleValidator INSTANCE = new ExampleValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "Example";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The parsed OCL expression for the definition of the '<em>validFirstName</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint member_validFirstNameInvOCL;
	/**
	 * The parsed OCL expression for the definition of the '<em>validLastName</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint member_validLastNameInvOCL;
	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/emf/2002/Ecore/OCL";
	
	private static final OCL OCL_ENV = OCL.newInstance();
	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return ExamplePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case ExamplePackage.FAMILY:
				return validateFamily((Family)value, diagnostics, context);
			case ExamplePackage.MEMBER:
				return validateMember((Member)value, diagnostics, context);
			case ExamplePackage.PARENT:
				return validateParent((Parent)value, diagnostics, context);
			case ExamplePackage.SON:
				return validateSon((Son)value, diagnostics, context);
			case ExamplePackage.DAUGHTER:
				return validateDaughter((Daughter)value, diagnostics, context);
			case ExamplePackage.PET:
				return validatePet((Pet)value, diagnostics, context);
			case ExamplePackage.DOG:
				return validateDog((Dog)value, diagnostics, context);
			case ExamplePackage.CAT:
				return validateCat((Cat)value, diagnostics, context);
			case ExamplePackage.RACE_DOG:
				return validateRaceDog((RaceDog)value, diagnostics, context);
			case ExamplePackage.HUNTING_DOG:
				return validateHuntingDog((HuntingDog)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFamily(Family family, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(family, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(member, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_validFirstName(member, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_validLastName(member, diagnostics, context);
		return result;
	}

	/**
	 * Validates the validFirstName constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember_validFirstName(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (member_validFirstNameInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MEMBER);
			
			EAnnotation ocl = ExamplePackage.Literals.MEMBER.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("validFirstName");
			
			try {
				member_validFirstNameInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(member_validFirstNameInvOCL);
		
		if (!query.check(member)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "validFirstName", getObjectLabel(member, context) }),
						 new Object[] { member }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the validLastName constraint of '<em>Member</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMember_validLastName(Member member, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (member_validLastNameInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(ExamplePackage.Literals.MEMBER);
			
			EAnnotation ocl = ExamplePackage.Literals.MEMBER.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("validLastName");
			
			try {
				member_validLastNameInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(member_validLastNameInvOCL);
		
		if (!query.check(member)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "validLastName", getObjectLabel(member, context) }),
						 new Object[] { member }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParent(Parent parent, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(parent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(parent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parent, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parent, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_validFirstName(parent, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_validLastName(parent, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSon(Son son, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(son, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(son, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(son, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(son, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(son, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(son, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(son, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(son, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(son, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_validFirstName(son, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_validLastName(son, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDaughter(Daughter daughter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(daughter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(daughter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(daughter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(daughter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(daughter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(daughter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(daughter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(daughter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(daughter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_validFirstName(daughter, diagnostics, context);
		if (result || diagnostics != null) result &= validateMember_validLastName(daughter, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePet(Pet pet, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pet, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDog(Dog dog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(dog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCat(Cat cat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRaceDog(RaceDog raceDog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(raceDog, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHuntingDog(HuntingDog huntingDog, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(huntingDog, diagnostics, context);
	}

} //ExampleValidator
