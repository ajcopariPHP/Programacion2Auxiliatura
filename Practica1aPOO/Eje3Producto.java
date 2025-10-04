package Ejercicio3;
public class Producto {

    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    // Método para vender productos
    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a vender debe ser mayor que 0.");
            return;
        }
        if (cantidad <= stock) {
            stock -= cantidad;
            double total = cantidad * precio;
            System.out.println("Se vendieron " + cantidad + " unidades de " + nombre +
                               ". Total: Bs. " + total);
        } else {
            System.out.println("Stock insuficiente. Solo quedan " + stock + " unidades.");
        }
    }
    // Método para reabastecer productos
    public void reabastecer(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad a reabastecer debe ser mayor que 0.");
            return;
        }
        stock += cantidad;
        System.out.println("Se reabasteció con " + cantidad + " unidades. Stock actual: " + stock);
    }

    public int getStock() {
        return stock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}