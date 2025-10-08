import java.util.Scanner;

public class inversion_digitos {
    public static void main(String[]args) {
    
        //Sistema de Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa un valor numerico y voy a invertir las cifras (Max 6 digitos): ");
        int valor = entrada.nextInt();

        int d1 = valor % 10;
        int d2 = (valor / 10) % 10;
        int d3 = (valor / 100) % 10;
        int d4 = (valor / 1000) % 10;
        int d5 = (valor / 10000) % 10;
        int d6 = (valor / 100000) % 10;

        int invertido =
        d1 * 100000 +
        d2 * 10000 +
        d3 * 1000 +
        d4 * 100 +
        d5 * 10 +
        d6;

    //caja
    char barrahorizontal='\u2500';
	char barravertical='\u2502';
	char esquinasuperiorizq='\u250C';
	char esquinainferiorizq='\u2514';
	char esquinasuperiorder='\u2510';
	char esquinainfder='\u2518';
  	char esquinamedioizq='\u251c';
  	char esquinamedioder='\u2524';

	System.out.print(esquinasuperiorizq);
	System.out.print(barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal);
	System.out.println(esquinasuperiorder);

	System.out.println(barravertical+ "\t Cifras Normales \t" + barravertical + "\t Cifras Invertidas \t " + barravertical);
    
  	System.out.println(esquinamedioizq+""+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+esquinamedioder);

	System.out.println(barravertical+ " \t" + valor + " \t\t\t" + barravertical + " \t\t\t\t " + barravertical);
	System.out.println(barravertical+ " \t\t\t\t" + barravertical + " \t" + invertido + " \t\t\t " + barravertical);
	
	System.out.print(esquinainferiorizq);
	System.out.print(barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal);
	System.out.print(esquinainfder+" "+"\n");
    
    }
}

