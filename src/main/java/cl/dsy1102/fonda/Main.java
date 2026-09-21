package cl.dsy1102.fonda;

import java.util.List;

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
        Bebida chicha = new BebidaAlcoholica("Chicha",1000,40,12,false);
        Bebida piscoSour = new BebidaAlcoholica("Pisco Sour",500,25,18,true);
        Bebida chichaSinAlcohol = new BebidaSinAlcohol("Chicha",1000,60,95);
        Bebida moteConHuesillo = new BebidaSinAlcohol("Mote Con Huesillo",400,50,70);

        // TODO 2: marcar la bebida alcoholica 'Chicha' con la venta restringida.
        ((ConsumoResponsable) chicha).restringirVenta();

        // TODO 3: registrarlas todas en el gestor.
        GestorFonda gestor = new GestorFonda();
        gestor.registrar(chicha);
        gestor.registrar(piscoSour);
        gestor.registrar(chichaSinAlcohol);
        gestor.registrar(moteConHuesillo);

        System.out.println("----- INVENTARIO DISPONIBLE -----");
        List<Bebida> todo = gestor.obtenerTodas();
        for (Bebida drink : todo) {
            System.out.println(drink.obtenerDetalle());
        }
        System.out.println();

        System.out.println("----- LISTADO BEBIDAS -----");
        for (Bebida drink : todo) {
            System.out.println(drink.toString());
        }
        System.out.println();

        // TODO 4: solicitar las cuatro ventas indicadas en el enunciado.
        System.out.println("----- VENTA DE BEBIDAS -----");
        gestor.vender("Pisco Sour",2);
        gestor.vender("Pisco Sour",5);
        gestor.vender("Chicha",1);
        gestor.vender("Mote Con Huesillo",6);
        System.out.println();

        // TODO 5: buscar por nombre "Chicha" y listar todas las bebidas.
        System.out.println("----- BÚSQUEDA DE BEBIDA -----");
        List<Bebida> resultados = gestor.buscarPorNombre("Chicha");
        for (Bebida drink : resultados) {
            System.out.println(drink.obtenerDetalle());
        }
        System.out.println();

        System.out.println("----- INVENTARIO DISPONIBLE -----");
        for (Bebida drink : todo) {
            System.out.println(drink.obtenerDetalle());
        }
    }
}
