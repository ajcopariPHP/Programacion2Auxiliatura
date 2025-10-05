package Ejercicio2;
public class Bus {
	 private int capacidad;
	    private int pasajeros;
	    private double costoPasaje;

	    public Bus(int capacidad, double costoPasaje) {
	        this.capacidad = capacidad;
	        this.costoPasaje = costoPasaje;
	        this.pasajeros = 0;
	    }
	    // Método para que suban pasajeros
	    public void subirPasajeros(int cantidad) {
	        if (cantidad <= 0) {
	            System.out.println("La cantidad debe ser mayor a 0.");
	            return;
	        }
	        if (pasajeros + cantidad <= capacidad) {
	            pasajeros += cantidad;
	            System.out.println("Subieron " + cantidad + " pasajeros.");
	        } else {
	            int espacioDisponible = capacidad - pasajeros;
	            pasajeros = capacidad;
	            System.out.println("Solo subieron " + espacioDisponible + 
	                               " pasajeros, el bus ya está lleno.");
	        }
	    }
	    // Método para cobrar pasaje
	    public double cobrarPasaje() {
	        double total = pasajeros * costoPasaje;
	        System.out.println("Se cobraron Bs. " + total + " en pasajes.");
	        return total;
	    }
	    // Método para ver asientos disponibles
	    public int asientosDisponibles() {
	        return capacidad - pasajeros;
	    }
	    public int getPasajeros() {
	        return pasajeros;
	    }

	    public int getCapacidad() {
	        return capacidad;
	    }
}