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
public class CasoC {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String idioma = "Rusa";
        Integer nivelIngles = 0;

        final boolean esRuso = idioma.toUpperCase().indexOf("Ruso") > -1;
        final boolean esAleman = idioma.toUpperCase().indexOf("Aleman") > -1;
        final boolean ingles = nivelIngles > 0;

        if (esRuso && esAleman && ingles) {
            System.out.println("MENSAJE EN INGLES");

        }

    }
}
