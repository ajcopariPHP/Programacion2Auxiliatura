package Ejercicio10;
import java.util.*;

class Persona {
    String nombre;
    String apellido;
    int edad;
    int ci;

    public Persona(String nombre, String apellido, int edad, int ci) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.ci = ci;
    }
}

class Participante extends Persona {
    int nroTicket;

    public Participante(String nombre, String apellido, int edad, int ci, int nroTicket) {
        super(nombre, apellido, edad, ci);
        this.nroTicket = nroTicket;
    }
}

class Speaker extends Persona {
    String especialidad;

    public Speaker(String nombre, String apellido, int edad, int ci, String especialidad) {
        super(nombre, apellido, edad, ci);
        this.especialidad = especialidad;
    }
}

class Charla {
    String lugar;
    String nombreCharla;
    Speaker S;
    ArrayList<Participante> participantes = new ArrayList<>();

    public Charla(String nombreCharla, String lugar, Speaker s) {
        this.nombreCharla = nombreCharla;
        this.lugar = lugar;
        this.S = s;
    }

    public void agregarParticipante(Participante p) {
        participantes.add(p);
    }
}

class Evento {
    String nombre;
    ArrayList<Charla> charlas = new ArrayList<>();

    public Evento(String nombre) {
        this.nombre = nombre;
    }

    public void agregarCharla(Charla c) {
        charlas.add(c);
    }

    // (a) edad promedio de participantes de TODO el evento
    public double edadPromedioParticipantes() {
        int suma = 0, contador = 0;

        for (Charla c : charlas) {
            for (Participante p : c.participantes) {
                suma += p.edad;
                contador++;
            }
        }
        return contador > 0 ? (double) suma / contador : 0;
    }

    // (b) verificar si persona X Y está como participante o speaker
    public boolean buscarPersona(String nombre, String apellido) {
        for (Charla c : charlas) {
            if (c.S.nombre.equals(nombre) && c.S.apellido.equals(apellido))
                return true;

            for (Participante p : c.participantes)
                if (p.nombre.equals(nombre) && p.apellido.equals(apellido))
                    return true;
        }
        return false;
    }

    // (c) eliminar charlas donde el speaker tiene ese CI
    public void eliminarCharlasSpeaker(int ci) {
        charlas.removeIf(c -> c.S.ci == ci);
    }

    // (d) ordenar charlas por cantidad de participantes
    public void ordenarCharlasPorParticipantes() {
        charlas.sort(Comparator.comparingInt(c -> c.participantes.size()));
    }
}

public class Main {
    public static void main(String[] args) {
        Evento evento = new Evento("TechDay");

        Speaker sp1 = new Speaker("Carlos", "Perez", 35, 123, "IA");
        Speaker sp2 = new Speaker("Ana", "Lopez", 29, 777, "Ciberseguridad");

        Charla c1 = new Charla("Machine Learning", "Auditorio A", sp1);
        Charla c2 = new Charla("Seguridad Digital", "Sala 2", sp2);

        Participante p1 = new Participante("Luis", "Mamani", 22, 901, 1);
        Participante p2 = new Participante("Maria", "Soto", 19, 120, 2);
        Participante p3 = new Participante("Pablo", "Quispe", 30, 555, 3);

        c1.agregarParticipante(p1);
        c1.agregarParticipante(p2);
        c2.agregarParticipante(p3);

        evento.agregarCharla(c1);
        evento.agregarCharla(c2);

        // (a)
        System.out.println("Edad promedio de participantes: " + evento.edadPromedioParticipantes());

        // (b)
        System.out.println("¿Se encuentra Luis Mamani?: " +
                           evento.buscarPersona("Luis", "Mamani"));

        // (c)
        evento.eliminarCharlasSpeaker(123);  // elimina charlas del speaker con CI = 123

        // (d)
        evento.ordenarCharlasPorParticipantes();
    }
}

