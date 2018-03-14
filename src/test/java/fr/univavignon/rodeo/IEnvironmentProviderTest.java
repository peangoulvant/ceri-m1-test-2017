package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;

import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class IEnvironmentProviderTest {
	
	@Mock
	protected IEnvironmentProvider envProv;
	
	
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
	public void testGetAvailableEnvironments() {
		boolean available = false;
		if(!envProv.getAvailableEnvironments().isEmpty())
			available = true;
		assertTrue("there are availables environments", available);
	}

	@Test
	public void testGetEnvironment(String name) {
		boolean env = false;
		if(envProv.getEnvironment(name)!=null)
			env = true;
		assertTrue("there are availables environments", env);
	}

}
