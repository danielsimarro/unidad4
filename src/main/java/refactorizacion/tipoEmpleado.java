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

    public String getTipo() {
        return tipo;
    }

    public double getHorabase() {
        return horabase;
    }

    public void setTipoEmpleado(String t, double h) {
        this.tipo = t;
        this.horabase = h;
    }
}
