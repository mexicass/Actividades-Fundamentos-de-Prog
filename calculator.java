import java.util.Scanner;

public class calculator {
	public static void main(String [] args){
	 
	Scanner Entrada = new Scanner(System.in);
	
	System.out.print("Ingresa el primer valor: ");
	double a = Entrada.nextDouble();

	System.out.print("Ingresa el segundo valor: ");
	double b = Entrada.nextDouble();

	double resta = a - b;
	double suma = a + b;
	double multiplicacion = a * b;
	double division = b / a;
	
	
	System.out.println("El Resultado de la resta es:" + resta);
	System.out.println("El Resultado de la suma es:" + suma);	
	System.out.println("El Resultado de la multiplicacion es:" + multiplicacion);
	System.out.println("El Resultado de la division es:" + division);


	}
}
