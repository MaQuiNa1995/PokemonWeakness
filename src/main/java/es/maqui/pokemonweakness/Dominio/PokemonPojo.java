package es.maqui.pokemonweakness.Dominio;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MaQuiNa
 */
public class PokemonPojo {

    private int _ID;
    private String nombre;
    private int a_tipos;

    public PokemonPojo(int _ID, String name, int a_tipos) {
        this._ID = _ID;
        this.nombre = name;
        this.a_tipos = a_tipos;
    }

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getA_tipos() {
        return a_tipos;
    }

    public void setA_tipos(int a_tipos) {
        this.a_tipos = a_tipos;
    }

    @Override
    public String toString() {
        return "es.maqui.pokemonweakness.Dominio.PokemonPojo{" + "_ID=" + _ID + ", name=" + nombre + ", a_tipos=" + a_tipos + '}';
    }
    
    
}
