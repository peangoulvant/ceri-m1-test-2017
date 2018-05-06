package fr.univavignon.rodeo.implementation;

import java.util.LinkedList;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

public class GameStateProvider implements IGameStateProvider {

	private LinkedList<IGameState> gameStates;
	
	//constructor generated
	public GameStateProvider() {
		super();
		this.gameStates = new LinkedList<IGameState>();
	}

	@Override
	public void save(IGameState gameState) {
		this.gameStates.add(gameState);
	}

	@Override
	public IGameState get(String name) throws IllegalArgumentException {
		
		IGameState game = null;
		
		for (IGameState gameState : gameStates) {
			if(gameState.getName().equals(name))
				game = gameState;
		}
		
		//si non trouvé, on crée un nouveau
		if (game == null)
			game = new GameState("NewGameState");
		
		return game;
	}

}
