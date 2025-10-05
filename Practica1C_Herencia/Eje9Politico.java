package Ejercicio9;
class Politico {
    protected String profesion;
    protected int aniosExp;

    public Politico(String profesion, int aniosExp) {
        this.profesion = profesion;
        this.aniosExp = aniosExp;
    }

    public void mostrarPolitico() {
        System.out.println("Profesión: " + profesion + ", Años de experiencia: " + aniosExp);
    }
}