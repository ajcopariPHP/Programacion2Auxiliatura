package Ejercicio13;
public class Main {
    public static void main(String[] args) {

        Chef chef1 = new Chef("Remy", 3000, 10, "Principal", 50);
        Mesero mesero1 = new Mesero("Linguini", 2000, 5, 30, 100);
        Mesero mesero2 = new Mesero("Colette", 2200, 8, 35, 150);
        Administrativo admin1 = new Administrativo("Skinner", 2500, "Gerente");
        Administrativo admin2 = new Administrativo("Django", 1800, "Contador");

        Empleado[] empleados = {chef1, mesero1, mesero2, admin1, admin2};

        System.out.println("=== LISTA DE EMPLEADOS ===");
        for (Empleado e : empleados) {
            e.mostrarDatos();
        }
        float X = 2000;
        System.out.println("\n=== Empleados con sueldo mensual igual a " + X + " ===");
        for (Empleado e : empleados) {
            if (e.getSueldoMes() == X) {
                e.mostrarDatos();
            }
        }
        System.out.println("\n=== Sueldos Totales ===");
        for (Empleado e : empleados) {
            System.out.println(e.nombre + " -> Sueldo Total: " + e.sueldoTotal());
        }
    }
}