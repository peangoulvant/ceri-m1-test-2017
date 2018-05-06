package fr.univavignon.rodeo.implementation;

import java.util.LinkedList;
import java.util.List;

import fr.univavignon.rodeo.api.IEnvironment;
import fr.univavignon.rodeo.api.IEnvironmentProvider;

public class EnvironmentProvider implements IEnvironmentProvider {

	private LinkedList<IEnvironment> envs;
	
	//constructor generated	
	public EnvironmentProvider(LinkedList<IEnvironment> envs) {
		super();
		this.envs = new LinkedList<IEnvironment>();
		this.envs = envs;
	}

	@Override
	public List<String> getAvailableEnvironments() {
		//on retourne le nom de chaque environnement disponibles avec getName
		List<String> availableEnvs = new LinkedList<String>();
		
		for (IEnvironment env : this.envs) {
			availableEnvs.add(env.getName());
		}
		return availableEnvs;
	}

	@Override
	public IEnvironment getEnvironment(String name) throws IllegalArgumentException {
		//à partir du nom, on retourne l'environnement spécifié
		IEnvironment envR = null;
		for (IEnvironment env : envs) {
			if(env.getName().equals(name))
				envR = env;
		}
		return envR;
	}

}
