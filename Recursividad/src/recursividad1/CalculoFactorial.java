/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad1;

/**
 *
 * @author SALAS
 */
public class CalculoFactorial {

    //Declaracion recursiva del metodo factorial
    public double factorial(double numero) {
        if (numero <= 1) {//Calculo del caso base
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
    }//Fin del metodo factorial
    //imprime factoriales para los valores del 0 al 10

    public void mostrarFactoriales() {
        //Calcula los factoriales del 0 al 10
        for (int contador = 0; contador <= 4; contador++) {
            System.out.printf("%d! = %.0f\n", contador, factorial(contador));
        }
    }//fin del metodo mostrarfactoriales
}// fin de la clase CalculoFactorial
