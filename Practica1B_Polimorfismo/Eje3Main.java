package Ejercicio3;
public class Main {
    public static void main(String[] args) {
        // a) Matriz identidad
        Matriz m1 = new Matriz(3);
        System.out.println("Matriz identidad:");
        m1.mostrar();

        // b) Matriz personalizada
        float[][] datos = {
            {1, 2, 3},
            {0, 1, 4},
            {5, 6, 0}
        };
        Matriz m2 = new Matriz(datos);
        System.out.println("\nMatriz personalizada:");
        m2.mostrar();
        // c) Suma
        System.out.println("\nSuma de m1 + m2:");
        Matriz suma = m1.sumar(m2);
        suma.mostrar();
        // c) Resta
        System.out.println("\nResta de m2 - m1:");
        Matriz resta = m2.restar(m1);
        resta.mostrar();
        // d) Verificar igualdad
        System.out.println("\n¿m1 es igual a m2? " + m1.igual(m2));
    }
}

