package Ejercicio12;
import java.util.ArrayList;

class Doctor {
    String nombre;
    String especialidad;

    public Doctor(String nombre, String especialidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public void mostrarInfo() {
        System.out.println("Doctor: " + nombre + " | Especialidad: " + especialidad);
    }

    @Override
    public String toString() {
        return nombre + " (" + especialidad + ")";
    }
}

class Hospital {
    String nombre;
    ArrayList<Doctor> doctores;   // AGREGACIÓN (el hospital contiene doctores)

    public Hospital(String nombre) {
        this.nombre = nombre;
        this.doctores = new ArrayList<>();
    }

    // asignar doctor al hospital
    public void agregarDoctor(Doctor d) {
        doctores.add(d);
        System.out.println("Doctor agregado a " + nombre + ": " + d);
    }

    // mostrar doctores del hospital
    public void mostrarDoctores() {
        System.out.println("\nHospital: " + nombre);
        if (doctores.isEmpty()) {
            System.out.println("No hay doctores asignados.");
        } else {
            for (Doctor d : doctores) {
                d.mostrarInfo();
            }
        }
    }
}


// Clase principal
public class Main {
    public static void main(String[] args) {

        // Doctores (existen independientemente)
        Doctor d1 = new Doctor("Ana Perez", "Cardiología");
        Doctor d2 = new Doctor("Luis Montaño", "Neurología");
        Doctor d3 = new Doctor("Sofia López", "Pediatría");

        // Hospitales
        Hospital h1 = new Hospital("Hospital del Norte");
        Hospital h2 = new Hospital("Hospital Metropolitano");

        // Asignación (agregación)
        h1.agregarDoctor(d1);
        h1.agregarDoctor(d3);
        h2.agregarDoctor(d2);
        h2.agregarDoctor(d3);  // mismo doctor trabaja en ambos hospitales

        // Mostrar estado
        h1.mostrarDoctores();
        h2.mostrarDoctores();
    }
}

