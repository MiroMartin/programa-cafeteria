package mycompany.logica;

public class Mesa {
    private int numMesa;
    private String nomCamarero;
    private Articulo articulos;
    
    public Mesa() {
    }

    public Mesa(int numMesa, String nomCamarero, Articulo articulos) {
        this.numMesa = numMesa;
        this.nomCamarero = nomCamarero;
        this.articulos = articulos;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public String getNomCamarero() {
        return nomCamarero;
    }

    public Articulo getArticulos() {
        return articulos;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public void setNomCamarero(String nomCamarero) {
        this.nomCamarero = nomCamarero;
    }

    public void setArticulos(Articulo articulos) {
        this.articulos = articulos;
    }

    
}
