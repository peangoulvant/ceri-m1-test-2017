package fr.univavignon.rodeo.implementation;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;

public class Environment extends NamedObject implements IEnvironment {

	private int areas;
	private List<ISpecie> species;
	
	//constructor generated
	public Environment( String name, int areas, List<ISpecie> species) {
		super(name);
		this.areas = areas;
		this.species = species;
	}

	@Override
	public int getAreas() {
		return this.areas;
	}

	@Override
	public List<ISpecie> getSpecies() {
		return this.species;
	}
	
	@Override
	public boolean equals(Object o) {
		Environment newObject = (Environment) o;
		List<ISpecie> speciesObject = newObject.getSpecies();
		
		if (name.equals(newObject.getName()) && areas == newObject.getAreas() && species.size() == speciesObject.size()) {
			for (int i=0; i < species.size(); i++) {
				if (!((Specie)species.get(i)).equals(speciesObject.get(i)))
					return false;
			}
		}
		else {
			return false;
		}
		
		return true;
	}

}
