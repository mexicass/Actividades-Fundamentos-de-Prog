import java.util.Scanner;

public class ciclos {
	public static void main(String [] args){
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa el numero: ");
		int num = entrada.nextInt();
	 

		char caracter = '\u2500';



		for (int i=1; i<21; i++){

		        for (int linea = 1; linea < 10; linea++){
	        	System.out.print(caracter);
		}
			System.out.println();

			int resultado = num * i;
			System.out.println(i + "x" + num + "=" + resultado);

		        for (int linea = 1; linea < 10; linea++){
	        	System.out.print(caracter);
		}
			System.out.println();
        	
		}
			
	
	}
}
