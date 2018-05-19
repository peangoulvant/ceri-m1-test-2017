package fr.univavignon.rodeo.implementation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.interfaces.IEnvironmentTest;
import fr.univavignon.rodeo.api.*;

public class EnvironmentTest extends IEnvironmentTest {

	private Environment environment, environmentTest;
	private List<ISpecie> species, speciesTest;

	@Before
	public void init() {
		species = Arrays.asList(
				new Specie("Buffalo", 1, Arrays.asList(
						new Animal("Buffalo Blanc", 1, false, false, false), 		//normal
						new Animal("Buffalo Sacré", 3, true, false, false), 		//secret
						new Animal("Buffalo Rouge", 30, false, true, false) 		//endangered
						)),
				new Specie("Zebre", 1, Arrays.asList(
						new Animal("Zebre Blanc", 0, false, false, false),			//normal
						new Animal("Zebre Rayé", 25, true, false, false),			//secret
						new Animal("Zebre Rouge Sang", 30, false, true, false)		//endangered
						)),
				new Specie("Elephants", 1, Arrays.asList(
						new Animal("Elephant d'Afrique", 0, false, false, false), 	//normal
						new Animal("Elephant Arc-en-ciel", 30, false, false, true) 	//boss
						)),
				new Specie("Lions", 5, Arrays.asList(
						new Animal("Lion de la Savane", 1, false, false, false), 	//normal
						new Animal("Le Lion de Némée", 5, true, false, false), 		//secret
						new Animal("Le Lion furax", 30, false, true, false) 		//endangered
						))
				);
		//on met la liste species dans environment
		environment = new Environment("La Savanne", 1, species);
	}

	@Test
	public void testGetAreas() {
		assertEquals(1, environment.getAreas());
	}

	@Test
	public void testGetSpecies() {
		assertEquals(species, environment.getSpecies());
	}

	@Test
	public void testEquals() {
		speciesTest = Arrays.asList(
				new Specie("Buffalo", 1, Arrays.asList(
						new Animal("Buffalo Blanc", 1, false, false, false), 		//normal
						new Animal("Buffalo Sacré", 3, true, false, false), 		//secret
						new Animal("Buffalo Rouge", 30, false, true, false) 		//endangered
						)),
				new Specie("Zebre", 1, Arrays.asList(
						new Animal("Zebre Blanc", 0, false, false, false),			//normal
						new Animal("Zebre Rayé", 25, true, false, false),			//secret
						new Animal("Zebre Rouge Sang", 30, false, true, false)		//endangered
						)),
				new Specie("Elephants", 1, Arrays.asList(
						new Animal("Elephant d'Afrique", 0, false, false, false), 	//normal
						new Animal("Elephant Arc-en-ciel", 30, false, false, true) 	//boss
						)),
				new Specie("Lions", 5, Arrays.asList(
						new Animal("Lion de la Savane", 1, false, false, false), 	//normal
						new Animal("Le Lion de Némée", 5, true, false, false), 		//secret
						new Animal("Le Lion furax", 30, false, true, false) 		//endangered
						))
				);
		//on met la liste speciesTest dans environementTest avant de comparer
		environmentTest = new Environment("La Savanne", 1, speciesTest);
		assertEquals(environment, environmentTest);
	}

	//Ici on change que le nom de l'environment
	@Test
	public void testNotEquals() {
		speciesTest = Arrays.asList(
				new Specie("Buffalo", 1, Arrays.asList(
						new Animal("Buffalo Blanc", 1, false, false, false), 		//normal
						new Animal("Buffalo Sacré", 3, true, false, false), 		//secret
						new Animal("Buffalo Rouge", 30, false, true, false) 		//endangered
						)),
				new Specie("Zebre", 1, Arrays.asList(
						new Animal("Zebre Blanc", 0, false, false, false),			//normal
						new Animal("Zebre Rayé", 25, true, false, false),			//secret
						new Animal("Zebre Rouge Sang", 30, false, true, false)		//endangered
						)),
				new Specie("Elephants", 1, Arrays.asList(
						new Animal("Elephant d'Afrique", 0, false, false, false), 	//normal
						new Animal("Elephant Arc-en-ciel", 30, false, false, true) 	//boss
						)),
				new Specie("Lions", 5, Arrays.asList(
						new Animal("Lion de la Savane", 1, false, false, false), 	//normal
						new Animal("Le Lion de Némée", 5, true, false, false), 		//secret
						new Animal("Le Lion furax", 30, false, true, false) 		//endangered
						))
				);
		//on met la liste speciesTest dans environementTest avant de comparer
		environmentTest = new Environment("L'Enfer", 1, speciesTest);
		assertNotEquals(environment, environmentTest);
	}

	//Ici on change quelques animaux pour le même environment
	@Test
	public void testNotEquals2() {
		speciesTest = Arrays.asList(
				new Specie("Buffalo", 1, Arrays.asList(
						new Animal("Buffalo Blanc", 1, false, false, false), 		//normal
						new Animal("Buffalo Sacré", 3, true, false, false), 		//secret
						new Animal("Buffalo d'Amérique", 30, false, true, false) 		//endangered
						)),
				new Specie("Zebre", 1, Arrays.asList(
						new Animal("Zebre Blanc", 0, false, false, false),			//normal
						new Animal("Zebre Rayé", 25, true, false, false),			//secret
						new Animal("Zebre Arc-en-Ciel", 30, false, true, false)		//endangered
						)),
				new Specie("Elephants", 1, Arrays.asList(
						new Animal("Elephant d'Afrique", 0, false, false, false), 	//normal
						new Animal("Elephant Squelette", 30, false, false, true) 	//boss
						)),
				new Specie("Lions", 5, Arrays.asList(
						new Animal("Lion de la Savane", 1, false, false, false), 	//normal
						new Animal("Le Lion Blanc", 5, true, false, false), 		//secret
						new Animal("Le Lion Rouge", 30, false, true, false) 		//endangered
						))
				);
		//on met la liste speciesTest dans environementTest avant de comparer
		environmentTest = new Environment("La Savanne", 1, speciesTest);
		assertNotEquals(environment, environmentTest);
	}
	
	//Ici deux animaux pour le même environment
		@Test
		public void testNotEquals3() {
			speciesTest = Arrays.asList(
					new Specie("Buffalo", 1, Arrays.asList(
							new Animal("Buffalo Blanc", 1, false, false, false), 		//normal
							new Animal("Buffalo Sacré", 3, true, false, false), 		//secret
							new Animal("Buffalo Rouge", 30, false, true, false) 		//endangered
							)),
					new Specie("Zebre", 1, Arrays.asList(
							new Animal("Zebre Blanc", 0, false, false, false),			//normal
							new Animal("Zebre Rayé", 25, true, false, false),			//secret
							new Animal("Zebre Rouge Sang", 30, false, true, false)		//endangered
							))
					);
			//on met la liste speciesTest dans environementTest avant de comparer
			environmentTest = new Environment("La Savanne", 1, speciesTest);
			assertNotEquals(environment, environmentTest);
		}

}
