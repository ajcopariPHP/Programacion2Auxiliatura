package Ejercicio14;
import java.util.ArrayList;

class Empleado {
    String nombre;
    String puesto;
    double salario;

    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | Puesto: " + puesto + " | Salario: " + salario);
    }

    @Override
    public String toString() {
        return nombre + " - " + puesto + " - " + salario;
    }
}

class Empresa {
    String nombre;
    ArrayList<Empleado> empleados;   // Agregación (empresa tiene empleados)

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    // (a) Agregar empleados
    public void agregarEmpleado(Empleado emp) {
        empleados.add(emp);
        System.out.println("Empleado agregado: " + emp);
    }

    // (b) Mostrar información de la empresa y empleados
    public void mostrarEmpresa() {
        System.out.println("\n Empresa: " + nombre);
        System.out.println("Total de empleados: " + empleados.size());

        for (Empleado emp : empleados) {
            emp.mostrarInfo();
        }
    }

    // (c) Buscar empleado por nombre
    public Empleado buscarEmpleado(String nombre) {
        for (Empleado e : empleados) {
            if (e.nombre.equalsIgnoreCase(nombre)) {
                return e;
            }
        }
        return null;
    }

    // (d) Eliminar empleado por nombre
    public void eliminarEmpleado(String nombre) {
        Empleado encontrado = buscarEmpleado(nombre);
        if (encontrado != null) {
            empleados.remove(encontrado);
            System.out.println("Empleado eliminado: " + nombre);
        } else {
            System.out.println("No existe empleado con ese nombre.");
        }
    }

    // (e) Calcular y mostrar promedio salarial
    public void promedioSalarial() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
            return;
        }

        double total = 0;
        for (Empleado e : empleados) {
            total += e.salario;
        }

        System.out.println("Promedio salarial: " + (total / empleados.size()));
    }

    // (e extra) Listar empleados con salario mayor a un valor dado
    public void empleadosConSalarioMayorA(double valor) {
        System.out.println("\nEmpleados con salario mayor a " + valor + ":");
        for (Empleado e : empleados) {
            if (e.salario > valor) {
                e.mostrarInfo();
            }
        }
    }
}


// Clase principal
public class Main {
    public static void main(String[] args) {

        Empresa empresa = new Empresa("Tech Solutions");

        empresa.agregarEmpleado(new Empleado("Carlos", "Gerente", 5000));
        empresa.agregarEmpleado(new Empleado("Ana", "Programadora", 3500));
        empresa.agregarEmpleado(new Empleado("Luis", "Diseñador", 3000));

        empresa.mostrarEmpresa();

        // Buscar empleado
        System.out.println("\nBuscando a Ana:");
        Empleado encontrado = empresa.buscarEmpleado("Ana");
        if (encontrado != null)
            encontrado.mostrarInfo();

        // Eliminar empleado
        empresa.eliminarEmpleado("Luis");
        empresa.mostrarEmpresa();

        // Promedio salarial
        empresa.promedioSalarial();

        // Empleados con salario mayor a X
        empresa.empleadosConSalarioMayorA(3200);
    }
}

