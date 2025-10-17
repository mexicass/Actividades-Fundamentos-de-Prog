//importacioes
import java.util.Scanner;

//abriendo class
public class asignacion_if {
    public static void main(String [] args){

        //Sistema de scanner para ingresar segundos
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de segundos a convertir (6 Cifras): ");
        int segundos = entrada.nextInt();
        entrada.close();

        ///sistema conversion
	    int convertir_minutos = segundos / 60;
	    int convertir_horas = segundos / 3600;

        //haciendo la caja on for
        char caracter = '\u2500';
            
        if (segundos >= 100000 && segundos <= 999999){
            //parte de arriba de la caja
        	for (int linea = 0; linea < 30; linea++){
	            System.out.print(caracter);
			}
			System.out.println();

            //encabezado de la caja
        System.out.println("| Segundos | Minutos | Horas |");

            //parte inferior del cabezado
            for (int linea = 0; linea < 30; linea++){
	            System.out.print(caracter);
			}
			System.out.println();

        //informamacion de la caja formateado con printf, para mejor acomodo de las informaciones
        System.out.printf("|  %-7d |  %-6s |  %-4s |\n", segundos, "" , "");
        System.out.printf("| %-8s |  %-6d |  %-4s |\n", "", convertir_minutos , "");
        System.out.printf("| %-8s |  %-6s |  %-4d |\n", "", "" , convertir_horas);

            //parte inferior de la caja
            for (int linea = 0; linea < 30; linea++){
	            System.out.print(caracter);
			}
			System.out.println();
        } else {
            System.out.println("Solo se aceptan numeros de 6 cifras (Ej. 999999)");
        }
        

    }
}