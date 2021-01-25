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
public class CasoB3bis {

    public static void main(String[] args) {
        System.out.println(incrementoPrecioBase(10, 2000.0));
    }

    static double incrementoPrecioBase(int cantidad, double preciounitario) {
        final double preciobase = cantidad * preciounitario;
        final double descuento;
        if (preciobase > 1000) {
            descuento = 0.90;

        } else {
            descuento = 0.95;

        }

        return preciobase * descuento;
    }
}
