/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author PabloCosta14
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] arreglo = {1, 10, 11, 12, 12, 13, 16, 2, 3, 4, 9, 10, 21};
        double elementosArribaMedia = 0;
        double elementosAbajoMedia = 0;
        double media;
        double suma = 0;

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
        }
        for (int i = 0; i < arreglo.length; i++) {

            media = suma / arreglo.length;

            if (arreglo[i] > media) {
                elementosArribaMedia = elementosArribaMedia + 1;

            } else {
                if (arreglo[i] < media) {
                    elementosAbajoMedia = elementosAbajoMedia + 1;

                }

            }

        }
        System.out.printf("Los Elementos Arriba de la media son %.2f\nLos Elementos "
                + "debajo de la media son: %.2f\n", elementosArribaMedia,
                elementosAbajoMedia);

    }

}
