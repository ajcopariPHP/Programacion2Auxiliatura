package Ejercicio4;

class Ropa {
    String tipo;
    String material;

    public Ropa(String tipo, String material) {
        this.tipo = tipo;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Ropa: " + tipo + " | Material: " + material;
    }
}

class Ropero {
    String material;
    Ropa[] prendas = new Ropa[20];
    int nroRopas = 0;

    public Ropero(String material) {
        this.material = material;
    }

    // (b) Agregar N prendas al ropero
    public void agregarPrenda(Ropa ropa) {
        if (nroRopas < 20) {
            prendas[nroRopas] = ropa;
            nroRopas++;
        } else {
            System.out.println("El ropero está lleno, no se puede agregar más ropa.");
        }
    }

    // (c) Eliminar por material
    public void eliminarPorMaterial(String material) {
        for (int i = 0; i < nroRopas; i++) {
            if (prendas[i].material.equalsIgnoreCase(material)) {
                prendas[i] = prendas[nroRopas - 1];
                prendas[nroRopas - 1] = null;
                nroRopas--;
                i--; // re-evaluar índice
            }
        }
    }

    // (c) Eliminar por tipo
    public void eliminarPorTipo(String tipo) {
        for (int i = 0; i < nroRopas; i++) {
            if (prendas[i].tipo.equalsIgnoreCase(tipo)) {
                prendas[i] = prendas[nroRopas - 1];
                prendas[nroRopas - 1] = null;
                nroRopas--;
                i--; // re-evaluar índice
            }
        }
    }

    // (d) Mostrar prendas de material X
    public void mostrarPorMaterial(String material) {
        System.out.println("\nPrendas con material: " + material);
        for (int i = 0; i < nroRopas; i++) {
            if (prendas[i].material.equalsIgnoreCase(material)) {
                System.out.println(prendas[i]);
            }
        }
    }

    // (d) Mostrar prendas de tipo X
    public void mostrarPorTipo(String tipo) {
        System.out.println("\nPrendas de tipo: " + tipo);
        for (int i = 0; i < nroRopas; i++) {
            if (prendas[i].tipo.equalsIgnoreCase(tipo)) {
                System.out.println(prendas[i]);
            }
        }
    }
}

public class TestRopero {
    public static void main(String[] args) {
        Ropero ropero = new Ropero("madera");

        ropero.agregarPrenda(new Ropa("Pantalón", "Jean"));
        ropero.agregarPrenda(new Ropa("Camisa", "Algodón"));
        ropero.agregarPrenda(new Ropa("Chaqueta", "Cuero"));

        ropero.mostrarPorMaterial("Cuero");
        ropero.mostrarPorTipo("Camisa");

        ropero.eliminarPorMaterial("Algodón");
        ropero.eliminarPorTipo("Chaqueta");

        ropero.mostrarPorTipo("Camisa");
        ropero.mostrarPorMaterial("Cuero");
    }
}
