/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_grupo1;
import java.util.Scanner;
import Factorial;
import Potencia_Cuadrado;

/**
 *
 * @author Fernando
 */
public class Practica1_Grupo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
	int salida=0;	
	while(salida==0){
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Selecione una opcion");
		numero = teclado.nextInt();
		if(numero==1){
			System.out.print("Factorial de un numero");
			double numero;
			Scanner lector = new Scanner(System.in);
			System.out.print("Ingrese numero:");
			numero = lector.nextDouble();
			System.out.print(Factorial.factorial(numero));

		}else if(numero==2){
			System.out.print("Cuadrado de un numero");
			double numero;
			Scanner lector = new Scanner(System.in);
			System.out.print("Ingrese numero:");
			numero = lector.nextDouble();
			System.out.print(Potencia_Cuadrado.potencia_cuadrado(numero));

		}else if(numero==3){
			System.out.print("Raiz Cuadrada de un numero");
			double numero;
			Scanner lector = new Scanner(System.in);
			System.out.print("Ingrese numero:");
			numero = lector.nextDouble();
			System.out.print(Potencia_Cuadrado.raiz_cuadrada(numero));
		}else if(numero==4){
			System.out.print("Potencia cubo de un numero");
			double numero;
			Scanner lector = new Scanner(System.in);
			System.out.print("Ingrese numero:");
			numero = lector.nextDouble();
			System.out.print(Potencia_Cuadrado.potencia_cubica(numero));
		}else if(numero==5){
			System.out.print("Raiz cubo de un numero");
			double numero;
			Scanner lector = new Scanner(System.in);
			System.out.print("Ingrese numero:");
			numero = lector.nextDouble();
			System.out.print(Potencia_Cuadrado.raiz_cubica(numero));
		}else if(numero==6){
			System.out.print("Multiplicacion");
			double numero;
			double numero2;
			Scanner lector = new Scanner(System.in);
			System.out.print("Ingrese numero:");
			numero = lector.nextDouble();
			lector = new Scanner(System.in);
			System.out.print("Ingrese numero:");
			numero2 = lector.nextDouble();
			System.out.print(Potencia_Cuadrado.multiplicacion(numero,numero2));
		}else if(numero==7){
			System.out.print("Multiplicacion");
			double numero;
			double numero2;
			Scanner lector = new Scanner(System.in);
			System.out.print("Ingrese numero:");
			numero = lector.nextDouble();
			lector = new Scanner(System.in);
			System.out.print("Ingrese numero:");
			numero2 = lector.nextDouble();
			System.out.print(Potencia_Cuadrado.division(numero,numero2));					
		}else if(numero==0){
			salida=1;
		}
	}
        	
    }
    
}
