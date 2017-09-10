package es.maqui.pokemonweakness.Dominio;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MaQuiNa
 */
public class TiposPokemon {
    private int p_tipopokemon;
    private String nombreElemento;
    private String color;

    public TiposPokemon(int id, String nombreElemento, String color) {
        this.p_tipopokemon = id;
        this.nombreElemento = nombreElemento;
        this.color = color;
    }

    public int getP_tipopokemon() {
        return p_tipopokemon;
    }

    public void setP_tipopokemon(int p_tipopokemon) {
        this.p_tipopokemon = p_tipopokemon;
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
        return "es.maqui.pokemonweakness.Dominio.TiposPokemon{" + "id=" + p_tipopokemon + ", nombreElemento=" + nombreElemento + ", color=" + color + '}';
    }
    
        
    
}
