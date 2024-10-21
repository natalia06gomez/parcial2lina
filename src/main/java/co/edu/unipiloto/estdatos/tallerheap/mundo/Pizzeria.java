package co.edu.unipiloto.estdatos.tallerheap.mundo;
import java.util.ArrayList;

public class Pizzeria {

    public static String DESPACHAR_PEDIDO;
    public static String ATENDER_PEDIDO;
    public static String RECIBIR_PEDIDO;
    
    public void agregarPedido(String nombreAutor, double precio, int cercania) {
        Pedido nuevoPedido = new Pedido(nombreAutor, precio, cercania);
        atenderpedido.add(nuevoPedido);
        despacharpedido.add(nuevoPedido);
    }

    public Pedido atenderPedido() {
        return atenderpedido.poll();
    }

    public Pedido despacharPedido() {
        return despacharpedido.poll();
    }

    public Iterable<Pedido> colaDespachosList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Iterable<Pedido> pedidosRecibidosList() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
