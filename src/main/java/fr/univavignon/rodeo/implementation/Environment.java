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
		Environment object = (Environment) o;
		List<ISpecie> speciesObject = object.getSpecies();

		return name.equals(object.getName()) && areas == object.getAreas() && species.size() == speciesObject.size()
				&& IntStream.range(0, species.size()).allMatch(i -> (species.get(i)).equals(speciesObject.get(i)));

	}

}
