import java.util.Scanner;

public class evalua_rango {
	public static void main(String [] args){
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingresa el numero para checar si esta en el rango (100-1000)");	
	int num1 = entrada.nextInt();

	System.out.println("Ingresa el numero para checar si esta en el rango (100-1000)");	
	int num2 = entrada.nextInt();
	entrada.close();

	if (num1 < 1000 && num2 > 100) {
		System.out.println("El numero 1 y numero 2 cumple");
	} else {
		System.out.println("El numero no esta en el rango");
	}

	if (num1 < 1000 || num2 > 100) {
		System.out.println("Al menos 1 numero cumple");
	} else {
		System.out.println("El numero no esta en el rango");
	}
	
	if (num1 < 1000 && !(num2 > 100)) {
		System.out.println("Ningun numero cumple");
	} else {
		System.out.println("El numero no esta en el rango");
	}


	}
}
