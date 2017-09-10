package es.maqui.pokemonweakness;

import android.provider.BaseColumns;

/**
 * Created by MaQuiNa on 10/09/2017.
 */

public class TiposPokemonContract {

        public static abstract class LawyerEntry implements BaseColumns {
            public static final String TABLE_NAME ="TIPOS_POKEMON";
            public static final String P_POKEMON = "p_tipopokemon";
            public static final String NOMBRE_ELEMENTO_ = "nombreElemento";
            public static final String COLOR = "color";
        }

}
