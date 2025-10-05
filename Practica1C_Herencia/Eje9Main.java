package Ejercicio9;
public class Main {
    public static void main(String[] args) {
    	
        Presidente p1 = new Presidente("Carlos", "López", "Abogado", 15, "Partido Nacional", "Líder");
        
        Politico poli = new Politico("Economista", 12);
        Partido par = new Partido("Partido del Pueblo", "Fundador");
        Presidente p2 = new Presidente("María", "Gonzales", poli, par);

        Presidente[] presidentes = new Presidente[3];
        presidentes[0] = p1;
        presidentes[1] = p2;
        presidentes[2] = new Presidente("Luis", "Pérez", "Ingeniero", 10, "Partido Unido", "Miembro");

        for (Presidente p : presidentes) {
            p.mostrar();
        }
        // Buscar presidente por nombre
        String nombreBuscado = "María";
        boolean encontrado = false;

        for (Presidente p : presidentes) {
            if (p.getNombre().equalsIgnoreCase(nombreBuscado)) {
                System.out.println("\nPresidente encontrado: " + nombreBuscado);
                System.out.println("Partido: " + p.getPartidoNombre());
                System.out.println("Profesión: " + p.getProfesion());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("\nNo se encontró un presidente con el nombre: " + nombreBuscado);
        }
    }
}
