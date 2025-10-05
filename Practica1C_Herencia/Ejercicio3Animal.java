package Ejercicio3;
public class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método genérico (será sobrescrito por las subclases)
    public void desplazarse() {
        System.out.println(nombre + " se desplaza de alguna manera.");
    }
}