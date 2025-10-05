package Ejercicio13;
public class Mesero extends Empleado {
    private double propina;
    private int horaExtra;
    private float sueldoHora;

    public Mesero(String nombre, float sueldoMes, int horaExtra, float sueldoHora, double propina) {
        super(nombre, sueldoMes);
        this.horaExtra = horaExtra;
        this.sueldoHora = sueldoHora;
        this.propina = propina;
    }

    // Sobrecarga del método sueldoTotal()
    @Override
    public float sueldoTotal() {
        return (float) (sueldoMes + (horaExtra * sueldoHora) + propina);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Mesero - Nombre: " + nombre + 
                           ", Sueldo mensual: " + sueldoMes + 
                           ", Horas extra: " + horaExtra + 
                           ", Propina: " + propina + 
                           ", Total: " + sueldoTotal());
    }
}