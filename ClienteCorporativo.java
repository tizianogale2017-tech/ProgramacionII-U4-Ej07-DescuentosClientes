package Ejercicio7_DescuentosClientes;

public class ClienteCorporativo extends Cliente {
    private static final double PORCENTAJE = 0.25;
    private static final double MONTO_MINIMO = 100000;

    public ClienteCorporativo(String nombre, String dni) {
        super(nombre, dni);
    }

    @Override
    public double aplicarDescuento(double subtotal) {
        // Solo hay rebaja corporativa en compras grandes.
        return subtotal >= MONTO_MINIMO ? subtotal * PORCENTAJE : 0;
    }
}
