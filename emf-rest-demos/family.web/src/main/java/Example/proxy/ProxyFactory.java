package Example.proxy;
import javax.xml.bind.annotation.XmlRootElement;
import Example.*;
public class ProxyFactory{

		public static FamilyProxy createFamilyProxy(String name){
		
		if(name.equals("Family"))
		
			return new FamilyProxy();
		
			return null;}
	
	public static Family createFamily(FamilyProxy type){
	ExampleFactory factory =  ExampleFactory.eINSTANCE;
		
		
		if(type.getClass().getAnnotation(XmlRootElement.class).equals("family"))
		
			return factory.createFamily();
		
			return null;}		
			
			
		public static MemberProxy createMemberProxy(String name){
		
		if(name.equals("Member"))
		
			return new MemberProxy();
		if(name.equals("Parent"))
		
			return new ParentProxy();
		if(name.equals("Son"))
		
			return new SonProxy();
		if(name.equals("Daughter"))
		
			return new DaughterProxy();
		
			return null;}
	
	public static Member createMember(MemberProxy type){
	ExampleFactory factory =  ExampleFactory.eINSTANCE;
		
		
		
		
		
		
			return null;}		
			
			
		public static ParentProxy createParentProxy(String name){
		
		if(name.equals("Parent"))
		
			return new ParentProxy();
		
			return null;}
	
	public static Parent createParent(ParentProxy type){
	ExampleFactory factory =  ExampleFactory.eINSTANCE;
		
		
		if(type.getClass().getAnnotation(XmlRootElement.class).equals("parent"))
		
			return factory.createParent();
		
			return null;}		
			
			
		public static SonProxy createSonProxy(String name){
		
		if(name.equals("Son"))
		
			return new SonProxy();
		
			return null;}
	
	public static Son createSon(SonProxy type){
	ExampleFactory factory =  ExampleFactory.eINSTANCE;
		
		
		if(type.getClass().getAnnotation(XmlRootElement.class).equals("son"))
		
			return factory.createSon();
		
			return null;}		
			
			
		public static DaughterProxy createDaughterProxy(String name){
		
		if(name.equals("Daughter"))
		
			return new DaughterProxy();
		
			return null;}
	
	public static Daughter createDaughter(DaughterProxy type){
	ExampleFactory factory =  ExampleFactory.eINSTANCE;
		
		
		if(type.getClass().getAnnotation(XmlRootElement.class).equals("daughter"))
		
			return factory.createDaughter();
		
			return null;}		
			
			
		public static PetProxy createPetProxy(String name){
		
		if(name.equals("Pet"))
		
			return new PetProxy();
		if(name.equals("Dog"))
		
			return new DogProxy();
		if(name.equals("Cat"))
		
			return new CatProxy();
		if(name.equals("RaceDog"))
		
			return new RaceDogProxy();
		if(name.equals("HuntingDog"))
		
			return new HuntingDogProxy();
		
			return null;}
	
	public static Pet createPet(PetProxy type){
	ExampleFactory factory =  ExampleFactory.eINSTANCE;
		
		
		
		
		
		
		
			return null;}		
			
			
		public static DogProxy createDogProxy(String name){
		
		if(name.equals("Dog"))
		
			return new DogProxy();
		if(name.equals("RaceDog"))
		
			return new RaceDogProxy();
		if(name.equals("HuntingDog"))
		
			return new HuntingDogProxy();
		
			return null;}
	
	public static Dog createDog(DogProxy type){
	ExampleFactory factory =  ExampleFactory.eINSTANCE;
		
		
		if(type.getClass().getAnnotation(XmlRootElement.class).equals("dog"))
		
			return factory.createDog();
		
		if(type.getClass().getAnnotation(XmlRootElement.class).equals("racedog"))
		
			return factory.createRaceDog();
		
		if(type.getClass().getAnnotation(XmlRootElement.class).equals("huntingdog"))
		
			return factory.createHuntingDog();
		
			return null;}		
			
			
		public static CatProxy createCatProxy(String name){
		
		if(name.equals("Cat"))
		
			return new CatProxy();
		
			return null;}
	
	public static Cat createCat(CatProxy type){
	ExampleFactory factory =  ExampleFactory.eINSTANCE;
		
		
		if(type.getClass().getAnnotation(XmlRootElement.class).equals("cat"))
		
			return factory.createCat();
		
			return null;}		
			
			
		public static RaceDogProxy createRaceDogProxy(String name){
		
		if(name.equals("RaceDog"))
		
			return new RaceDogProxy();
		
			return null;}
	
	public static RaceDog createRaceDog(RaceDogProxy type){
	ExampleFactory factory =  ExampleFactory.eINSTANCE;
		
		
		if(type.getClass().getAnnotation(XmlRootElement.class).equals("racedog"))
		
			return factory.createRaceDog();
		
			return null;}		
			
			
		public static HuntingDogProxy createHuntingDogProxy(String name){
		
		if(name.equals("HuntingDog"))
		
			return new HuntingDogProxy();
		
			return null;}
	
	public static HuntingDog createHuntingDog(HuntingDogProxy type){
	ExampleFactory factory =  ExampleFactory.eINSTANCE;
		
		
		if(type.getClass().getAnnotation(XmlRootElement.class).equals("huntingdog"))
		
			return factory.createHuntingDog();
		
			return null;}		
			
			
}

