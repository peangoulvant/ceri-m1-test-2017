package fr.univavignon.rodeo.implementation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.interfaces.IGameStateProviderTest;
import fr.univavignon.rodeo.api.*;

public class GameStateProviderTest extends IGameStateProviderTest{

	private GameStateProvider gameStateProvider;
	private GameState gameState;

	@Before
	public void init() {
		gameStateProvider = new GameStateProvider();
		gameState = new GameState("TestGameState");
	}

	@Test
	public void testSave() {
		assertNotNull(gameState);
		gameStateProvider.save(null);
	}

	@Test
	public void testSaveFileNotFoundException() {
		assertNotNull(gameState);
		gameStateProvider.save(gameState);
	}

	@Test
	public void testSaveEncodingException() {
		assertNotNull(gameState);
		gameStateProvider.save(gameState);
	}

	@Test
	public void testGetGameStateProvider() {
		gameStateProvider.save(gameState);
		assertEquals(gameState, gameStateProvider.get("TestGameState"));
	}

	@Test (expected=IllegalArgumentException.class)
	public void testGetGameStateProviderNull() {
		gameStateProvider.get(null);
	}

}
