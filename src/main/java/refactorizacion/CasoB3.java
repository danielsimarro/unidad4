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
public class CasoB3 {

    public static void main(String[] args) {
        System.out.println(incrementoPrecioBase(10, 2000.0));
    }

    static double incrementoPrecioBase(int cantidad, double preciounitario) {
        
        if (preciobase(cantidad,preciounitario) > 1000) {
            return preciobase(cantidad,preciounitario) * 0.90;
        } else {
            return preciobase(cantidad,preciounitario) * 0.95;
        }
        
    }
    
    static double preciobase(int cantidad, double preciounitario){
        return cantidad*preciounitario;
    }
    
    
}
