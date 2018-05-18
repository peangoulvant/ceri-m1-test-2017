package fr.univavignon.rodeo.api;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.ISpecie;


public class IEnvironmentTest {

	@Mock
	protected IEnvironment env;
	protected List<ISpecie> listSpecies = new ArrayList<>();

	@Before
	public void setUp() throws Exception {
		env = Mockito.mock(IEnvironment.class);
		//----------------- getAreas --------------------\\
		Mockito.when(env.getAreas()).thenReturn(3); //sands, forest and ice
		
		//----------------- getSpecies --------------------\\
		//initialisation species pour 3 terrains
		ISpecie sp1 = Mockito.mock(ISpecie.class);
		ISpecie sp2 = Mockito.mock(ISpecie.class);
		ISpecie sp3 = Mockito.mock(ISpecie.class);
		
		//on les ajoute dans la liste
		listSpecies.add(sp1);
		listSpecies.add(sp2);
		listSpecies.add(sp3);
		
		Mockito.when(env.getSpecies()).thenReturn(listSpecies);
	}

	@Test
	public void testGetAreas() {
		assertEquals("GetArears -- OK", env.getAreas(), 3);
	}

	@Test
	public void testGetSpecies() {
		assertEquals("GetSpecies -- OK", env.getSpecies(), listSpecies);		
	}

}
