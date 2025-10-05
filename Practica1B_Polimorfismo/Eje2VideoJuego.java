package Ejercicio2;
import java.util.Scanner;
public class VideoJuego {
    private String nombre;
    private String plataforma;
    private int cantidadJugadores;

    public VideoJuego() {
        this.nombre = "Desconocido";
        this.plataforma = "N/A";
        this.cantidadJugadores = 0;
    }
    public VideoJuego(String nombre, String plataforma) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = 0;
    }
    public VideoJuego(String nombre, String plataforma, int cantidadJugadores) {
        this.nombre = nombre;
        this.plataforma = plataforma;
        this.cantidadJugadores = cantidadJugadores;
    }
    public void agregarJugadores() {
        this.cantidadJugadores++;
        System.out.println("Se agregó un jugador. Total: " + cantidadJugadores);
    }
    public void agregarJugadores(int cantidad) {
        this.cantidadJugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores. Total: " + cantidadJugadores);
    }
    public void agregarJugadoresTeclado() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese cantidad de jugadores a agregar: ");
        int cantidad = sc.nextInt();
        this.cantidadJugadores += cantidad;
        System.out.println("Se agregaron " + cantidad + " jugadores. Total: " + cantidadJugadores);
    }
    @Override
    public String toString() {
        return "Videojuego: " + nombre + " | Plataforma: " + plataforma + " | Jugadores: " + cantidadJugadores;
    }
}

