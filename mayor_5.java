import java.util.Scanner;
public class mayor_5 {
	public static void main(String [] args){
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingresa un valor numerico de X");
	int x = entrada.nextInt();
	
	System.out.println("Ingresa un valor numerico de Y");
	int y = entrada.nextInt();

	
	if (x > 4) {
		if (y > 4)
		System.out.println("X,Y son mayores a 5");
	} else {
		System.out.println("X,Y son menores a 5");
	}
}
}
