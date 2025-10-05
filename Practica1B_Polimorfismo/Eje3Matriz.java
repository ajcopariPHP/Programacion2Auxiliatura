package Ejercicio3;
public class Matriz {
    private float[][] matriz;
    private int n; // tamaño de la matriz (máx 10x10)

    public Matriz(int n) {
        if (n > 10) n = 10; // límite
        this.n = n;
        matriz = new float[n][n];
        for (int i = 0; i < n; i++) {
            matriz[i][i] = 1.0f; // matriz identidad
        }
    }
    // b) Constructor que recibe matriz
    public Matriz(float[][] datos) {
        this.n = datos.length;
        if (n > 10) n = 10;
        matriz = new float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = datos[i][j];
            }
        }
    }
    // c) Método para sumar dos matrices
    public Matriz sumar(Matriz m) {
        if (this.n != m.n) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
        }
        float[][] resultado = new float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = this.matriz[i][j] + m.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }
    // c) Método para restar dos matrices
    public Matriz restar(Matriz m) {
        if (this.n != m.n) {
            throw new IllegalArgumentException("Las matrices deben tener el mismo tamaño");
        }
        float[][] resultado = new float[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultado[i][j] = this.matriz[i][j] - m.matriz[i][j];
            }
        }
        return new Matriz(resultado);
    }
    // d) Método para verificar si dos matrices son iguales
    public boolean igual(Matriz m) {
        if (this.n != m.n) return false;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (this.matriz[i][j] != m.matriz[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
    // Método para imprimir la matriz
    public void mostrar() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

