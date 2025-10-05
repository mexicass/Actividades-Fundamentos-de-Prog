import java.util.Scanner;

public class grados {
    public static void main(String [] args){
    
    //Constantes
    final double congelacion_farenheit = 32;
    
    //Sistema de Scanner
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el valor en grados celsius\nPor ejemplo: '10.5'");
    double celsius = entrada.nextDouble();
    
    //Opereciones
    double farenheit = (celsius*9/5)+congelacion_farenheit;

    ///caja
	char barrahorizontal='\u2500';
	char barravertical='\u2502';
	char esquinasuperiorizq='\u250C';
	char esquinainferiorizq='\u2514';
	char esquinasuperiorder='\u2510';
	char esquinainfder='\u2518';
    char esquinamedioizq='\u251c';
    char esquinamedioder='\u2524';

	System.out.print(esquinasuperiorizq);
	System.out.print(barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t");
	System.out.println(esquinasuperiorder);

	System.out.println(barravertical+ "\tCelsius \t" + barravertical + "\tFormula \t" + barravertical + "\tFarenheit \t" + barravertical);
    
    System.out.println(esquinamedioizq+""+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+esquinamedioder);

	System.out.println(barravertical+ " \t" + celsius + " \t\t" + barravertical + " \t\t\t" + barravertical + " \t\t\t" + barravertical);
	System.out.println(barravertical+ " \t\t\t" + barravertical + " (Celsius x 9/5) + 32F" + "\t" + barravertical + " \t\t\t" + barravertical);
	System.out.println(barravertical+ " \t\t\t" + barravertical + " \t\t\t" + barravertical + " \t"  + farenheit + " \t\t" + barravertical);
	
	System.out.print(esquinainferiorizq);
	System.out.print(barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t");
	System.out.print(esquinainfder+" "+"\n");
    
    }
}
