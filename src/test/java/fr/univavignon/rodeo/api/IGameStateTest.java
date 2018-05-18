package fr.univavignon.rodeo.api;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.ISpecie;

public class IGameStateTest {

	@Mock
	protected IGameState gameState;
	protected ISpecie specie1, specie2;
	protected IAnimal animal; 
	
	//on considere une progression en pourcentage par tranche de 10
	protected int listPercentage[] = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 100}; 

	@Before
	public void setUp() throws Exception {
		gameState = Mockito.mock(IGameState.class);
		
		//----------------- getProgression --------------------\\
		Mockito.when(gameState.getProgression()).thenReturn(
				listPercentage[0],
				listPercentage[1],
				listPercentage[2],
				listPercentage[3],
				listPercentage[4],
				listPercentage[5],
				listPercentage[6],
				listPercentage[7],
				listPercentage[8],
				listPercentage[9],
				listPercentage[10]
				);
		
		//----------------- getSpecieLevel --------------------\\
		Mockito.when(gameState.getSpecieLevel(null)).thenThrow(new IllegalArgumentException());
		specie1 = Mockito.mock(ISpecie.class);
		//specie2 = Mockito.mock(ISpecie.class);
		Mockito.doThrow(new IllegalArgumentException()).when(gameState).getSpecieLevel(specie1);
		
		//----------------- ExploreArea --------------------\\
		Mockito.doThrow(new IllegalStateException()).when(gameState).exploreArea();

		
		//----------------- CatchAnimal --------------------\\
		animal = Mockito.mock(IAnimal.class);
		Mockito.doThrow(new IllegalArgumentException()).when(gameState).catchAnimal(null);
		Mockito.doThrow(new IllegalStateException()).when(gameState).catchAnimal(animal);
	}
	
	@Test
	public void testGetProgression(){
		for(int oProgression : listPercentage) {
			assertEquals("GetProgression -- OK", gameState.getProgression(), oProgression);
		}
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetSpecieLevelNull(){
		gameState.getSpecieLevel(null);
	}

	@Test(expected = IllegalStateException.class)
	public void testExploreAreaNull(){
		gameState.exploreArea();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCatchAnimalNull(){
		gameState.catchAnimal(null);
	}
	
	@Test(expected = IllegalStateException.class)
	public void testCatchAnimal(){
		gameState.catchAnimal(animal);
	}

}
