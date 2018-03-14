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

public class ISpecieTest {

	@Mock
	protected ISpecies species;

	public void testGetAnimals(){
		boolean testAnimal;
		if(species.getAnimals() != null){
			testAnimal = true;
		}
		assertTrue("List animals exist",testAnimal);
	}

	public void testGetArea(){
		boolean testArea;
	if(species.getArea() != 0){
		testArea = true;
		}
		assertTrue("Area exist",testArea);
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
	public void testGetArea() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAnimals() {
		fail("Not yet implemented");
	}

}
