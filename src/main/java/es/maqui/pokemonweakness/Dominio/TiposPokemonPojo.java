package es.maqui.pokemonweakness.Dominio;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MaQuiNa
 */
public class TiposPokemonPojo {
    private int _ID;
    private String nombreElemento;
    private String color;

    public TiposPokemonPojo(int _ID, String nombreElemento, String color) {
        this._ID = _ID;
        this.nombreElemento = nombreElemento;
        this.color = color;
    }

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public String getNombreElemento() {
        return nombreElemento;
    }

    public void setNombreElemento(String nombreElemento) {
        this.nombreElemento = nombreElemento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "es.maqui.pokemonweakness.Dominio.TiposPokemonPojo{" + "_ID=" + _ID + ", nombreElemento=" + nombreElemento + ", color=" + color + '}';
    }
    
        
    
}
