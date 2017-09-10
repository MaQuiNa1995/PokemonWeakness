package es.maqui.pokemonweakness.Repositorio;

import android.provider.BaseColumns;

/**
 * Created by MaQuiNa on 10/09/2017.
 */

public class TiposPokemonContract {

        public static abstract class TiposPokemonEntry implements BaseColumns {
            public static final String TABLE_NAME ="TIPOS_POKEMON";
            public static final String P_TIPOS_POKEMON = "p_tipopokemon";
            public static final String NOMBRE_ELEMENTO = "nombreElemento";
            public static final String COLOR = "color";
        }

}
