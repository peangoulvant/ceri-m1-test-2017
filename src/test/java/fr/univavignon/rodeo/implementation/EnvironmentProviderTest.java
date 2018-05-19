package fr.univavignon.rodeo.implementation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.interfaces.IEnvironmentProviderTest;
import fr.univavignon.rodeo.api.*;

public class EnvironmentProviderTest extends IEnvironmentProviderTest {

	private EnvironmentProvider environmentProvider;
	private List<IEnvironment> environments;

	@Before
	public void init() {
		environments = Arrays.asList(
				new Environment("La Savane", 1, Arrays.asList(
						new Specie("Buffalo", 1, Arrays.asList(
								new Animal("Buffalo Blanc", 1, false, false, false), 		//normal
								new Animal("Buffalo Sacre", 3, true, false, false), 		//secret
								new Animal("Buffalo Rouge", 30, false, true, false) 		//endangered
								)),
						new Specie("Zebre", 1, Arrays.asList(
								new Animal("Zebre Blanc", 0, false, false, false),			//normal
								new Animal("Zebre Raye", 25, true, false, false),			//secret
								new Animal("Zebre Rouge Sang", 30, false, true, false)		//endangered
								)),
						new Specie("Elephants", 1, Arrays.asList(
								new Animal("Elephant d'Afrique", 0, false, false, false), 	//normal
								new Animal("Elephant ArcEnCiel", 30, false, false, true) 	//boss
								)),
						new Specie("Lions", 5, Arrays.asList(
								new Animal("Lion de la Savane", 1, false, false, false), 	//normal
								new Animal("Le Lion de Nemee", 5, true, false, false), 		//secret
								new Animal("Le Lion furax", 30, false, true, false) 		//endangered
								))
						)),
				new Environment("Le pole Nord", 1, Arrays.asList(
						new Specie("Ours", 1, Arrays.asList(
								new Animal("Ours polaire", 1, false, false, false), 		//normal
								new Animal("Ours givre", 3, true, false, false) 		//secret
								)),
						new Specie("Loups", 1, Arrays.asList(
								new Animal("Loup arctique", 1, false, false, false), 		//normal
								new Animal("Loup noir", 3, true, false, false) 		//secret
								))
						)
						));
		environmentProvider = new EnvironmentProvider();
	}

	//on test si La Savanne et le pole Nord existent dans la liste des environnements
	@Test
	public void testGetAvailableEnvironments() {
		assertEquals(Arrays.asList("La Savane"), environmentProvider.getAvailableEnvironments());
	}

	@Test
	public void testGetEnvironments() {
		//on test entre deux listes d'environnements
		assertEquals(environments, environmentProvider.getAvailableEnvironments());
		
		//on cree une liste d'environnements differente
		List<IEnvironment> env = Arrays.asList(
				new Environment("La jungle", 1, Arrays.asList(
						new Specie("Singe", 1, Arrays.asList(
								new Animal("Gorille", 1, false, false, false), 		//normal
								new Animal("Bonobo", 1, true, false, false) 		//secret
								))
						))
				);
		assertNotEquals(env, environmentProvider.getAvailableEnvironments());
	}

	@Test
    public void testGetEnvironment() {
        assertEquals(environments.get(0), environmentProvider.getEnvironment("La Savane"));
    }

    @Test
    public void testGetEnvironmentNull() {
        assertEquals(null, environmentProvider.getEnvironment("null"));
    }
	
}
