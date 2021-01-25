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
public class CasoB2 {

    public static void main(String[] args) {
        System.out.println(tienePrecioBase());
    }

    static boolean tienePrecioBase() {
        pedido minivan = new pedido();
        minivan.numero = 9;
        minivan.preciobase = 50.0;

        
        return minivan.preciobase > 100;
    }
}
