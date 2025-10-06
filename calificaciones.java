import java.util.Scanner;
public class par {
	public static void main(String [] args){
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingresa la Calificacion");
	int cali = entrada.nextInt();

	
	if (cali > 90) {
		if (cali < 100)
		System.out.println("A");
	}
	
	if (cali > 80) { 
		if (cali < 90) 
		System.out.println("B");
	} 

	if (cali > 70) {
		if (cali < 80)
		System.out.println("C");
	} 
	
	if (cali > 60) {
		if (cali < 70)
		System.out.println("D");
	} 

	else {
		System.out.println("NA");
	}

	}
}
