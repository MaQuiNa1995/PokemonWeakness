package es.maqui.pokemonweakness.Repositorio;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import es.maqui.pokemonweakness.Repositorio.TiposPokemonContract.TiposPokemonEntry;

/**
 * Created by MaQuiNa on 10/09/2017.
 */

public class PokemonDbHelper extends SQLiteOpenHelper {


    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "es.maqui.pokemonweakness.Dominio.Pokemon.db";

    public PokemonDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // ------------------------------ Create Tables ------------------------------

        db.execSQL("CREATE TABLE " + TiposPokemonEntry.TABLE_NAME + " ("
                + TiposPokemonEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + TiposPokemonEntry.P_TIPOS_POKEMON + " TEXT NOT NULL,"
                + TiposPokemonEntry.NOMBRE_ELEMENTO + " TEXT NOT NULL,"
                + "UNIQUE (" + TiposPokemonEntry._ID + "))"
        );

        db.execSQL("CREATE TABLE " + PokemonContract.PokemonEntry.TABLE_NAME + " ("
                + PokemonContract.PokemonEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + PokemonContract.PokemonEntry.P_POKEMON + " TEXT NOT NULL,"
                + PokemonContract.PokemonEntry.NOMBRE_POKEMON + " TEXT NOT NULL,"
                + PokemonContract.PokemonEntry.A_TIPOS + " INTEGER NOT NULL REFERENCES "+TiposPokemonEntry.TABLE_NAME+"("+TiposPokemonEntry.P_TIPOS_POKEMON+") ON UPDATE CASCADE ,"
                + "UNIQUE (" + PokemonContract.PokemonEntry._ID + "))"
        );

        // ------------------------ Insercion De Datos ------------------------
        ContentValues valuesTipoPokemon = new ContentValues();
        valuesTipoPokemon.put(TiposPokemonEntry._ID, "");
        valuesTipoPokemon.put(TiposPokemonEntry.P_TIPOS_POKEMON, "");
        valuesTipoPokemon.put(TiposPokemonEntry.NOMBRE_ELEMENTO, "");

        // Insertar...
        db.insert(TiposPokemonEntry.TABLE_NAME, null, valuesTipoPokemon);

        ContentValues valuesPokemon = new ContentValues();
        valuesPokemon.put(PokemonContract.PokemonEntry._ID, "");
        valuesPokemon.put(PokemonContract.PokemonEntry.P_POKEMON, "");
        valuesPokemon.put(PokemonContract.PokemonEntry.NOMBRE_POKEMON, "");

        // Insertar...
        db.insert(PokemonContract.PokemonEntry.TABLE_NAME, null, valuesPokemon);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
