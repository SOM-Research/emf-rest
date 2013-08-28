


package webmapi.service.container;

import java.util.List;

public class PetContainer {

	private List<Example.Dog> dogList;
	private List<Example.Cat> catList;
	private List<Example.RaceDog> raceDogList;
	private List<Example.HuntingDog> huntingDogList;

public PetContainer(){
}

public PetContainer(
List<Example.Dog> dogList  
 
 , List<Example.Cat> catList  
 
 , List<Example.RaceDog> raceDogList  
 
 , List<Example.HuntingDog> huntingDogList  
 
) {

	this.dogList = dogList;
	this.catList = catList;
	this.raceDogList = raceDogList;
	this.huntingDogList = huntingDogList;
}


public List<Example.Dog> getDog() {
    return dogList;
}

public void setDog(List<Example.Dog> dogList) {
    this.dogList = dogList;
}


public List<Example.Cat> getCat() {
    return catList;
}

public void setCat(List<Example.Cat> catList) {
    this.catList = catList;
}


public List<Example.RaceDog> getRaceDog() {
    return raceDogList;
}

public void setRaceDog(List<Example.RaceDog> raceDogList) {
    this.raceDogList = raceDogList;
}


public List<Example.HuntingDog> getHuntingDog() {
    return huntingDogList;
}

public void setHuntingDog(List<Example.HuntingDog> huntingDogList) {
    this.huntingDogList = huntingDogList;
}


}