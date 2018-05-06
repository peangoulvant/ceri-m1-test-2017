package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.INamedObject;

public class NamedObject implements INamedObject {

	private String name;
	
	//constructor generated
	public NamedObject(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
