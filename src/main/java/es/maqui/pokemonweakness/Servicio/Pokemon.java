package es.maqui.pokemonweakness.Servicio;

import es.maqui.pokemonweakness.Servicio.TiposPokemon;
import java.util.Arrays;

public class Pokemon {

    private String name;
    private String rarity;
    private TiposPokemon[] types;

    public Pokemon(String name, String rarity, TiposPokemon[] types) {
        this.name = name;
        this.rarity = rarity;
        this.types = types;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public TiposPokemon[] getTypes() {
        return types;
    }

    public void setTypes(TiposPokemon[] types) {
        this.types = types;
    }

    @Override
    public String toString() {
        return "PokemonPojo{" + "name=" + name + ", rarity=" + rarity + ", types=" + Arrays.toString(types) + '}';
    }

    
}
