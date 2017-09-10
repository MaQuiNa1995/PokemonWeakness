package es.maqui.pokemonweakness.Servicio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOG = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        final Gson gson = new GsonBuilder().create();

        try {
            Pokemon[] pokemon = gson.fromJson(new FileReader("pokedex.json"), Pokemon[].class);
            
            System.out.println(pokemon.length);
            
        } catch (FileNotFoundException ex) {
            LOG.warning(ex.getMessage());
        }

    }
}

