package Ejercicio2;
import java.util.ArrayList;

class Empleado {
    private String nombre;
    private String cargo;
    private double sueldo;

    public Empleado(String nombre, String cargo, double sueldo) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public void cambiarSalario(double nuevoSalario) {
        this.sueldo = nuevoSalario;
    }

    @Override
    public String toString() {
        return nombre + " | " + cargo + " | $" + sueldo;
    }
}

// AGREGACIÓN: un Departamento "tiene" empleados, pero estos pueden existir fuera.
class Departamento {
    private String nombre;
    private String area;
    private ArrayList<Empleado> empleados;

    public Departamento(String nombre, String area) {
        this.nombre = nombre;
        this.area = area;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    public void mostrarEmpleados() {
        System.out.println("\nDepartamento: " + nombre + " (" + area + ")");
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados en este departamento.");
        } else {
            empleados.forEach(e -> System.out.println(" - " + e));
        }
    }

    public void cambioSalario(double nuevo) {
        empleados.forEach(e -> e.cambiarSalario(nuevo));
    }

    public boolean contieneEmpleado(Empleado emp) {
        return empleados.contains(emp);
    }

    public void moverEmpleadosA(Departamento destino) {
        destino.empleados.addAll(this.empleados);
        this.empleados.clear();
    }
}

public class Eje2 {
    public static void main(String[] args) {

        // a) Instancia de dos departamentos
        Departamento dep1 = new Departamento("Recursos Humanos", "Administración");
        Departamento dep2 = new Departamento("TI", "Tecnología");

        // Crear empleados
        Empleado e1 = new Empleado("Ana", "Analista", 4000);
        Empleado e2 = new Empleado("Luis", "Jefe", 6000);
        Empleado e3 = new Empleado("Maria", "Asistente", 3500);
        Empleado e4 = new Empleado("Carlos", "Practicante", 2000);
        Empleado e5 = new Empleado("Sofia", "Analista", 4200);

        // Agregar empleados al departamento 1
        dep1.agregarEmpleado(e1);
        dep1.agregarEmpleado(e2);
        dep1.agregarEmpleado(e3);
        dep1.agregarEmpleado(e4);
        dep1.agregarEmpleado(e5);

        // b) Mostrar empleados de ambos departamentos
        dep1.mostrarEmpleados();
        dep2.mostrarEmpleados();

        // c) Cambiar sueldo de los empleados del departamento 1
        dep1.cambioSalario(5000);

        System.out.println("\n--- Después del cambio de salario ---");
        dep1.mostrarEmpleados();

        // d) Verificar si un empleado de dep1 pertenece a dep2
        System.out.println("\n¿Luis pertenece al departamento 2? -> " + dep2.contieneEmpleado(e2));

        // e) Mover empleados del dpto1 al dpto2
        dep1.moverEmpleadosA(dep2);

        System.out.println("\n--- Después de mover empleados ---");
        dep1.mostrarEmpleados();
        dep2.mostrarEmpleados();
    }
}
