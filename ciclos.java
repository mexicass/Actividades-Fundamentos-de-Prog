import java.util.Scanner;

public class ciclos {
	public static void main(String [] args){
		//Sistema de Scanner 
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa el numero: ");
		int num = entrada.nextInt();
		entrada.close();

		//Declarando variables
		char caracter = '\u2500';

		//Haciendo las operaciones
			for (int linea = 1; linea < 10; linea++){
	        System.out.print(caracter);
			}
			System.out.println();

			for (int i=1; i<21; i++){
			int resultado = num * i;
			System.out.println(num + "x" + i + "=" + resultado);
			}

			for (int linea = 1; linea < 10; linea++){
	        System.out.print(caracter);
	    	}
			System.out.println();
	}
}

