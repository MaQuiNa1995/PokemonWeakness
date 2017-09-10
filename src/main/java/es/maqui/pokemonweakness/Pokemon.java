

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MaQuiNa
 */
public class Pokemon {

    private int p_pokemon;
    private String nombre;
    private int a_tipos;

    public Pokemon(int p_pokemon, String name, int a_tipos) {
        this.p_pokemon = p_pokemon;
        this.nombre = name;
        this.a_tipos = a_tipos;
    }

    public int getP_pokemon() {
        return p_pokemon;
    }

    public void setP_pokemon(int p_pokemon) {
        this.p_pokemon = p_pokemon;
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
        return "Pokemon{" + "p_pokemon=" + p_pokemon + ", name=" + nombre + ", a_tipos=" + a_tipos + '}';
    }
    
    
}
