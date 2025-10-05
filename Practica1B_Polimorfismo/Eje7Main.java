package Ejercicio7;
public class Main {
    public static void main(String[] args) {
        
        Parada p1 = new Parada();

        p1.adicionar("Carlos Pérez");
        p1.adicionar("Lucía Ramos");
     
        p1.adicionar("Toyota Corolla", "Juan López", "ABC-123", "Pedro Núñez");
        p1.adicionar("Suzuki Alto", "María García", "XYZ-456", "Laura Sánchez");

        p1.mostrar();
        // Crear otra parada con el constructor que pide datos
        Parada p2 = new Parada("Ana Torres", "Nissan Versa", "Luis Rojas", "JKL-789", "Ana Torres");
        p2.mostrar();
    }
}

