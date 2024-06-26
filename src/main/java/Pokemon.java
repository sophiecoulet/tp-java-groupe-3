package main.java;

import main.java.PokemonUtils.Location;

public class Pokemon {
	
	private int id;
	private String name;
	private int level;
	private int experience;
	private PokemonSpecie specie;
	private int currentLifePoints;
	private int maxLifePoints;
	private Attack attack;

	public Pokemon(int id, String name, int level, int experience, PokemonSpecie specie, int currentLifePoints,
			int maxLifePoints, Attack attack) {
		this.id = id;
		this.name = name;
		this.level = level;
		this.experience = experience;
		this.specie = specie;
		this.currentLifePoints = currentLifePoints;
		this.maxLifePoints = maxLifePoints;
		this.attack = attack;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public PokemonSpecie getSpecie() {
		return specie;
	}
	public void setSpecie(PokemonSpecie specie) {
		this.specie = specie;
	}
	public int getCurrentLifePoints() {
		return currentLifePoints;
	}
	public void setCurrentLifePoints(int currentLifePoints) {
		this.currentLifePoints = currentLifePoints;
	}
	public int getMaxLifePoints() {
		return maxLifePoints;
	}
	public void setMaxLifePoints(int maxLifePoints) {
		this.maxLifePoints = maxLifePoints;
	}
	public Attack getAttack() {
		return attack;
	}
	public void setAttack(Attack attack) {
		this.attack = attack;
	}

	public static void promenade(Pokemon pokemon, Location endroit){
		if((pokemon.getSpecie().getType() == PokemonUtils.SpecieType.EAU && endroit == PokemonUtils.Location.Plage)
		|| (pokemon.getSpecie().getType() == PokemonUtils.SpecieType.INSECTE && endroit == PokemonUtils.Location.Jungle)
		|| (pokemon.getSpecie().getType() == PokemonUtils.SpecieType.FEU && endroit == PokemonUtils.Location.Volcan)
		|| (pokemon.getSpecie().getType() == PokemonUtils.SpecieType.AIR && endroit == PokemonUtils.Location.Désert)){
			System.out.println("Le pokemon a apprécié la promenade.");
		}else {
			System.out.println("Le pokemon n'a pas apprécié la promenade.");
		}
	}
	
}
