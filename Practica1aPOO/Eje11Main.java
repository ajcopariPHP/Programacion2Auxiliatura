package Ejercicio11;
public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("Café Latte", 15.0);
        Pedido pedido1 = new Pedido(101, "Registrado");

        System.out.println(p1.toString());
        System.out.println(pedido1.toString());
    }
}