import java.util.Scanner;
public class calificaciones {
	public static void main(String [] args){
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingresa la Calificacion");
	int cali = entrada.nextInt();

	
	if (cali == 100) {
		System.out.println("A");
	} if (cali == 90) { 
		System.out.println("B");
	} if (cali == 80) {
		System.out.println("C");
	} if (cali == 70) {
		System.out.println("D");
	} else if (cali <= 60){
		System.out.println("NA");
	}
}
}
