/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion;

/**
 *
 * @author NitroPc
 */
public class CasoDbis {

    static int salario(int horas, int horasextra, int salariobase) {
        final int horastrabajadas = (int)(horas + horasextra * 1.5);
        salariobase = salariobase * horas;

        return salariobase;
    }

    public static void main(String[] args) {
        int horas = 35;
        int horasextras = 4;
        int salariobase = 1000;

        System.out.println(salario(horas, horasextras, salariobase));
    }
}
