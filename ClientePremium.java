package Ejercicio7_DescuentosClientes;

public class ClientePremium extends Cliente {
    private static final double PORCENTAJE = 0.15;

    public ClientePremium(String nombre, String dni) {
        super(nombre, dni);
    }

    @Override
    public double aplicarDescuento(double subtotal) {
        return subtotal * PORCENTAJE;
    }
}
