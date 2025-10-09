import java.util.Scanner;
public class conversion_hexadecimal {
    public static void main(String [] agrs){
        //sistema de scanner
        Scanner entrada = new Scanner(System.in);
        int decimal = entrada.nextInt();
        System.out.println("Ingrese el valor decimal: ");
        entrada.close();
        
        //operaciones
        int cociente = decimal / 16 % 16;

        //definicion de las letras
        char A ='66';
	    char esquinasuperiorder='\u2510';
	    char esquinainfder='\u2518';
  	    char esquinamedioizq='\u251c';
  	    char esquinamedioder='\u2524';

        System.out.println("El número " + decimal + " en hexadecimal es: " + hexadecimal);
    }
}
