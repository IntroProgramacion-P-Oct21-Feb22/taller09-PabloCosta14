/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Antes de analizar el presente ejercicio,
        usted debe revisar y entender lo desarrollado
        en el archivo Ayuda01.java del paquete2
         */
        Scanner entrada = new Scanner(System.in);

        String[] estudiantes = {"Kimberly", "Hogan",
            "Teresa", "Luis", "Mark", "Jennifer",
            "Alcides"};
        String inicial;

        boolean bandera = true;
        while (bandera) {
            System.out.println("Ingrese una letra");
            inicial = entrada.nextLine();

            for (int i = 0; i < estudiantes.length; i++) {

                char inicialLetra = estudiantes[i].charAt(0);

            }
            if (inicial.equals("K") || inicial.equals("H")
                    || inicial.equals("L") || inicial.equals("T")
                    || inicial.equals("J") || inicial.equals("M")
                    || inicial.equals("A")) {
                System.out.println("Ha salido del proceso con exito");
                bandera = false;
            } else {
                System.out.println("La letra no coincide");
            }

        }

    }

}
