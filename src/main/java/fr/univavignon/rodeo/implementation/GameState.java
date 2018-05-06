package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;
import fr.univavignon.rodeo.api.SpecieLevel;

public class GameState extends NamedObject implements IGameState {
	private SpecieLevel lvl;
	private int progression;

	//constructor generated
	public GameState(String name) {
		super(name);
		this.lvl = null;
		this.progression = 1;
	}

	@Override
	public void exploreArea() throws IllegalStateException {
		throw new IllegalStateException();
	}

	@Override
	public void catchAnimal(IAnimal animal) throws IllegalArgumentException, IllegalStateException {
		//recommande d'effectuer un try/catch pour determiner quel exception
		//sinon throw suffit (pour la plupart des fonctions comportant une seule exception)
		try {
			throw new IllegalArgumentException();
		} catch (IllegalStateException e) {
			throw new IllegalStateException();
		}
	}

	@Override
	public SpecieLevel getSpecieLevel(ISpecie specie) throws IllegalArgumentException {
		return this.lvl;
	}

	@Override
	public int getProgression() {
		return this.progression;
	}

}
