package Ejercicio11;
public class Main {
    public static void main(String[] args) {

        JefePolicia jefe1 = new JefePolicia("Carlos Pérez", 45, 5000, "Coronel");
        JefePolicia jefe2 = new JefePolicia("María Gómez", 40, 5200, "Coronel");

        jefe1.mostrarTodo();
        jefe2.mostrarTodo();
        // b) Mostrar el nombre del que tiene mayor sueldo
        if (jefe1.getSueldo() > jefe2.getSueldo()) {
            System.out.println("El jefe con mayor sueldo es: " + jefe1.getNombre());
        } else if (jefe2.getSueldo() > jefe1.getSueldo()) {
            System.out.println("El jefe con mayor sueldo es: " + jefe2.getNombre());
        } else {
            System.out.println("Ambos tienen el mismo sueldo.");
        }
        // c) Comparar si ambos tienen el mismo grado
        if (jefe1.getGrado().equalsIgnoreCase(jefe2.getGrado())) {
            System.out.println("Ambos jefes tienen el mismo grado.");
        } else {
            System.out.println("Tienen grados diferentes.");
        }
    }
}

