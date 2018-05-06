package fr.univavignon.rodeo.implementation;

import java.util.LinkedList;
import java.util.List;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class Specie extends NamedObject implements ISpecie {

	private List<IAnimal> animals;
	private int area;
	
	public Specie(int area, List<IAnimal> list, String name) {
		super(name);
		this.animals = new LinkedList<IAnimal>();
		this.animals.addAll(list);
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

}
