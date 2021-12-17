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
        double promedio;
        double suma = 0;
        String mensajeFinal = "";

        for (int i = 0; i < arreglo.length; i++) {
            suma = suma + arreglo[i];
            promedio = suma / 13;

            if (arreglo[i] > promedio) {
                elementosArribaMedia = arreglo[i];
                System.out.printf("Elemento Arriba de la media %.2f\n",
                        elementosArribaMedia);

            } else {
                if (arreglo[i] < promedio) {
                    elementosAbajoMedia = arreglo[i];
                    System.out.printf("Elemento abajo de la media %.2f\n",
                            elementosAbajoMedia);

                }

            }

        }

    }

}
