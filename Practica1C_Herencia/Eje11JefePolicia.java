package Ejercicio11;
public class JefePolicia extends Persona implements Empleado, Policia {
    private double sueldo;
    private String grado;

    public JefePolicia(String nombre, int edad, double sueldo, String grado) {
        super(nombre, edad);
        this.sueldo = sueldo;
        this.grado = grado;
    }
    @Override
    public double getSueldo() {
        return sueldo;
    }
    @Override
    public String getGrado() {
        return grado;
    }
    @Override
    public void mostrarEmpleado() {
        System.out.println("Sueldo: " + sueldo);
    }
    @Override
    public void mostrarPolicia() {
        System.out.println("Grado: " + grado);
    }
    public void mostrarTodo() {
        System.out.println("=== JEFE DE POLICÍA ===");
        mostrarPersona();
        mostrarEmpleado();
        mostrarPolicia();
        System.out.println("------------------------");
    }
}
