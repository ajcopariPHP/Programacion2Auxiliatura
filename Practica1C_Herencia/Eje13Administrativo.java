package Ejercicio13;
public class Administrativo extends Empleado {
    private String cargo;

    public Administrativo(String nombre, float sueldoMes, String cargo) {
        super(nombre, sueldoMes);
        this.cargo = cargo;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Administrativo - Nombre: " + nombre + 
                           ", Cargo: " + cargo + 
                           ", Sueldo mensual: " + sueldoMes);
    }
}