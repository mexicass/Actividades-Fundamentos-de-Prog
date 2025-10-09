import java.util.Scanner;
public class ecuac_simultaneas {
	public static void main(String [] args){
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingresa el coeficiente del dividiendo A");
	int coe1 = entrada.nextInt();

	System.out.println("Ingresa el coeficiente del dividiendo B");
	int coe2 = entrada.nextInt();

	System.out.println("Ingresa el coeficiente del divisor C");
	int coe3 = entrada.nextInt();

	System.out.println("Ingresa el coeficiente del divisor D");
	int coe4 = entrada.nextInt();

	System.out.println("Ingresa el valor de E");
	int coe5 = entrada.nextInt();

	System.out.println("Ingresa el valor de F");
	int coe6 = entrada.nextInt();


	int division = (coe1 * coe4) - (coe2 * coe3); 
	
	if (division == 0) {
		System.out.println("La ecuacion es indefinida");

	} else {
		int x = ((coe5 * coe4) - (coe2 * coe6)) / ((coe1 * coe4) - (coe2 * coe3));
		System.out.println("El Resultado de X es: " + division);

		int y = ((coe1 * coe6) - (coe5 * coe3)) / ((coe1 * coe4) - (coe2 * coe3));
		System.out.println("El Resultado de Y es: " + division);
	}
	
	
	
	
	}
}
