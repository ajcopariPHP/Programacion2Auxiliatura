package Ejercicio3;
public class Main {
    public static void main(String[] args) {
        // Crear arreglo (array) de animales
        Animal[] animales = {
            new Leon("Simba", 5),
            new Pinguino("Pingu", 3),
            new Canguro("Jack", 4)
        };
        System.out.println("=== Desplazamiento de animales ===\n");
        for (Animal a : animales) {
            a.desplazarse();
        }
    }
}