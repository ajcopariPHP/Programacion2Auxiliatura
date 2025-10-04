package Ejercicio13;
import java.util.Arrays;
public class Fruta {

    private String nombre;
    private String tipo;
    private int nroVitaminas;
    private String[] vitaminas;

    public Fruta(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vitaminas = new String[30];
        this.nroVitaminas = 0;
    }
    // Constructor 2: con nombre, tipo y vitaminas
    public Fruta(String nombre, String tipo, String[] vitaminas) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vitaminas = vitaminas;
        this.nroVitaminas = vitaminas.length;
    }
    public Fruta() {
        this.vitaminas = new String[30];
        this.nroVitaminas = 0;
    }
    public void agregarVitamina(String v) {
        if (nroVitaminas < vitaminas.length) {
            vitaminas[nroVitaminas] = v;
            nroVitaminas++;
        }
    }
    public void mostrarVitaminas() {
        System.out.println("Vitaminas de " + nombre + ": " + Arrays.toString(Arrays.copyOf(vitaminas, nroVitaminas)));
    }
    public int getNroVitaminas() {
        return nroVitaminas;
    }
    public String getNombre() {
        return nombre;
    }
    public String[] getVitaminas() {
        return Arrays.copyOf(vitaminas, nroVitaminas);
    }
    public String getTipo() {
        return tipo;
    }
    @Override
    public String toString() {
        return "Fruta: " + nombre + " | Tipo: " + tipo + " | Vitaminas: " + Arrays.toString(getVitaminas());
    }
}