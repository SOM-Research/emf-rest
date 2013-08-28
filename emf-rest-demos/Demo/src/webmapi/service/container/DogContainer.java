


package webmapi.service.container;

import java.util.List;

public class DogContainer {

	private List<Example.Dog> dogList;
	private List<Example.RaceDog> raceDogList;
	private List<Example.HuntingDog> huntingDogList;

public DogContainer(){
}

public DogContainer(
List<Example.Dog> dogList  
 
 , List<Example.RaceDog> raceDogList  
 
 , List<Example.HuntingDog> huntingDogList  
 
) {

	this.dogList = dogList;
	this.raceDogList = raceDogList;
	this.huntingDogList = huntingDogList;
}


public List<Example.Dog> getDog() {
    return dogList;
}

public void setDog(List<Example.Dog> dogList) {
    this.dogList = dogList;
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