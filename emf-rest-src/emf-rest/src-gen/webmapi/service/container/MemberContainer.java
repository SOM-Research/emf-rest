


package webmapi.service.container;

import java.util.List;

public class MemberContainer {

	private List<Example.Parent> parentList;
	private List<Example.Son> sonList;
	private List<Example.Daughter> daughterList;

public MemberContainer(){
}

public MemberContainer(
List<Example.Parent> parentList  
 
 , List<Example.Son> sonList  
 
 , List<Example.Daughter> daughterList  
 
) {

	this.parentList = parentList;
	this.sonList = sonList;
	this.daughterList = daughterList;
}


public List<Example.Parent> getParent() {
    return parentList;
}

public void setParent(List<Example.Parent> parentList) {
    this.parentList = parentList;
}


public List<Example.Son> getSon() {
    return sonList;
}

public void setSon(List<Example.Son> sonList) {
    this.sonList = sonList;
}


public List<Example.Daughter> getDaughter() {
    return daughterList;
}

public void setDaughter(List<Example.Daughter> daughterList) {
    this.daughterList = daughterList;
}


}