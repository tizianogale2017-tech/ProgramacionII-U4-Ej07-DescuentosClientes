package Ejercicio7_DescuentosClientes;

public class ClienteRegular extends Cliente {
    private static final double PORCENTAJE = 0.05;

    public ClienteRegular(String nombre, String dni) {
        super(nombre, dni);
    }

    @Override
    public double aplicarDescuento(double subtotal) {
        return subtotal * PORCENTAJE;
    }
}
