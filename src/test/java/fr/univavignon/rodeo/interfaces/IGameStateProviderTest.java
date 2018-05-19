package fr.univavignon.rodeo.interfaces;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

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
		Mockito.when(gameStateProvider.get("TestGameState")).thenReturn(gameState);
		Mockito.when(gameStateProviderNull.get(null)).thenThrow(new IllegalArgumentException());
		
	}	
	
	@Test
	public void testGetGameStateProvider(){
		assertEquals("getGameStateProvider -- OK", gameStateProvider.get("TestGameState"), gameState);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGetGameStateProviderNull(){
		gameStateProviderNull.get(null);
	}
}
