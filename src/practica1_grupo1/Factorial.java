/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo1;

/**
 *
 * @author samuelrosales
 */
public class Factorial {
    
    
    public static double factorial(double numero) {

        if (numero == 0) {
            return 1;
        } else {
            return numero * factorial(numero - 1);
        }
        
    }
    
}
