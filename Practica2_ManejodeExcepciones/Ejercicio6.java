package Ejercicio6;
//Excepción personalizada
class FondosInsuficientesException extends Exception {
 public FondosInsuficientesException(String mensaje) {
     super(mensaje);
 }
}

//Clase CuentaBancaria
class CuentaBancaria {
 private String numeroCuenta;
 private String titular;
 private double saldo;

 public CuentaBancaria(String numeroCuenta, String titular, double saldo) {
     this.numeroCuenta = numeroCuenta;
     this.titular = titular;
     this.saldo = saldo;
 }

 // Método depositar
 public void depositar(double monto) {
     if (monto <= 0) {
         throw new IllegalArgumentException("El monto a depositar debe ser positivo.");
     }
     saldo += monto;
     System.out.println("Depósito exitoso: " + monto);
 }

 // Método retirar
 public void retirar(double monto) throws FondosInsuficientesException {
     if (monto > saldo) {
         throw new FondosInsuficientesException("Fondos insuficientes. Saldo disponible: " + saldo);
     }
     saldo -= monto;
     System.out.println("Retiro exitoso: " + monto);
 }

 // Método mostrar info
 public void mostrarInfo() {
     System.out.println("Cuenta: " + numeroCuenta);
     System.out.println("Titular: " + titular);
     System.out.println("Saldo: " + saldo);
 }
}

//Programa principal
public class Main {
 public static void main(String[] args) {
     // Crear cuenta
     CuentaBancaria cuenta = new CuentaBancaria("12345", "Juan Pérez", 1000);
     cuenta.mostrarInfo();
     System.out.println();

     // Depósitos
     try {
         cuenta.depositar(500); // depósito válido
     } catch (IllegalArgumentException e) {
         System.out.println("Error en depósito: " + e.getMessage());
     }

     try {
         cuenta.depositar(-100); // depósito negativo -> error
     } catch (IllegalArgumentException e) {
         System.out.println("Error en depósito: " + e.getMessage());
     }

     System.out.println();

     // Retiros
     try {
         cuenta.retirar(300); // retiro válido
     } catch (FondosInsuficientesException e) {
         System.out.println("Error en retiro: " + e.getMessage());
     }

     try {
         cuenta.retirar(1500); // retiro mayor al saldo -> excepción
     } catch (FondosInsuficientesException e) {
         System.out.println("Error en retiro: " + e.getMessage());
     }

     System.out.println();
     // Mostrar información final
     cuenta.mostrarInfo();
 }
}

