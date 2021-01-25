/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion;

/**
 *
 * @author daniel
 */
public class CasoA {

    static void printCuenta(String nombre, double cantidad) {
        printLogo();
        printDetalles(nombre,cantidad);

    }
    
    static void printDetalles(String nombre, double cantidad){
        System.out.println("nombre: " + nombre);
        System.out.println("Cantidad: " + cantidad);
    }

    static void printLogo() {

        System.out.println("LOGO");
    }

    public static void main(String[] args) {

        printCuenta("Antonio", 200.00);

    }
}
