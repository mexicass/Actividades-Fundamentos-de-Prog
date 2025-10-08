import java.util.Scanner;

public class decision_numero {
	public static void main (String [] args) {
	Scanner entrada = new Scanner (System.in);

	System.out.println("Ingresa el numero: ");
	int num = entrada.nextInt();

	System.out.println("¿Que le gustaria hacer? ");
	System.out.println("1-Sumar \n2-Invertir");
	int decision = entrada.nextInt ();
	
	int d1,d2,d3,d4,d5,d6;

	if (decision == 1){		
		d6 = num % 10;          
  		d5 = (num / 10) % 10;   
  		d4 = (num / 100) % 10; 
		d3 = (num / 1000) % 10; 
		d2 = (num / 10000) % 10;
		d1 = (num / 100000) % 10;

		int resultado = d1+d2+d3+d4+d5+d6;
		System.out.println(resultado);
	} else	if (decision == 2){
		d1 = num % 10;
        d2 = (num / 10) % 10;
        d3 = (num / 100) % 10;
        d4 = (num / 1000) % 10;
        d5 = (num / 10000) % 10;
        d6 = (num / 100000) % 10;
		
		int invertido =
        d1 * 100000 +
        d2 * 10000 +
        d3 * 1000 +
        d4 * 100 +
        d5 * 10 +
        d6;
		System.out.println(invertido);
	}
	
	}
}
