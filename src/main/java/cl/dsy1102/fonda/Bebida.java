package cl.dsy1102.fonda;

public abstract class Bebida {
    // ATRIBUTOS
    private String nombre;
    private int volumenML;
    private int stock;

    // CONSTRUCTOR
    public Bebida(String nombre, int volumenML, int stock){
        this.nombre = nombre;
        this.volumenML = volumenML;
        this.stock = stock;
    }

    // GETTERS Y SETTERS
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getVolumenML(){
        return this.volumenML;
    }
    public void setVolumenML(int volumenML){
        this.volumenML = volumenML;
    }
    public int getStock(){
        return this.stock;
    }
    public void setStock(int stock){
        this.stock = stock;
    }

    // MÉTODOS ABSTRACTOS
    public abstract double calcularPrecio();
    public abstract String obtenerDetalle();

    // OTROS MÉTODOS
    @Override
    public String toString() {
        return "Nombre: "+this.nombre+" || Volumen: "+this.volumenML+" mL";
    }
}
