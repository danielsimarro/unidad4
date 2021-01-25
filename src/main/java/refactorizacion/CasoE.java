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
public class CasoE {

    static String buscaAnimal(String[] animales) {

        for (String animale:animales) {
            if (animale.equals("Perro")) {
                return "Perro";
            }
            if (animale.equals("Tortuga")) {
                return "Tortuga";
            }

            if (animale.equals("Loro")) {
                return "Loro";
            }

        }
        return "No encontrado";
    }

    public static void main(String[] args) {
        String[] animales1 = {"pez", "pájaro", "León"};
        String[] animales2 = {"pez", "Loro", "León"};

        System.out.println(buscaAnimal(animales1));
        System.out.println(buscaAnimal(animales2));
    }
}
