package Ejercicio7_DescuentosClientes;

public class Factura {
    private final Cliente cliente;
    private final double subtotal;

    public Factura(Cliente cliente, double subtotal) {
        if (cliente == null || subtotal < 0) {
            throw new IllegalArgumentException("Factura inválida");
        }
        this.cliente = cliente;
        this.subtotal = subtotal;
    }

    public double calcularTotal() {
        return subtotal - cliente.aplicarDescuento(subtotal);
    }

    public void imprimirDesglose() {
        System.out.printf("%-18s %-18s Subtotal: %,10.2f | Descuento: %,9.2f | TOTAL: %,10.2f%n",
                cliente.getClass().getSimpleName(), cliente.getNombre(), subtotal,
                cliente.aplicarDescuento(subtotal), calcularTotal());
    }
}
