package Ejercicio2;
//Excepción personalizada
class NumeroInvalidoException extends Exception {
 public NumeroInvalidoException(String mensaje) {
     super(mensaje);
 }
}

class Calculadora {

 // a) Métodos estáticos para operaciones básicas
 public static int sumar(int a, int b) {
     return a + b;
 }

 public static int restar(int a, int b) {
     return a - b;
 }

 public static int multiplicar(int a, int b) {
     return a * b;
 }

 // b) Si divisor es 0, lanzar ArithmeticException
 public static double dividir(int a, int b) {
     if (b == 0) {
         throw new ArithmeticException("Error: No se puede dividir entre cero.");
     }
     return (double) a / b;
 }

 // c) Conversión String -> int con excepción personalizada
 public static int convertirANumero(String valor) throws NumeroInvalidoException {
     try {
         return Integer.parseInt(valor);
     } catch (NumberFormatException e) {
         throw new NumeroInvalidoException("Error: '" + valor + "' no es un número válido.");
     }
 }
}

//d) Programa Principal
public class Main {
 public static void main(String[] args) {

     // Operaciones correctas
     System.out.println("Suma: " + Calculadora.sumar(10, 5));
     System.out.println("Resta: " + Calculadora.restar(10, 5));
     System.out.println("Multiplicación: " + Calculadora.multiplicar(10, 5));

     // Manejo de error al dividir entre cero
     try {
         System.out.println("División: " + Calculadora.dividir(10, 0));
     } catch (ArithmeticException ex) {
         System.out.println(ex.getMessage());
     }

     // Prueba de conversión correcta
     try {
         int numero = Calculadora.convertirANumero("123");
         System.out.println("Conversión exitosa: " + numero);
     } catch (NumeroInvalidoException ex) {
         System.out.println(ex.getMessage());
     }

     // Caso con error en conversión de texto
     try {
         int numero = Calculadora.convertirANumero("abc");
         System.out.println(numero);
     } catch (NumeroInvalidoException ex) {
         System.out.println(ex.getMessage());
     }

     System.out.println("\nFin del programa.");
 }
}
