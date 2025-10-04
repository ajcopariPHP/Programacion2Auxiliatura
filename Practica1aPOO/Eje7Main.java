package Ejercicio7;
public class Main {
    public static void main(String[] args) {
        
        Mascota m1 = new Mascota("Toby", "Perro");
        Mascota m2 = new Mascota("Lia", "Gato");

        m1.mostrarDatos();
        m2.mostrarDatos();
        // Alimentar ambas y mostrar energía después de cada acción
        m1.alimentar();
        System.out.println("Energía de " + m1.getNombre() + ": " + m1.getEnergia());
        m2.alimentar();
        System.out.println("Energía de " + m2.getNombre() + ": " + m2.getEnergia());
        // Jugar con ambas y mostrar energía
        m1.jugar();
        System.out.println("Energía de " + m1.getNombre() + ": " + m1.getEnergia());
        m2.jugar();
        System.out.println("Energía de " + m2.getNombre() + ": " + m2.getEnergia());
        // Otra ronda de acciones
        m1.alimentar();
        System.out.println("Energía de " + m1.getNombre() + ": " + m1.getEnergia());
        m2.jugar();
        System.out.println("Energía de " + m2.getNombre() + ": " + m2.getEnergia());

        // Energía final
        System.out.println("Energía final de " + m1.getNombre() + " (" + m1.getTipo() + "): " + m1.getEnergia());
        System.out.println("Energía final de " + m2.getNombre() + " (" + m2.getTipo() + "): " + m2.getEnergia());
    }
}