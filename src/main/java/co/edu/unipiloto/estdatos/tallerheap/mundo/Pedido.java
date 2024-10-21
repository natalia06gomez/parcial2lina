package co.edu.unipiloto.estdatos.tallerheap.mundo;

public class Pedido implements Comparable<Pedido> {
    private double precio;
    private String autorPedido;
    private int cercania;

    // Constructor
    public Pedido(String autorPedido, double precio, int cercania) {
        this.autorPedido = autorPedido;
        this.precio = precio;
        this.cercania = cercania;
    }

    // Getters
    public double getPrecio() {
        return precio;
    }

    public String getAutorPedido() {
        return autorPedido;
    }

    public int getCercania() {
        return cercania;
    }

    // Implementación de compareTo para comparar por precio o cercanía
    @Override
    public int compareTo(Pedido otro) {
        
        //aca podemos compararlos por precio
        return Double.compare(this.precio, otro.precio);
    }
}
