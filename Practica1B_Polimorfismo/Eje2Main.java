package Ejercicio2;
public class Main {
	public static void main(String[] args) {
		
        VideoJuego v1 = new VideoJuego("FIFA 23", "PlayStation", 2);
        VideoJuego v2 = new VideoJuego("Minecraft", "PC");

        System.out.println(v1);
        System.out.println(v2);

        v1.agregarJugadores();          
        v1.agregarJugadores(3);         
        v1.agregarJugadoresTeclado();   

        v2.agregarJugadores(); 
        v2.agregarJugadores(2);

        System.out.println(v1);
        System.out.println(v2);
	}
}
