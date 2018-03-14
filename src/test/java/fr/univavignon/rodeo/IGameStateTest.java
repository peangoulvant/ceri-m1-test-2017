package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class IGameStateTest {

	@Mock
	protected IGameState gameState;

	public void testGetProgression(){
		boolean isProgression;
		if(gameState.getProgression() != 0){
			isProgression = true;
		}
		assertTrue("Progression exist",isProgression);
	}

	public void testGetSpecies(ISpecies species){
		boolean testSpecies;
		if(gameState.getSpeciesLevel(species) != 0){
			testSpecies = true;
		}
		assertTrue("Species level exist",testSpecies);
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExploreArea() {
		fail("Not yet implemented");
	}

	@Test
	public void testCatchAnimal() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetSpecieLevel() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProgression() {
		fail("Not yet implemented");
	}

}
