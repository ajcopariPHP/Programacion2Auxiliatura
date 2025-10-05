package Ejercicio7;
public class Main {
    public static void main(String[] args) {

        Estudiante est1 = new Estudiante("Carlos", "Pérez", "López", 20, "RU001", "MAT2025");
        Estudiante est2 = new Estudiante("María", "Torres", "García", 22, "RU002", "MAT2026");
        Docente docente = new Docente("Luis", "Gómez", "Rojas", 22, 5000, "REG-789");

        est1.mostrar();
        est2.mostrar();
        docente.mostrar();

        double promedio = Estudiante.promedioEdad(est1, est2);
        System.out.println("\nPromedio de edad de estudiantes: " + promedio);

        System.out.println("\n--- Modificando edad de " + est1.nombre + " ---");
        est1.modificarEdad(23);
        est1.mostrar();

        if (est2.edad == docente.edad) {
            System.out.println("\n" + est2.nombre + " tiene la misma edad que el docente.");
        } else {
            System.out.println("\n" + est2.nombre + " no tiene la misma edad que el docente.");
        }
    }
}
