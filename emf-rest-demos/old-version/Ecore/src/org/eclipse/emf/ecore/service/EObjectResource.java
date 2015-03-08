
package org.eclipse.emf.ecore.service;

import java.util.List;

import javax.ws.rs.*;

import org.eclipse.emf.ecore.*;

public class EObjectResource{

    private org.eclipse.emf.ecore.EObject instance;
    
    public EObjectResource(org.eclipse.emf.ecore.EObject instance){
    	this.instance = instance;
    }

	@GET
	public org.eclipse.emf.ecore.EObject getEObject(){
		return instance;
	}
		
	@PUT
	public void updateEObject(org.eclipse.emf.ecore.EObject object){
		
	}

	
}

