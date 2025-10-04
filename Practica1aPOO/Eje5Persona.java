package Ejercicio5;
public class Persona {

    private String nombre;
    private String paterno;
    private String materno;
    private int edad;
    private String ci;

    public Persona(String nombre, String paterno, String materno, int edad, String ci) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.edad = edad;
        this.ci = ci;
    }
    // Método para mostrar datos
    public void mostrarDatos() {
        System.out.println("Nombre completo: " + nombre + " " + paterno + " " + materno);
        System.out.println("Edad: " + edad);
        System.out.println("CI: " + ci);
        System.out.println("-------------------------");
    }
    // Método para verificar si es mayor de edad
    public boolean mayorDeEdad() {
        return edad >= 18;
    }
    // Método para modificar edad
    public void modificarEdad(int nuevaEdad) {
        if (nuevaEdad > 0) {
            this.edad = nuevaEdad;
            System.out.println("La edad de " + nombre + " fue modificada a " + edad + " años.");
        } else {
            System.out.println("Edad inválida.");
        }
    }
    // Getter para apellido paterno
    public String getPaterno() {
        return paterno;
    }
}