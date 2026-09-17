package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable{
    // ATRIBUTOS
    private double gradoAlcohol;
    private boolean certificada;
    private boolean ventaRestringida;

    // CONSTRUCTOR
    public BebidaAlcoholica(String nombre, int volumenML, int stock, double gradoAlcohol, boolean certificada){
        super(nombre, volumenML, stock);
        this.gradoAlcohol = gradoAlcohol;
        this.certificada = certificada;
        this.ventaRestringida = false;
    }

    // GETTER Y SETTER
    public double getGradoAlcohol(){
        return this.gradoAlcohol;
    }
    public void setGradoAlcohol(double gradoAlcohol){
        this.gradoAlcohol = gradoAlcohol;
    }
    public boolean isCertificada(){
        return this.certificada;
    }
    public void setCertificada(boolean certificada){
        this.certificada = certificada;
    }

    // MÉTODOS SOBREESCRITOS HEREDADOS
    @Override
    public double calcularPrecio(){
        double precio = 3500;
        if (this.certificada == false){
            precio += precio*0.2;
        }
        return precio;
    }

    @Override
    public String obtenerDetalle(){
        String cert = "No";
        if (isCertificada() == true){
            cert = "Si";
        }
        String detalle = "Tipo: Bebida Alcohólica || Nombre: "+getNombre()+
                " || Volumen: "+getVolumenML()+
                " mL || Stock: "+ getStock()+
                " || Grados: "+getGradoAlcohol()+
                " || Certificada: "+cert+
                " || Precio: $"+ calcularPrecio();
        return detalle;
    }

    // MÉTODOS INTERFAZ
    @Override
    public boolean tieneVentaRestringida(){
        return this.ventaRestringida;
    }

    @Override
    public void restringirVenta(){
        this.ventaRestringida = true;
    }

    @Override
    public boolean superaLimite(int unidades){
        int limite = 3;
        if (unidades>limite){
            return true;
        }else{
            return false;
        }
    }

}
