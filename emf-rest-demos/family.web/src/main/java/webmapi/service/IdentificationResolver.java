
package webmapi.service;

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
	
 	public static String getFamilyId(Example.Family obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getAddress().toString();
 	}
 	public static String getMemberId(Example.Member obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getFirstName().toString();
 	}
 	public static String getParentId(Example.Parent obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getFirstName().toString();
 	}
 	public static String getSonId(Example.Son obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getFirstName().toString();
 	}
 	public static String getDaughterId(Example.Daughter obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getFirstName().toString();
 	}
 	public static String getPetId(Example.Pet obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName().toString();
 	}
 	public static String getDogId(Example.Dog obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName().toString();
 	}
 	public static String getCatId(Example.Cat obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName().toString();
 	}
 	public static String getRaceDogId(Example.RaceDog obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName().toString();
 	}
 	public static String getHuntingDogId(Example.HuntingDog obj){
 	    if(obj==null)
 	     return null;
 
		return obj.getName().toString();
 	}
	
 	public static Example.Family findFamilyById(java.util.List<Example.Family> list, String id){
 	    for (Family obji : list) {
			if (getFamilyId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static Example.Member findMemberById(java.util.List<Example.Member> list, String id){
 	    for (Member obji : list) {
			if (getMemberId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static Example.Parent findParentById(java.util.List<Example.Parent> list, String id){
 	    for (Parent obji : list) {
			if (getParentId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static Example.Son findSonById(java.util.List<Example.Son> list, String id){
 	    for (Son obji : list) {
			if (getSonId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static Example.Daughter findDaughterById(java.util.List<Example.Daughter> list, String id){
 	    for (Daughter obji : list) {
			if (getDaughterId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static Example.Pet findPetById(java.util.List<Example.Pet> list, String id){
 	    for (Pet obji : list) {
			if (getPetId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static Example.Dog findDogById(java.util.List<Example.Dog> list, String id){
 	    for (Dog obji : list) {
			if (getDogId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static Example.Cat findCatById(java.util.List<Example.Cat> list, String id){
 	    for (Cat obji : list) {
			if (getCatId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static Example.RaceDog findRaceDogById(java.util.List<Example.RaceDog> list, String id){
 	    for (RaceDog obji : list) {
			if (getRaceDogId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
 	public static Example.HuntingDog findHuntingDogById(java.util.List<Example.HuntingDog> list, String id){
 	    for (HuntingDog obji : list) {
			if (getHuntingDogId(obji).equals(id))
				return obji;
		}
		return null;
	}
	
	
}
