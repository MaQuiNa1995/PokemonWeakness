package es.maqui.pokemonweakness.Servicio;

public class TiposPokemon {
    private int ID_;
    private String type;
    private String color;

    public TiposPokemon(String nombreTipo, String color) {
        this.type = nombreTipo;
        this.color = color;
    }

    public String getNombreTipo() {
        return type;
    }

    public void setNombreTipo(String nombreTipo) {
        this.type = nombreTipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getID_() {
        return ID_;
    }

    public void setID_(int ID_) {
        this.ID_ = ID_;
    }

    @Override
    public String toString() {
        return "TiposPokemonPojo{" + "nombreTipo=" + type + ", color=" + color + '}';
    }
    
    
}
