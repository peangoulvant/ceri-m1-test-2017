package fr.univavignon.rodeo.implementation;

import fr.univavignon.rodeo.interfaces.IGameStateTest;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.api.*;

public class GameStateTest extends IGameStateTest{

	private GameState gameState;
	private IAnimal animal;
	private ISpecie specie;
	
	@Before
	public void init() {
		gameState = new GameState("TestGameState");
		animal = new Animal("Gorille enragé", 30, true, true, true);
		specie = new Specie("Buffalo", 1, Arrays.asList(
				new Animal("Buffalo Blanc", 1, false, false, false), 		//normal
				new Animal("Buffalo Sacré", 3, true, false, false), 		//secret
				new Animal("Buffalo Rouge", 30, false, true, false) 		//endangered
				));
	}
	
	@Test (expected=IllegalStateException.class)
	public void testExploreAreaException() {
		gameState.exploreArea();
	}
	
	@Test (expected=IllegalArgumentException.class)
	public void testCatchAnimalIsNull() {
		gameState.catchAnimal(null);
	}
	
	@Test (expected=IllegalStateException.class)
	public void testCatchAnimalIsNotExist() {
		gameState.catchAnimal(new Animal("Le bison futé", 1, false, false, false));
	}
	
	@Test
	 public void testGetSpecieLevel() {
		assertEquals(null, gameState.getSpecieLevel(specie));
	}
	
	@Test (expected=IllegalArgumentException.class)
    public void testGetSpecieLevelNull() {
        gameState.getSpecieLevel(null);
    }
	
	@Test (expected=IllegalArgumentException.class)
    public void testGetProgression() {
        assertEquals(1, gameState.getProgression());
    }
}
