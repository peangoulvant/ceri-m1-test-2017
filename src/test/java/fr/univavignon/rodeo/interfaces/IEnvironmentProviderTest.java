package fr.univavignon.rodeo.interfaces;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class IEnvironmentProviderTest {
	
	@Mock
	protected IEnvironmentProvider envProv, envProvNull;
	protected IEnvironment env;
	private static List<String> listEnvironnementProvider = Arrays.asList("sands","forest","ice");
	
	@Before
	public void setUp() throws Exception {
		envProv = Mockito.mock(IEnvironmentProvider.class);
		envProvNull = Mockito.mock(IEnvironmentProvider.class);
		
		//----------------- getEnvironment --------------------\\
		Mockito.when(envProvNull.getEnvironment(null)).thenThrow(new IllegalArgumentException());
		
		env = Mockito.mock(IEnvironment.class);
		
		//----------------- getName --------------------\\
		Mockito.when(env.getName()).thenReturn("ice");
		
		//----------------- getAvailableEnvironments --------------------\\
		Mockito.when(envProv.getAvailableEnvironments()).thenReturn(listEnvironnementProvider);
		
		//----------------- getEnvironment --------------------\\
		Mockito.when(envProv.getEnvironment("ice")).thenReturn(env);
	}


	@Test
	public void testGetAvailableEnvironments() {
		assertEquals("GetAvailableEnvironments -- OK", envProv.getAvailableEnvironments(), listEnvironnementProvider);
	}

	@Test
	public void testGetEnvironment() throws IllegalArgumentException {
		assertEquals("GetEnvironment -- OK", envProv.getEnvironment("ice"), env);
	}

}
