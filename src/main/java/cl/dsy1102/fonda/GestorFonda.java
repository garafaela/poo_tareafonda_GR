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

    /// public void vender(String nombre, int unidades){}

    public void obtenerTodas(){
        for(Bebida drink : bebidas){
            System.out.println(drink.obtenerDetalle());
        }
    }

}


