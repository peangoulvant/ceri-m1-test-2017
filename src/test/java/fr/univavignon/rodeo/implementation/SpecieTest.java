package fr.univavignon.rodeo.implementation;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fr.univavignon.rodeo.interfaces.ISpecieTest;
import fr.univavignon.rodeo.api.*;

public class SpecieTest extends ISpecieTest{

	private Specie specie, specieTest;
    private List<IAnimal> animals, animalsTest;

    @Before
    public void init() {
        animals = Arrays.asList(
        		new Animal("Buffalo Blanc", 1, false, false, false), 		//normal
				new Animal("Buffalo Sacre", 3, true, false, false), 		//secret
				new Animal("Buffalo Rouge", 30, false, true, false) 		//endangered
        );
        specie = new Specie("Buffalo", 1, animals);
    }

    @Test
    public void testGetName() {
        assertEquals("Buffalo", specie.getName());
    }

    @Test
    public void testGetArea() {
        assertEquals(1, specie.getArea());
    }

    @Test
    public void testGetAnimals() {
        assertEquals(animals, specie.getAnimals());
    }
    
    @Test
    public void testEquals() {
        animalsTest = Arrays.asList(
        		new Animal("Buffalo Blanc", 1, false, false, false), 		//normal
				new Animal("Buffalo Sacre", 3, true, false, false), 		//secret
				new Animal("Buffalo Rouge", 30, false, true, false) 		//endangered
        );
        specieTest = new Specie("Buffalo", 1, animalsTest);
        assertEquals(specie, specieTest);
    }

    @Test
    public void testNotEquals() {
        animalsTest = Arrays.asList(
        		new Animal("Buffalo Bleu", 1, false, false, false) 		//normal
        );
        specieTest = new Specie("Buffalo", 1, animalsTest);
        assertNotEquals(specie, specieTest);
    }

    @Test
    public void testNotEquals2() {
        animalsTest = Arrays.asList(
        		new Animal("Buffalo Blanc", 1, false, false, false), 		//normal
				new Animal("Buffalo Sacre", 3, true, false, false), 		//secret
				new Animal("Buffalo Rouge", 30, false, true, false) 		//endangered
        );
        specieTest = new Specie("Buffalo", 42, animalsTest);
        assertNotEquals(specie, specieTest);
    }

    @Test
    public void testNotEquals3() {
        animalsTest = Arrays.asList(
        		new Animal("Buffalo Blanc", 1, false, false, false), 		//normal
				new Animal("Buffalo peureux", 300, true, false, false), 		//secret
				new Animal("Buffalo Rouge", 30, false, true, false) 		//endangered
        );
        specieTest = new Specie("Buffalo", 1, animalsTest);
        assertNotEquals(specie, specieTest);
    }

}
