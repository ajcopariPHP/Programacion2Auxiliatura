package Ejercicio5;
public class Main {
    public static void main(String[] args) {

        Bus bus = new Bus("Carlos Pérez", "ABC-123", 1, 40, "Sindicato Central");
        Auto auto = new Auto("María López", "XYZ-987", 2, 120, true);
        Moto moto = new Moto("Luis Gómez", "MNO-456", 3, 150, true);
        // b) Mostrar la placa y conductor de cada vehículo
        System.out.println("=== Vehículos Registrados ===");
        bus.mostrar();
        auto.mostrar();
        moto.mostrar();

        // c) Cambiar el conductor de un vehículo
        System.out.println("\n--- Cambiando conductor del auto ---");
        auto.cambiarConductor("Ana Torres");
        auto.mostrar();
    }
}