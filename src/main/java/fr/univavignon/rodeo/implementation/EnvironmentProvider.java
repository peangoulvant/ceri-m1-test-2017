package fr.univavignon.rodeo.implementation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class EnvironmentProvider implements IEnvironmentProvider {

	private Map<String, Boolean> availableEnvironments;

    EnvironmentProvider() {
        availableEnvironments = new HashMap<>();
        int count = 0;
        for (Iterator<IEnvironment> iterator = environments.iterator(); iterator.hasNext(); ) {
            IEnvironment env = iterator.next();
            boolean available = false;
            if (count++ == 0)
                available = true;
            availableEnvironments.put(env.getName(), available);
        }
    }
    private List<IEnvironment> environments = Arrays.asList(
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

    @Override
	public List<String> getAvailableEnvironments() {
		Vector<String> result = new Vector<>();
        availableEnvironments.forEach((key, value) -> {
            if (value)
                result.add(key);
        });

		return result;
	}

    @Override
    public IEnvironment getEnvironment(String name) throws IllegalArgumentException {
        assert name != null : "getEnvironment(String name) -> null argument";

        return environments.stream().filter(oEnv -> oEnv.getName().equals(name)).findFirst().orElse(null);
    }

	//todo : rajouter pour les test imp
	public List<IEnvironment> getEnvironments() {
		return this.environments;
	}

    public void unlockNextEnvironment() {
        for (Iterator<Map.Entry<String, Boolean>> iterator = availableEnvironments.entrySet().iterator(); iterator.hasNext(); ) {
            Map.Entry<String, Boolean> entry = iterator.next();
            if (!entry.getValue()) {
                entry.setValue(true);
                break;
            }
        }
    }

    public boolean stillAreaToExplore() {
        return this.getAvailableEnvironments().size() != environments.size();
    }
}
