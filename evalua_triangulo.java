import java.util.Scanner;

public class evalua_triangulo {
	public static void main(String [] args){
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingresa el 1er lado valor del triangulo");	
	int lado1 = entrada.nextInt();

	System.out.println("Ingresa el 2do valor del triangulo");	
	int lado2 = entrada.nextInt();

	System.out.println("Ingresa el 3er valor del triangulo");	
	int lado3 = entrada.nextInt();
	entrada.close();
	
	int operacion3 = (lado3) * (lado3);
	int operacion2 = (lado1) * (lado1) / (lado2) * (lado2);


	if (lado1 == lado2 && lado2 == lado3) {
    		System.out.println("El triángulo es equilátero.");
	} else 
		if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
    		System.out.println("El triángulo es isósceles.");
	} else {
    		System.out.println("El triángulo es escaleno.");
	}

	System.out.println("La operacion es: " + operacion3 + " = " + operacion2);
	}
}
