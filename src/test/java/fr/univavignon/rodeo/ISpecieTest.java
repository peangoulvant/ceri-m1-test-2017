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

import fr.univavignon.rodeo.api.ISpecie;

public class ISpecieTest {

	@Mock
	protected ISpecie species;

	public void testGetAnimals(){
		boolean testAnimal = false;
		if(species.getAnimals() != null){
			testAnimal = true;
		}
		assertTrue("List animals exist",testAnimal);
	}

	public void testGetArea(){
		boolean testArea = false;
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

}
