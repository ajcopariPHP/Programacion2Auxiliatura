package Ejercicio7;
class Estudiante extends Persona {
    private String ru;
    private String matricula;

    public Estudiante(String nombre, String paterno, String materno, int edad, String ru, String matricula) {
        super(nombre, paterno, materno, edad);
        this.ru = ru;
        this.matricula = matricula;
    }
    @Override
    public void mostrar() {
        System.out.println("=== ESTUDIANTE ===");
        super.mostrar();
        System.out.println("RU: " + ru + ", Matrícula: " + matricula);
    }
    public void modificarEdad(int nuevaEdad) {
        this.edad = nuevaEdad;
    }
    public static double promedioEdad(Estudiante e1, Estudiante e2) {
        return (e1.edad + e2.edad) / 2.0;
    }
}
