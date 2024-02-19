/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Ángel Redondo
 */
public class Main {

    public static void main(String[] args) {
        cuentas.CCuenta cuenta1; // Cambiamos el nombre
        double saldoActual;

        cuenta1 = new cuentas.CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        operativa_cuenta(cuenta1, 0); // Probamos el nuevo método y que se obre la magia
    }

    // Nuevo método que engloba las operaciones con la cuenta :-)
    public static void operativa_cuenta(cuentas.CCuenta cuenta, float cantidad) {
        try {
            cuenta.ingresar(cantidad);
            System.out.println("Ingreso en cuenta: " + cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
}
