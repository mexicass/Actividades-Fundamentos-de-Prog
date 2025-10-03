import java.util.Scanner;

public class prueba_numero {
	public static void main (String [] args) {
	Scanner entrada = new Scanner (System.in);

	System.out.println("Ingresa el numero: ");
	int num = entrada.nextInt();

	System.out.println("¿Que le gustaria hacer? ");
	System.out.println("1-Sumar \n 2-Invertir");
	int decision = entrada.nextInt ();

	int d1=0, d2=0, d3=0, d4=0, d5=0, d6=0;
	
	int numero=0;

	if (decision == 1){
		d6 = num % 10;          
  		d5 = (num / 10) % 10;   
  		d4 = (num / 100) % 10; 
		d3 = (num / 1000) % 10; 
		d2 = (num / 10000) % 10;
		d1 = (num / 100000) % 10;

		int resultado = d1+d2+d3+d4+d5+d6;
		System.out.println(num);
	} else {
		int digito = num % 10;
            	num = num * 10 + digito;
            	num = num / 10;
		
	}
	
	System.out.println(num);

	}
}
