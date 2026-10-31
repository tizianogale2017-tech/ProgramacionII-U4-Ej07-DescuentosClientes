package Ejercicio7_DescuentosClientes;

public abstract class Cliente {
    private final String nombre;
    private final String dni;

    protected Cliente(String nombre, String dni) {
        if (nombre == null || nombre.isBlank() || dni == null || dni.isBlank()) {
            throw new IllegalArgumentException("Nombre y DNI son obligatorios");
        }
        this.nombre = nombre;
        this.dni = dni;
    }

    /** Devuelve el monto a descontar del subtotal (no el precio final). */
    public abstract double aplicarDescuento(double subtotal);

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
}
