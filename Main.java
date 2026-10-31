package Ejercicio7_DescuentosClientes;

public class Main {
    public static void main(String[] args) {
        Cliente[] clientes = {
            new ClienteRegular("Juan Torres", "30111222"),
            new ClientePremium("Lucía Fernández", "28999111"),
            new ClienteCorporativo("Ferretería Sur SA", "30-7000-1"),
            new ClienteCorporativo("Kiosco Don Pepe", "30-7000-2")
        };
        double[] subtotales = {80000, 80000, 250000, 40000};

        for (int i = 0; i < clientes.length; i++) {
            new Factura(clientes[i], subtotales[i]).imprimirDesglose();
        }
    }
}
