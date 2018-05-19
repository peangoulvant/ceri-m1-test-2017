package fr.univavignon.rodeo.implementation;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class Specie extends NamedObject implements ISpecie {

	private List<IAnimal> animals;
	private int area;
	
	public Specie( String name, int area, List<IAnimal> list) {
		super(name);
		this.animals = list;
		this.area = area;
	}

	@Override
	public int getArea() {
		return this.area;
	}

	@Override
	public List<IAnimal> getAnimals() {
		return this.animals;
	}
	
	@Override
	public boolean equals(Object o) {
		Specie object = (Specie) o;
		List<IAnimal> animalsObject = object.getAnimals();

		return animals.size() == animalsObject.size() && ((Specie) o).getName().equals(object.getName())
				&& area == object.getArea()
				&& IntStream.range(0, animals.size()).allMatch(i -> (animals.get(i)).equals(animalsObject.get(i)));

	}

}
