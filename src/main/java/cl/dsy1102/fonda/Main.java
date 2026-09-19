package cl.dsy1102.fonda;

/**
 * Punto de entrada de la Tarea Fiestas Patrias - Fonda San Belarmino.
 *
 * Revisa el enunciado en README.md. Debes crear, en este mismo paquete,
 * las clases del diagrama: Bebida, BebidaAlcoholica, BebidaSinAlcohol,
 * la interfaz ConsumoResponsable y la clase GestorFonda.
 */
public class Main {

    public static void main(String[] args) {
        // TODO 1: instanciar las cuatro bebidas con los datos del enunciado.
        // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.
        // TODO 3: registrarlas todas en el gestor.
        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.
        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.


        Bebida pepsi = new BebidaSinAlcohol("Pepsi",150, 200, 85);
        Bebida agua = new BebidaSinAlcohol("Agua", 500, 400, 0);
        Bebida cerveza = new BebidaAlcoholica("Heineken",200,300,12.0,true);

        System.out.println(pepsi.obtenerDetalle());
        System.out.println(cerveza.obtenerDetalle());

        GestorFonda gestor = new GestorFonda();
        gestor.registrar(pepsi);
        gestor.registrar(cerveza);
        gestor.registrar(agua);
        gestor.buscarPorNombre("Pepsi");
        gestor.buscarPorNombre("Agua");
        gestor.buscarPorNombre("Tónica");
        gestor.obtenerTodas();
        System.out.println("Proyecto listo. Comienza por la clase Bebida.");


    }


}
