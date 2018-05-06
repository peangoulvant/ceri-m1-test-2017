package fr.univavignon.rodeo.implementation;

import java.util.LinkedList;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class Environment extends NamedObject implements IEnvironment {

	private int areas;
	private List<ISpecie> species;
	
	//constructor generated
	public Environment(int areas, List<ISpecie> species, String name) {
		super(name);
		this.areas = areas;
		this.species = new LinkedList<ISpecie>();
		this.species.addAll(species);
	}

	@Override
	public int getAreas() {
		return this.areas;
	}

	@Override
	public List<ISpecie> getSpecies() {
		return this.species;
	}

}
