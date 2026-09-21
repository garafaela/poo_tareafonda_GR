package cl.dsy1102.fonda;
import java.util.ArrayList;
import java.util.List;

public class GestorFonda {
    // ATRIBUTOS
    private List<Bebida> bebidas;

    // CONTRUCTOR
    public GestorFonda() {
        this.bebidas = new ArrayList<Bebida>();
    }

    // MÉTODOS
    public void registrar(Bebida bebida) {
        bebidas.add(bebida);
    }

    public void buscarPorNombre(String nombre) {
        System.out.println("---- BÚSQUEDA POR NOMBRE ----");
        System.out.println("Búsqueda: " + nombre);
        int num = 0;
        for (Bebida drink : bebidas) {
            if (drink.getNombre().equals(nombre)) {
                System.out.println(drink.obtenerDetalle());
                num+= 1;
            }
        }
        if (num == 0){
            System.out.println("No se encontraron bebidas con ese nombre.");
        }
    }

    public void vender(String nombre, int unidades){
        int num = 0;
        for (Bebida drink : bebidas){
            if(drink.getNombre().equals(nombre)){
                if (drink instanceof ConsumoResponsable){
                    if (((ConsumoResponsable) drink).tieneVentaRestringida() == false){
                        if (((ConsumoResponsable) drink).superaLimite(unidades) == false){
                            System.out.println("Venta Autorizada: "+unidades+" "+drink.getNombre());
                            System.out.println("Total a Pagar: $"+drink.calcularPrecio()*unidades);
                            drink.setStock(drink.getStock()-unidades);
                        }else{
                            System.out.println("Venta Rechazada: "+unidades+" unidades de "+drink.getNombre()+"superan el límite de 3 por cliente.");
                        }
                    }else{
                        System.out.println("Venta Rechazada: "+drink.getNombre()+" tiene la venta restringida.");
                    }
                }else{
                    System.out.println("Venta Autorizada: "+unidades+" "+drink.getNombre());
                    System.out.println("Total a Pagar: $"+drink.calcularPrecio()*unidades);
                    drink.setStock(drink.getStock()-unidades);
                }
            }else{
                num+=1;
            }
        } if (num == 0){
            System.out.println("No se encontró una bebida con ese nombre.");
        }
    }

    public void obtenerTodas(){
        for(Bebida drink : bebidas){
            System.out.println(drink.obtenerDetalle());
        }
    }

}


