package Ejercicio13;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // a) Instanciar de 3 maneras diferentes
        Fruta f1 = new Fruta("Kiwi", "Subtropical", new String[]{"K", "C", "E"}); // constructor con vitaminas
        Fruta f2 = new Fruta("Naranja", "Cítrica"); // constructor simple
        f2.agregarVitamina("C");
        f2.agregarVitamina("A");

        Fruta f3 = new Fruta(); // constructor vacío
        f3 = new Fruta("Manzana", "Templada", new String[]{"B1", "C"});

        Fruta[] frutas = {f1, f2, f3};

        // b) Verificar cuál es la fruta con más vitaminas
        Fruta masVitaminas = frutas[0];
        for (Fruta f : frutas) {
            if (f.getNroVitaminas() > masVitaminas.getNroVitaminas()) {
                masVitaminas = f;
            }
        }
        System.out.println("Fruta con más vitaminas: " + masVitaminas.getNombre());

        // c) Mostrar las vitaminas que tiene la fruta x (ejemplo: Kiwi)
        System.out.println("\nMostrando vitaminas de Kiwi:");
        f1.mostrarVitaminas();

        // d) Cuántas vitaminas son cítricas (frutas tipo "Cítrica")
        int totalVitaminasCitricas = 0;
        for (Fruta f : frutas) {
            if (f.getTipo().equalsIgnoreCase("Cítrica")) {
                totalVitaminasCitricas += f.getNroVitaminas();
            }
        }
        System.out.println("\nCantidad de vitaminas en frutas cítricas: " + totalVitaminasCitricas);
        // e) Ordenar las frutas alfabéticamente según el nombre de sus vitaminas
        System.out.println("\nOrdenando vitaminas de cada fruta alfabéticamente:");
        for (Fruta f : frutas) {
            String[] vits = f.getVitaminas();
            Arrays.sort(vits);
            System.out.println("Fruta: " + f.getNombre() + " | Vitaminas ordenadas: " + Arrays.toString(vits));
        }
    }
}

