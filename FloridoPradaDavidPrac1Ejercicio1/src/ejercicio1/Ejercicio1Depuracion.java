package ejercicio1;

import java.util.Scanner;

public class Ejercicio1Depuracion {
	private static final int CANTIDAD =5;
	private static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int numero, suma=0, contador;
		
		
		for ( contador=1; contador <= CANTIDAD; contador ++) {
			
			System.out.println("Introduzca un numero "+ contador + " de " + CANTIDAD);
			numero = Integer.parseInt(teclado.nextLine());
			
			if (numero > 10){
				suma=suma + numero;
			}
			
		}
		
		System.out.println("La suma de los numeros positivos " + suma);


	}

}