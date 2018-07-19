package webmapi.service;

import java.util.List;
import java.util.Objects;

import Example.Family;
import Example.Member;
import Example.Parent;
import Example.Son;
import Example.Daughter;
import Example.Pet;
import Example.Dog;
import Example.Cat;
import Example.RaceDog;
import Example.HuntingDog;

public class IdentificationResolver {

	public static String getFamilyId(Family family) {
		if (family == null)
			return null;
		return family.getAddress().toString();
	}

	public static String getMemberId(Member member) {
		if (member == null)
			return null;
		return member.getFirstName().toString();
	}

	public static String getParentId(Parent parent) {
		if (parent == null)
			return null;
		return parent.getFirstName().toString();
	}

	public static String getSonId(Son son) {
		if (son == null)
			return null;
		return son.getFirstName().toString();
	}

	public static String getDaughterId(Daughter daughter) {
		if (daughter == null)
			return null;
		return daughter.getFirstName().toString();
	}

	public static String getPetId(Pet pet) {
		if (pet == null)
			return null;
		return pet.getName().toString();
	}

	public static String getDogId(Dog dog) {
		if (dog == null)
			return null;
		return dog.getName().toString();
	}

	public static String getCatId(Cat cat) {
		if (cat == null)
			return null;
		return cat.getName().toString();
	}

	public static String getRaceDogId(RaceDog raceDog) {
		if (raceDog == null)
			return null;
		return raceDog.getName().toString();
	}

	public static String getHuntingDogId(HuntingDog huntingDog) {
		if (huntingDog == null)
			return null;
		return huntingDog.getName().toString();
	}

	public static Family findFamilyById(List<Family> familys, String id) {
		for (Family family : familys) {
			if (Objects.equals(getFamilyId(family), id))
				return family;
		}
		return null;
	}

	public static Member findMemberById(List<Member> members, String id) {
		for (Member member : members) {
			if (Objects.equals(getMemberId(member), id))
				return member;
		}
		return null;
	}

	public static Parent findParentById(List<Parent> parents, String id) {
		for (Parent parent : parents) {
			if (Objects.equals(getParentId(parent), id))
				return parent;
		}
		return null;
	}

	public static Son findSonById(List<Son> sons, String id) {
		for (Son son : sons) {
			if (Objects.equals(getSonId(son), id))
				return son;
		}
		return null;
	}

	public static Daughter findDaughterById(List<Daughter> daughters, String id) {
		for (Daughter daughter : daughters) {
			if (Objects.equals(getDaughterId(daughter), id))
				return daughter;
		}
		return null;
	}

	public static Pet findPetById(List<Pet> pets, String id) {
		for (Pet pet : pets) {
			if (Objects.equals(getPetId(pet), id))
				return pet;
		}
		return null;
	}

	public static Dog findDogById(List<Dog> dogs, String id) {
		for (Dog dog : dogs) {
			if (Objects.equals(getDogId(dog), id))
				return dog;
		}
		return null;
	}

	public static Cat findCatById(List<Cat> cats, String id) {
		for (Cat cat : cats) {
			if (Objects.equals(getCatId(cat), id))
				return cat;
		}
		return null;
	}

	public static RaceDog findRaceDogById(List<RaceDog> raceDogs, String id) {
		for (RaceDog raceDog : raceDogs) {
			if (Objects.equals(getRaceDogId(raceDog), id))
				return raceDog;
		}
		return null;
	}

	public static HuntingDog findHuntingDogById(List<HuntingDog> huntingDogs, String id) {
		for (HuntingDog huntingDog : huntingDogs) {
			if (Objects.equals(getHuntingDogId(huntingDog), id))
				return huntingDog;
		}
		return null;
	}

}
