package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import fr.univavignon.rodeo.api.IAnimal;

public class IAnimalTest {

	@Mock
	protected IAnimal animal;
	
	
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
	public void testGetXP() {
		boolean xp = false;
		if(animal.getXP()!=0)
			xp = true;
		assertTrue("", xp);
		
	}

	@Test
	public void testIsSecret() {
		assertTrue("animal is secret", animal.isSecret());
	}

	@Test
	public void testIsEndangered() {
		assertTrue("animal is endangered", animal.isSecret());
	}

	@Test
	public void testIsBoss() {
		assertTrue("animal is the boss", animal.isBoss());
	}

}
