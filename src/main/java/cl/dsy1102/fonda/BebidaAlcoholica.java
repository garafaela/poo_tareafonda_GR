package cl.dsy1102.fonda;

public class BebidaAlcoholica extends Bebida implements ConsumoResponsable{
    // CONSTANTE DE CLASE
    public static final int LIMITE_UNIDADES_POR_CLIENTE = 3;

    // ATRIBUTOS
    private double gradoAlcohol;
    private boolean certificada;
    private boolean ventaRestringida;

    // CONSTRUCTOR
    public BebidaAlcoholica(String nombre, int volumenML, int stock, double gradoAlcohol, boolean certificada){
        super(nombre, volumenML, stock);
        setGradoAlcohol(gradoAlcohol);
        this.certificada = certificada;
        this.ventaRestringida = false;
    }

    // GETTER Y SETTER
    public double getGradoAlcohol(){
        return this.gradoAlcohol;
    }
    public void setGradoAlcohol(double gradoAlcohol) throws IllegalArgumentException{
        if (0.5 <= gradoAlcohol && gradoAlcohol <= 45){
            this.gradoAlcohol = gradoAlcohol;
        }else{
            throw new IllegalArgumentException("Grado alcohol debe estar entre 0.5 - 45.");
        }
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
        if (unidades>LIMITE_UNIDADES_POR_CLIENTE){
            return true;
        }else{
            return false;
        }
    }

}
