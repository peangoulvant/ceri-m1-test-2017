package fr.univavignon.rodeo.interfaces;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IAnimal;
import fr.univavignon.rodeo.api.ISpecie;

public class ISpecieTest {

	@Mock
	protected ISpecie species;
	protected List<IAnimal> listAnimaux = new ArrayList<>();
	
	@Before
	public void setUp() throws Exception {
		species = Mockito.mock(ISpecie.class);
		
		//----------------- getArea --------------------\\
		Mockito.when(species.getArea()).thenReturn(1);
		
		
		//----------------- getAnimals --------------------\\
		IAnimal animal1 = Mockito.mock(IAnimal.class);
		IAnimal animal2 = Mockito.mock(IAnimal.class);
		IAnimal animal3 = Mockito.mock(IAnimal.class);
		
		listAnimaux.add(animal1);
		listAnimaux.add(animal2);
		listAnimaux.add(animal3);
		
		Mockito.when(species.getAnimals()).thenReturn(listAnimaux);
		
	}

	@Test
	public void testGetAnimals(){
		assertEquals("getAnimals -- OK",species.getAnimals(),listAnimaux);
	}

	@Test
	public void testGetArea(){
		assertEquals("getArea -- OK", species.getArea(), 1);
	}
}
