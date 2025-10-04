package Ejercicio5;
public class Main {
    public static void main(String[] args) {
        // Instanciar personas
        Persona p1 = new Persona("Carlos", "Gonzales", "Perez", 20, "123456");
        Persona p2 = new Persona("Maria", "Gonzales", "Lopez", 16, "654321");

        p1.mostrarDatos();
        p2.mostrarDatos();

        // Verificar si son mayores de edad
        System.out.println(p1.mayorDeEdad() ? p1.getPaterno() + " es mayor de edad." : "Es menor de edad.");
        System.out.println(p2.mayorDeEdad() ? p2.getPaterno() + " es mayor de edad." : "Es menor de edad.");
        // Modificar edad
        p2.modificarEdad(18);
        // Verificar si tienen el mismo apellido paterno
        if (p1.getPaterno().equalsIgnoreCase(p2.getPaterno())) {
            System.out.println("Ambas personas tienen el mismo apellido paterno: " + p1.getPaterno());
        } else {
            System.out.println("Las personas no comparten apellido paterno.");
        }
    }
}