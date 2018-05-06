package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;

public class Animal extends NamedObject implements IAnimal {

	private boolean IsBoss, IsEndangered, IsSecret;
	private int xp;
	
	//constructor generated
	public Animal(boolean isBoss, boolean isEndangered, boolean isSecret, String name, int xp) {
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

}
