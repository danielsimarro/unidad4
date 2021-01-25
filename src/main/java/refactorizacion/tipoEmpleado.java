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
public class tipoEmpleado {

    private String tipo;
    private double horabase;
    
    public tipoEmpleado(String t, double h){
        this.tipo=t;
        this.horabase=h;
    }

    public String getTipo() {
        return tipo;
    }

    public double getHorabase() {
        return horabase;
    }

    
    public double calculoHoras(int horas, int horasextra) {
        if (tipo.equals("Supervisor")) {

            return horas + horasextra * 1.40;
        }

        if (tipo.equals("Dependiente")) {

            return horas + horasextra * 1.75;
        }

        return horas + horasextra * 1.5;

    }

    
    

}
