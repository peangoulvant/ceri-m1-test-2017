package fr.univavignon.rodeo.implementation;

import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.INamedObject;
import fr.univavignon.rodeo.api.ISpecie;

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
