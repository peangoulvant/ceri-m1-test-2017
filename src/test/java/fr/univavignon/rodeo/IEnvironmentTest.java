package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import fr.univavignon.rodeo.api.IEnvironment;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class IEnvironmentTest {

	@Mock
	protected IEnvironment env;
	
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
	public void testGetAreas() {
		boolean areas = false;
		if(env.getAreas()!=0)
			areas = true;
		assertTrue("there are available areas", areas);
	}

	@Test
	public void testGetSpecies() {
		boolean species = false;
		if(!env.getSpecies().isEmpty())
			species = true;
		assertTrue("there are many species", species);
	}

}
