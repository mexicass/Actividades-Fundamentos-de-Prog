//importaciones
import java.util.Scanner;

//abriendo class
public class pares_impares {
    public static void main(String [] args){

        //Sistema de Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el numero a evaluar: ");
        int num = entrada.nextInt();
        entrada.close();

        //declarando char's
        String grafico = "\uD83D\uDCCA";
        char caracter = '\u2500';

        //Identificando si el numero es positivo o negativo, impar o par 
        if (num > 0 && num % 2 == 0) {
            System.out.println(grafico + " Clasificación Compleja de Número Entero " + grafico);
            System.out.println("\t   Número a evaluar: " + num);

            for (int linea = 0; linea < 45; linea++){
	            System.out.print(caracter);
			}
			System.out.println();

            System.out.println("\tEl numero es: POSITIVO PAR");
        }
        else if (num > 0 && num % 2 != 0){
            System.out.println(grafico + " Clasificación Compleja de Número Entero " + grafico);
            System.out.println("\t   Número a evaluar: " + num);

            for (int linea = 0; linea < 45; linea++){
	            System.out.print(caracter);
			}
			System.out.println();

            System.out.println("\tEl numero es: POSITIVO IMPAR");
        }
        else if (num < 0 && num % 2 == 0){
            System.out.println(grafico + " Clasificación Compleja de Número Entero " + grafico);
            System.out.println("\t   Número a evaluar: " + num);

            for (int linea = 0; linea < 45; linea++){
	            System.out.print(caracter);
			}
			System.out.println();

            System.out.println("\tEl numero es: NEGATIVO PAR");
        }
        else if (num < 0 && num % 2 != 0){
            System.out.println(grafico + " Clasificación Compleja de Número Entero " + grafico);
            System.out.println("\t   Número a evaluar: " + num);

            for (int linea = 0; linea < 45; linea++){
	            System.out.print(caracter);
			}
			System.out.println();

            System.out.println("\tEl numero es: NEGATIVO IMPAR");
        }
        else if (num == 0){
            System.out.println(grafico + " Clasificación Compleja de Número Entero " + grafico);
            System.out.println("\t   Número a evaluar: " + num);

            for (int linea = 0; linea < 45; linea++){
	            System.out.print(caracter);
			}
			System.out.println();

            System.out.println("\t   El numero es: CERO");
        }
    }
}
