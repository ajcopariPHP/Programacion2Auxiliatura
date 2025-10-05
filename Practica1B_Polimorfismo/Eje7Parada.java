package Ejercicio7;
public class Parada {

    private String[] admins;      
    private String[][] autos;      
    private int nroAdmins;          
    private int nroAutos;           

    public Parada() {
        admins = new String[10];
        autos = new String[10][4]; // 4 datos por auto
        nroAdmins = 0;
        nroAutos = 0;
    }

    public Parada(String adminInicial, String modelo, String conductor, String placa, String propietario) {
        admins = new String[10];
        autos = new String[10][4];
        nroAdmins = 0;
        nroAutos = 0;

        adicionar(adminInicial);
        adicionar(modelo, conductor, placa, propietario);
    }
    public void mostrar() {
        System.out.println("====== INFORMACIÓN DE LA PARADA ======");
        System.out.println("Administradores (" + nroAdmins + "): ");
        for (int i = 0; i < nroAdmins; i++) {
            System.out.println(" - " + admins[i]);
        }

        System.out.println("\nAutos (" + nroAutos + "): ");
        for (int i = 0; i < nroAutos; i++) {
            System.out.println("Auto #" + (i + 1) + ":");
            System.out.println("   Modelo: " + autos[i][0]);
            System.out.println("   Conductor: " + autos[i][1]);
            System.out.println("   Placa: " + autos[i][2]);
            System.out.println("   Propietario: " + autos[i][3]);
        }
        System.out.println("=====================================\n");
    }
    // c) Método adicionar admin
    public void adicionar(String admin) {
        if (nroAdmins < admins.length) {
            admins[nroAdmins] = admin;
            nroAdmins++;
        } else {
            System.out.println("No se pueden agregar más administradores.");
        }
    }
    // d) Método adicionar auto
    public void adicionar(String modelo, String conductor, String placa, String propietario) {
        if (nroAutos < autos.length) {
            autos[nroAutos][0] = modelo;
            autos[nroAutos][1] = conductor;
            autos[nroAutos][2] = placa;
            autos[nroAutos][3] = propietario;
            nroAutos++;
        } else {
            System.out.println("No se pueden agregar más autos.");
        }
    }
}
