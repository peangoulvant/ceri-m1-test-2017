package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;

public class Animal extends NamedObject implements IAnimal {

	private boolean IsBoss, IsEndangered, IsSecret;
	private int xp;
	
	//constructor generated
	public Animal(String name, int xp, boolean isBoss, boolean isEndangered, boolean isSecret) {
		super(name);
		IsBoss = isBoss;
		IsEndangered = isEndangered;
		IsSecret = isSecret;
		this.xp = xp;
	}
	
	@Override
	public int getXP() {
		return this.xp;
	}

	@Override
	public boolean isSecret() {
		return this.IsSecret;
	}

	@Override
	public boolean isEndangered() {
		return this.IsEndangered;
	}

	@Override
	public boolean isBoss() {
		return this.IsBoss;
	}
	
	@Override
	public boolean equals(Object o) {
		Animal object = (Animal) o;

        return name.equals(object.getName()) && (xp == object.getXP()) && (IsSecret == object.isSecret())
                && (IsBoss == object.isBoss()) && (IsEndangered == object.isEndangered());
	}

}
