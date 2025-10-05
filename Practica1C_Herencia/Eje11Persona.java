package Ejercicio11;
public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarPersona() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
    public String getNombre() {
        return nombre;
    }
}
