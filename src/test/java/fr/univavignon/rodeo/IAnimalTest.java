package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IAnimal;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class IAnimalTest {

	@Mock
	protected IAnimal animal;

	@Before
	public void setUp(){
		animal = Mockito.mock((IAnimal.class));
		
		//----------------- getXP --------------------\\
		Mockito.when(animal.getXP()).thenReturn(1);
		
		//----------------- isSecret --------------------\\
		Mockito.when(animal.isSecret()).thenReturn(true, false);
		
		//----------------- isBoss --------------------\\
		Mockito.when(animal.isBoss()).thenReturn(true, false);
		
		//----------------- isEndangered --------------------\\
		Mockito.when(animal.isEndangered()).thenReturn(true, false);
	}
	
	@Test
	public void testGetXP() {
		assertEquals("GetXP -- OK", 1, animal.getXP());
	}

	@Test
	public void testIsSecret() {
		assertTrue("animal is secret", animal.isSecret());
		assertFalse("animal isn't secret", animal.isSecret());
	}

	@Test
	public void testIsEndangered() {
		assertTrue("animal is endangered", animal.isSecret());
		assertFalse("animal isn't endangered", animal.isSecret());
	}

	@Test
	public void testIsBoss() {
		assertTrue("animal is the boss", animal.isBoss());
		assertFalse("animal isn't the boss", animal.isBoss());
	}

}
