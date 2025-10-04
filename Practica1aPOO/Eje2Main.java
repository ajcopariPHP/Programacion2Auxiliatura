package Ejercicio2;
public class Main {
	public static void main(String[] args) {
		
		Bus miBus = new Bus(30, 1.50);
        // Suben pasajeros
        miBus.subirPasajeros(10);
        miBus.subirPasajeros(25); 
        // Cobrar pasaje
        miBus.cobrarPasaje();
        // Ver asientos disponibles
        System.out.println("Asientos disponibles: " + miBus.asientosDisponibles());

	}
}