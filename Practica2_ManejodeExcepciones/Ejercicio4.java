package Ejercicio4;
import java.util.ArrayList;

//Clase Producto
class Producto {
 private String codigo;
 private String nombre;
 private double precio;
 private int stock;

 public Producto(String codigo, String nombre, double precio, int stock) {
     if (precio < 0 || stock < 0) {
         throw new IllegalArgumentException("El precio y el stock no pueden ser negativos.");
     }
     this.codigo = codigo;
     this.nombre = nombre;
     this.precio = precio;
     this.stock = stock;
 }

 // Getters y setters
 public String getCodigo() { return codigo; }
 public String getNombre() { return nombre; }
 public double getPrecio() { return precio; }
 public int getStock() { return stock; }
 public void setStock(int stock) { this.stock = stock; }

 @Override
 public String toString() {
     return "Producto[codigo=" + codigo + ", nombre=" + nombre +
             ", precio=" + precio + ", stock=" + stock + "]";
 }
}

//Excepción personalizada para producto no encontrado
class ProductoNoEncontradoException extends Exception {
 public ProductoNoEncontradoException(String mensaje) {
     super(mensaje);
 }
}

//Excepción personalizada para stock insuficiente
class StockInsuficienteException extends Exception {
 public StockInsuficienteException(String mensaje) {
     super(mensaje);
 }
}

//Clase Inventario
class Inventario {
 private ArrayList<Producto> productos;

 public Inventario() {
     productos = new ArrayList<>();
 }

 public void agregarProducto(Producto p) throws IllegalArgumentException {
     for (Producto prod : productos) {
         if (prod.getCodigo().equals(p.getCodigo())) {
             throw new IllegalArgumentException("El producto con este código ya existe.");
         }
     }
     if (p.getPrecio() < 0 || p.getStock() < 0) {
         throw new IllegalArgumentException("El precio y el stock no pueden ser negativos.");
     }
     productos.add(p);
     System.out.println("Producto agregado: " + p);
 }

 public Producto buscarProducto(String codigo) throws ProductoNoEncontradoException {
     for (Producto p : productos) {
         if (p.getCodigo().equals(codigo)) {
             return p;
         }
     }
     throw new ProductoNoEncontradoException("Producto con código " + codigo + " no encontrado.");
 }

 public void venderProducto(String codigo, int cantidad) 
         throws ProductoNoEncontradoException, StockInsuficienteException {
     Producto p = buscarProducto(codigo);
     if (p.getStock() < cantidad) {
         throw new StockInsuficienteException("Stock insuficiente para vender " + cantidad + " unidades.");
     }
     p.setStock(p.getStock() - cantidad);
     System.out.println("Venta realizada: " + cantidad + " unidades de " + p.getNombre());
 }

 public void mostrarInventario() {
     System.out.println("\nInventario actual:");
     for (Producto p : productos) {
         System.out.println(p);
     }
 }
}

//Clase principal con main
public class Main {
 public static void main(String[] args) {
     Inventario inventario = new Inventario();

     try {
         Producto p1 = new Producto("P001", "Laptop", 1500.0, 10);
         Producto p2 = new Producto("P002", "Mouse", 25.0, 50);
         Producto p3 = new Producto("P003", "Teclado", 45.0, 30);

         inventario.agregarProducto(p1);
         inventario.agregarProducto(p2);
         inventario.agregarProducto(p3);

         // Intento de agregar un producto con código duplicado
         Producto pDuplicado = new Producto("P001", "Monitor", 300.0, 15);
         inventario.agregarProducto(pDuplicado);

     } catch (IllegalArgumentException e) {
         System.out.println("Error al agregar producto: " + e.getMessage());
     }

     // Mostrar inventario
     inventario.mostrarInventario();

     // Intento de buscar un producto
     try {
         Producto encontrado = inventario.buscarProducto("P002");
         System.out.println("\nProducto encontrado: " + encontrado);
     } catch (ProductoNoEncontradoException e) {
         System.out.println(e.getMessage());
     }

     // Intento de buscar un producto que no existe
     try {
         Producto noExiste = inventario.buscarProducto("P999");
     } catch (ProductoNoEncontradoException e) {
         System.out.println(e.getMessage());
     }

     // Venta de productos
     try {
         inventario.venderProducto("P003", 5);  // Venta exitosa
         inventario.venderProducto("P003", 50); // Stock insuficiente
     } catch (ProductoNoEncontradoException | StockInsuficienteException e) {
         System.out.println("Error en la venta: " + e.getMessage());
     }

     // Mostrar inventario final
     inventario.mostrarInventario();
 }
}

