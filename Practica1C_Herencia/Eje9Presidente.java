package Ejercicio9;
class Presidente extends Politico {
    private String nombre;
    private String apellido;
    private Partido partido;

    public Presidente(String nombre, String apellido, String profesion, int aniosExp, String nombreP, String rol) {
        super(profesion, aniosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = new Partido(nombreP, rol);
    }
    public Presidente(String nombre, String apellido, Politico poli, Partido par) {
        super(poli.profesion, poli.aniosExp);
        this.nombre = nombre;
        this.apellido = apellido;
        this.partido = par;
    }
    public String getNombre() {
        return nombre;
    }
    public void mostrar() {
        System.out.println("=== PRESIDENTE ===");
        System.out.println("Nombre: " + nombre + " " + apellido);
        mostrarPolitico();
        mostrarPartido();
        System.out.println("------------------");
    }
    public String getProfesion() {
        return profesion;
    }
    public String getPartidoNombre() {
        return partido.nombreP;
    }
}
