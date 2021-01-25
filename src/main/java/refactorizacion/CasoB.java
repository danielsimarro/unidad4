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
public class CasoB {

    static int numerodecervezas = 6;

    static int rondaGratis() {

        return (numerodecervezas > 5) ? 2 : 1;
    }

    public static void main(String[] args) {

        System.out.println(rondaGratis());

    }

}
