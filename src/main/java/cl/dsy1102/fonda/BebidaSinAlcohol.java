package cl.dsy1102.fonda;

public class BebidaSinAlcohol extends Bebida {
    // ATRIBUTOS
    private int azucarPorLitro;

    // CONSTRUCTOR
    public BebidaSinAlcohol(String nombre, int volumenMl, int stock, int azucarPorLitro){
        super(nombre, volumenMl,stock);
        this.azucarPorLitro = azucarPorLitro;
    }

    // GETTERS Y SETTERS
    public int getAzucarPorLitro(){
        return this.azucarPorLitro;
    }
    public void setAzucarPorLitro(int azucarPorLitro){
        this.azucarPorLitro = azucarPorLitro;
    }

    // MÉTODOS SOBREESCRITOS HEREDADOS
    @Override
    public double calcularPrecio(){
        double precio = 2000;
        if (this.azucarPorLitro > 80){
            precio += precio*0.1;
        }
        return precio;
    }

    @Override
    public String obtenerDetalle(){
        String detalle = "Tipo: Bebida Sin Alcohol || Nombre: "+getNombre()+
                " || Volumen: "+getVolumenML()+" mL || Stock: "+
                getStock()+" || Azúcar: "+getAzucarPorLitro()+" g/L || Precio: $"+
                calcularPrecio();
        return detalle;
    }


}
