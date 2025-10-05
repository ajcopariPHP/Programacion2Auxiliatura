package Ejercicio13;
public class Chef extends Empleado {
    private int horaExtra;
    private String tipo;
    private float sueldoHora;

    public Chef(String nombre, float sueldoMes, int horaExtra, String tipo, float sueldoHora) {
        super(nombre, sueldoMes);
        this.horaExtra = horaExtra;
        this.tipo = tipo;
        this.sueldoHora = sueldoHora;
    }
    // Sobrecarga del método sueldoTotal()
    @Override
    public float sueldoTotal() {
        return sueldoMes + (horaExtra * sueldoHora);
    }
    @Override
    public void mostrarDatos() {
        System.out.println("Chef - Nombre: " + nombre + 
                           ", Tipo: " + tipo + 
                           ", Sueldo mensual: " + sueldoMes + 
                           ", Horas extra: " + horaExtra + 
                           ", Total: " + sueldoTotal());
    }
}
