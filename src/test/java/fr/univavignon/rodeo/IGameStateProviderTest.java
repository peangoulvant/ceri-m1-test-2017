package fr.univavignon.rodeo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import fr.univavignon.rodeo.api.IGameState;
import fr.univavignon.rodeo.api.IGameStateProvider;

public class IGameStateProviderTest {

	@Mock
	protected IGameStateProvider gameStateProvider, gameStateProviderNull;
	protected IGameState gameState;

	
	@Before
	public void setUp() throws Exception {
		gameStateProvider = Mockito.mock(IGameStateProvider.class);
		gameState = Mockito.mock(IGameState.class);
		gameStateProviderNull = Mockito.mock(IGameStateProvider.class);
		
		//----------------- get --------------------\\
		Mockito.when(gameStateProvider.get("testName")).thenReturn(gameState);
		Mockito.when(gameStateProviderNull.get(null)).thenThrow(new IllegalArgumentException());
		
	}	
	
	@Test
	public void testGetGameStateProvider() throws IllegalArgumentException{
		assertEquals("getGameStateProvider -- OK", gameStateProvider.get("testName"), gameState);
	}

	@Test
	public void testGetGameStateProviderNull() throws IllegalArgumentException{
		gameStateProviderNull.get(null);
	}
}
