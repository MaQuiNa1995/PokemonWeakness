package es.maqui.pokemonweakness.Repositorio;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileNotFoundException;
import java.io.FileReader;

import es.maqui.pokemonweakness.Repositorio.TiposPokemonContract.TiposPokemonEntry;
import es.maqui.pokemonweakness.Servicio.Pokemon;
import es.maqui.pokemonweakness.Servicio.TiposPokemon;

/**
 * Created by MaQuiNa on 10/09/2017.
 */

public class PokemonDbHelper extends SQLiteOpenHelper {


    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "es.maqui.pokemonweakness.Dominio.PokemonPojo.db";

    public PokemonDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // ------------------------------ Create Tables ------------------------------

        db.execSQL("CREATE TABLE " + TiposPokemonEntry.TABLE_NAME + " ("
                + TiposPokemonEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + TiposPokemonEntry.NOMBRE_ELEMENTO + " TEXT NOT NULL,"
                + TiposPokemonEntry.COLOR + " TEXT NOT NULL,"
                + "UNIQUE (" + TiposPokemonEntry._ID + "))"
        );

        db.execSQL("CREATE TABLE " + PokemonContract.PokemonEntry.TABLE_NAME + " ("
                + PokemonContract.PokemonEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + PokemonContract.PokemonEntry.P_POKEMON + " TEXT NOT NULL,"
                + PokemonContract.PokemonEntry.NOMBRE_POKEMON + " TEXT NOT NULL,"
                + PokemonContract.PokemonEntry.A_TIPOS + " INTEGER NOT NULL REFERENCES " + TiposPokemonEntry.TABLE_NAME + "(" + TiposPokemonEntry._ID + ") ON UPDATE CASCADE ,"
                + "UNIQUE (" + PokemonContract.PokemonEntry._ID + "))"
        );


        // ------------------------ Insercion De Datos ------------------------
        insertarObjetos();



        //try (Cursor c = db.query(LawyerEntry.TABLE_NAME,null,null,null,null,null,null)){

        //}



    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    private void insertarObjetos() {
        final Gson gson = new GsonBuilder().create();

        try {
            Pokemon[] pokemon = gson.fromJson(new FileReader("pokedex.json"), Pokemon[].class);

            for (Pokemon pokemonSacado : pokemon) {

                ContentValues valuesPokemon = new ContentValues();
                valuesPokemon.put(PokemonContract.PokemonEntry.NOMBRE_POKEMON, pokemonSacado.getName());

                for (TiposPokemon tiposPokemonSacado : pokemonSacado.getTypes()) {
                    ContentValues valuesTiposPokemon = new ContentValues();

                    valuesTiposPokemon.put(TiposPokemonEntry.COLOR, tiposPokemonSacado.getColor());
                    valuesTiposPokemon.put(TiposPokemonEntry.NOMBRE_ELEMENTO, tiposPokemonSacado.getNombreTipo());

                    valuesPokemon.put(PokemonContract.PokemonEntry.A_TIPOS, tiposPokemonSacado.getID_());

                    // Insertar Tipos
                    db.insert(TiposPokemonEntry.TABLE_NAME, null, valuesTiposPokemon);
                }
                // Insertar Pokemon
                db.insert(PokemonContract.PokemonEntry.TABLE_NAME, null, valuesPokemon);
            }

        } catch (FileNotFoundException ex) {

        }
    }


}
