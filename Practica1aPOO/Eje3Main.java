package Ejercicio3;
public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Laptop", 3500.0, 5);
        // Vender productos
        producto1.vender(2);   
        producto1.vender(10);  

        // Reabastecer stock
        producto1.reabastecer(7);
        // Vender nuevamente
        producto1.vender(3);
        // Mostrar stock final
        System.out.println("Stock final de " + producto1.getNombre() + ": " + producto1.getStock());
    }
}