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
public class CasoF {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Empleado trabajador = new Empleado();

        trabajador.setHoras(40);
        trabajador.setHorasextra(5);
        

        System.out.println(trabajador.getsueldo());
    }
}
