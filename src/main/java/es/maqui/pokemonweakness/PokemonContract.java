package es.maqui.pokemonweakness;

import android.provider.BaseColumns;

/**
 * Created by MaQuiNa on 10/09/2017.
 */

public class PokemonContract {


        public static abstract class LawyerEntry implements BaseColumns {
            public static final String TABLE_NAME ="POKEMON";
            public static final String P_POKEMON = "p_pokemon";
            public static final String NOMBRE = "nombre";
            public static final String A_TIPOS = "a_tipos";
        }

}
