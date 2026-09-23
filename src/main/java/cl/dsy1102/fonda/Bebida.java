package cl.dsy1102.fonda;

public abstract class Bebida {
    // ATRIBUTOS
    private String nombre;
    private int volumenML;
    private int stock;

    // CONSTRUCTOR
    public Bebida(String nombre, int volumenML, int stock){
        setNombre(nombre);
        setVolumenML(volumenML);
        setStock(stock);
        // Acá incluí setters en el constructor siguiendo el enunciado del ejercicio:
        // (2. Información Necesaria. "Los constructores deben delegar la asignación de valores a los métodos setter,
        // de modo que las validaciones definidas se apliquen desde la construcción del objeto")
    }

    // GETTERS Y SETTERS
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre) throws IllegalArgumentException {
        if(nombre != null && nombre.length() != 0){
            this.nombre = nombre;
        }else{
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
    }
    public int getVolumenML(){
        return this.volumenML;
    }
    public void setVolumenML(int volumenML) throws IllegalArgumentException {
        if (100 <= volumenML && volumenML <= 3000){
            this.volumenML = volumenML;
        }else{
            throw new IllegalArgumentException("El volumen de la bebida debe ser entre 100 - 3000 mL.");
        }
    }
    public int getStock(){
        return this.stock;
    }
    public void setStock(int stock) throws IllegalArgumentException{
        if (0 < stock){
            this.stock = stock;
        }else{
            throw new IllegalArgumentException("El stock debe ser un valor mayor que cero.");
        }
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
