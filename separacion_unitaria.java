import java.util.Scanner;
public class separacion_unitaria {

    public static void main(String[] args) {
  	Scanner scanner = new Scanner(System.in);
    
    int d1=0, d2=0, d3=0, d4=0, d5=0, d6=0;
    //Sistema de scanner
  	System.out.print("Introduce un número de 6 dígitos: ");
  	
    if (scanner.hasNextInt()) {
        int num = scanner.nextInt();
        //Operaciones para transformar en decimales
  	    d6 = num % 10;          
  	    d5 = (num / 10) % 10;   
  	    d4 = (num / 100) % 10; 
	    d3 = (num / 1000) % 10; 
	    d2 = (num / 10000) % 10;
	    d1 = (num / 100000) % 10;
    } 
        else {
        System.out.println("Solo se permiten números.");
        scanner.close();
        return;
    }
    scanner.close();
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
	System.out.print(barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t");
	System.out.println(esquinasuperiorder);

	System.out.println(barravertical+ "\tC_M\t" + barravertical + "\tD_M \t" + barravertical + "\tM \t" + barravertical+ "\tC \t" + barravertical + "\tD \t" + barravertical + "\tU \t" + barravertical);
    
  	System.out.println(esquinamedioizq+""+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+esquinamedioder);

	System.out.println(barravertical+ " \t" + d1 + " \t" + barravertical + " \t\t" + barravertical + " \t\t" + barravertical+ " \t\t" + barravertical+ " \t\t" + barravertical+ " \t\t" + barravertical);
	System.out.println(barravertical+ " \t\t" + barravertical + " \t" + d2 + " \t" + barravertical + " \t\t" + barravertical+ " \t\t" + barravertical+ " \t\t" + barravertical+ " \t\t" + barravertical);
	System.out.println(barravertical+ " \t\t" + barravertical + " \t\t" + barravertical + " \t"  + d3 + " \t" + barravertical+ " \t\t" + barravertical+ " \t\t" + barravertical+ " \t\t" + barravertical);

	System.out.println(barravertical+ " \t\t" + barravertical + " \t\t" + barravertical + " \t\t" + barravertical+" \t"  + d4 + " \t" + barravertical + " \t\t" + barravertical + " \t\t" + barravertical);
	System.out.println(barravertical+ " \t\t" + barravertical + " \t\t" + barravertical + " \t\t" + barravertical+ " \t\t" + barravertical + " \t"  + d5 + "\t" + barravertical + " \t\t" + barravertical);
	System.out.println(barravertical+ " \t\t" + barravertical + " \t\t" + barravertical + " \t\t" + barravertical+ " \t\t" + barravertical + " \t\t" + barravertical + " \t"  + d6 + "\t" + barravertical);
	
	System.out.print(esquinainferiorizq);
	System.out.print(barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t");
	System.out.print(esquinainfder+" "+"\n");

	}
}
