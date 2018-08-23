/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo1;

/**
 *
 * @author yoselin, omar
 */
public class Potencia_Cuadrado {
    
    public static double potencia_cuadrado (double numero) {
	double resultado = numero * numero;
	return resultado;
    }
    
    public static double raiz_cuadrada (double numero) {
	    double resultado = Math.sqrt(numero);
	    return resultado;
    }

    public static double raiz_cubica (double numero) {
	    double resultado =  Math.pow(numero, 1.0/3.0); 
	    return resultado;
    }

    public static double potencia_cubica (double numero) {
	    double resultado =  Math.pow(numero, 3); 
	    return resultado;
    }

    public static double multiplicacion (double n1, double n2) {
	    return n1 * n2;
    }

    public static double division (double n1, double n2) {
	    return n1 / n2;
    }

}
