package Ejercicio9;
class Partido {
    protected String nombreP;
    protected String rol;

    public Partido(String nombreP, String rol) {
        this.nombreP = nombreP;
        this.rol = rol;
    }
    public void mostrarPartido() {
        System.out.println("Partido: " + nombreP + ", Rol: " + rol);
    }
}
