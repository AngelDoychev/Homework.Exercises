package JavaAdvance.DefiningClasses.Exercise.PokemonTrainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges = 0;
    private List<Pokemon> pokemonCollection = new ArrayList<>();

    public Trainer(String name, String pokemonName, String element, int health) {
        this.name = name;
        Pokemon currentPokemon = new Pokemon(pokemonName, element, health);
        this.pokemonCollection.add(currentPokemon);
    }

    public String getName() {
        return name;
    }

    public int getBadges() {
        return badges;
    }

    public List<Pokemon> getPokemonCollection() {
        return pokemonCollection;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBadges() {
        this.badges++;
    }

    public void setPokemonCollection(List<Pokemon> pokemonCollection) {
        this.pokemonCollection = pokemonCollection;
    }
}
