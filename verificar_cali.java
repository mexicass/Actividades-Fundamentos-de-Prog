import java.util.Scanner;
public class verificar_cali {
	public static void main(String [] args){
	
	Scanner entrada = new Scanner(System.in);
	System.out.println("Ingresa la Calificacion");
	int cali = entrada.nextInt();

	
	if (cali >= 90) {
		if (cali <= 100)
		System.out.println("A");
        return;
	}
	
	if (cali >= 80) { 
		if (cali <= 90) 
		System.out.println("B");
        return;
	} 

	if (cali >= 70) {
		if (cali <= 80)
		System.out.println("C");
        return;
	} 
	
	if (cali >= 60) {
		if (cali <= 70)
		System.out.println("D");
        return;
	} 

	else {
		System.out.println("NA");
        return;
	}

	}
}
