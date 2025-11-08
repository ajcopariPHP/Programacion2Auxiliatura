package Ejercicio8;
import java.util.ArrayList;
import java.util.List;

class Persona {
    String nombre;
    int edad;
    String ci;
    Fraternidad fraternidad;
    Facultad facultad;

    public Persona(String nombre, int edad, String ci) {
        this.nombre = nombre;
        this.edad = edad;
        this.ci = ci;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + " | Edad: " + edad + " | CI: " + ci);
        System.out.println("Facultad: " + (facultad != null ? facultad.nombre : "Sin asignar"));
        System.out.println("Fraternidad: " + (fraternidad != null ? fraternidad.nombre : "Sin asignar"));
        System.out.println("----------------------------------------");
    }
}

class Facultad {
    String nombre;
    String sigla;

    public Facultad(String nombre, String sigla) {
        this.nombre = nombre;
        this.sigla = sigla;
    }
}

class Fraternidad {
    String nombre;
    Persona encargado;
    List<Persona> bailarines = new ArrayList<>();

    public Fraternidad(String nombre, Persona encargado) {
        this.nombre = nombre;
        this.encargado = encargado;
    }

    public void agregarBailarin(Persona p) {
        bailarines.add(p);
        p.fraternidad = this;
    }

    public void mostrarIntegrantes() {
        System.out.println("\nFraternidad: " + nombre + "\nEncargado: " + encargado.nombre);
        System.out.println("Bailarines inscritos:");
        for (Persona p : bailarines) {
            System.out.println(" - " + p.nombre + " (" + p.edad + " años)");
        }
    }
}

class SistemaEntrada {
    List<Fraternidad> fraternidades = new ArrayList<>();
    List<Facultad> facultades = new ArrayList<>();
    List<Persona> participantes = new ArrayList<>();

    public void registrarBailarin(Persona p, Facultad f, Fraternidad fr) {
        if (verificarDuplicados(p)) {
            System.out.println("ERROR: " + p.nombre + " ya está en otra fraternidad.");
            return;
        }
        p.facultad = f;
        fr.agregarBailarin(p);

        participantes.add(p);

        System.out.println("Registrado: " + p.nombre + " en " + fr.nombre + " - " + f.nombre);
    }

    public boolean verificarDuplicados(Persona p) {
        return p.fraternidad != null;
    }

    public void mostrarTodo() {
        System.out.println("\n===== LISTADO DE PARTICIPANTES =====");
        for (Persona p : participantes) {
            p.mostrarInfo();
        }

        for (Fraternidad fr : fraternidades) {
            fr.mostrarIntegrantes();
        }
    }
}

public class EntradaUniversitaria {
    public static void main(String[] args) {

        SistemaEntrada sistema = new SistemaEntrada();

        Facultad f1 = new Facultad("Ingeniería", "FNI");
        Facultad f2 = new Facultad("Economía", "FCE");

        sistema.facultades.add(f1);
        sistema.facultades.add(f2);

        Persona encargado1 = new Persona("Carlos Mamani", 32, "789654");
        Persona encargado2 = new Persona("Andrea Quispe", 29, "564987");

        Fraternidad fr1 = new Fraternidad("Tinkus San Andrés", encargado1);
        Fraternidad fr2 = new Fraternidad("Caporales San Simón", encargado2);

        sistema.fraternidades.add(fr1);
        sistema.fraternidades.add(fr2);

        Persona p1 = new Persona("Luis Soto", 21, "123456");
        Persona p2 = new Persona("María Flores", 20, "456789");
        Persona p3 = new Persona("José Pérez", 22, "987456");
        Persona p4 = new Persona("Ana Luna", 19, "963258");
        Persona p5 = new Persona("Pedro Ramos", 23, "852147");

        sistema.registrarBailarin(p1, f1, fr1);
        sistema.registrarBailarin(p2, f1, fr1);
        sistema.registrarBailarin(p3, f2, fr2);
        sistema.registrarBailarin(p4, f2, fr2);

        // intento de duplicado
        sistema.registrarBailarin(p1, f2, fr2);

        sistema.mostrarTodo();
    }
}

