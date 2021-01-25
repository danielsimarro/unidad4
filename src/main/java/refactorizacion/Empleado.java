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
public class Empleado {

    private int horas;
    private int horasextra;
    private tipoEmpleado tipo;


    public double getsueldo() {
        return tipo.getHorabase() * tipo.calculoHoras(horas, horasextra);
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }

    public void setTipo(tipoEmpleado tipo) {
        this.tipo = tipo;
    }

    
    
    

}
