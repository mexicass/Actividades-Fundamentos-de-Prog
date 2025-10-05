import java.util.Scanner;
public class conversion_binaria {
    public static void main(String [] args){

    //Sistema Scanner
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingresa el valor Decimal para hacer la conversion a Binario (0-256): ");
    int num = entrada.nextInt();
    entrada.close();

    //operaciones 
    int b1 = (num/ (int)Math.pow(2,8)) % 2;
    int b2 = (num/ (int)Math.pow(2,7)) % 2;
    int b3 = (num/ (int)Math.pow(2,6)) % 2;
    int b4 = (num/ (int)Math.pow(2,5)) % 2;
    int b5 = (num/ (int)Math.pow(2,4)) % 2;
    int b6 = (num/ (int)Math.pow(2,3)) % 2;
    int b7 = (num/ (int)Math.pow(2,2)) % 2;
    int b8 = (num/ (int)Math.pow(2,1)) % 2;
    int b9 = (num/ (int)Math.pow(2,0)) % 2;
    
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
	System.out.print(barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal);
	System.out.println(esquinasuperiorder);

	System.out.println(barravertical+ "\t Decimal \t" + barravertical + "\t Binario \t " + barravertical);
    
  	System.out.println(esquinamedioizq+""+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+esquinamedioder);

	System.out.println(barravertical+ " \t" + num + " \t\t" + barravertical + " \t\t\t " + barravertical);
	System.out.println(barravertical+ " \t\t\t" + barravertical + " \t" + b1+b2+b3+b4+b5+b6+b7+b8+b9 + " \t " + barravertical);
	
	System.out.print(esquinainferiorizq);
	System.out.print(barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal);
	System.out.print(esquinainfder+" "+"\n");
    }
}
