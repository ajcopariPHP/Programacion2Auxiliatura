package Ejercicio7;
public class Mascota {

    private String nombre;
    private String tipo;   
    private int energia;

    public Mascota(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.energia = 50; // energía inicial por defecto
    }
    // Método para alimentar (+20 de energía, máximo 100)
    public void alimentar() {
        energia += 20;
        if (energia > 100) {
            energia = 100;
        }
        System.out.println(nombre + " (" + tipo + ") fue alimentado. Energía actual: " + energia);
    }
    // Método para jugar (-15 de energía, mínimo 0)
    public void jugar() {
        energia -= 15;
        if (energia < 0) {
            energia = 0;
        }
        System.out.println(nombre + " (" + tipo + ") jugó. Energía actual: " + energia);
    }
    public void mostrarDatos() {
        System.out.println("Mascota: " + nombre + " | Tipo: " + tipo + " | Energía: " + energia);
    }
    public int getEnergia() {
        return energia;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo() {
        return tipo;
    }
}