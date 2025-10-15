import java.util.Scanner;

public class ciclos_nose {
	public static void main(String [] args){
		Scanner entrada = new Scanner (System.in);

		System.out.println("Ingresa el numero de 8 cifras: ");
		int num = entrada.nextInt();
		System.out.println("Ingresa el numero de 8 cifras: ");
		int num1 = entrada.nextInt();
		System.out.println("Ingresa el numero de 8 cifras: ");
		int num2 = entrada.nextInt();
		
		int d1,d2,d3,d4,d5,d6,d7,d8;
		
		d6 = num % 10;
		d5 = (num / 10) % 10;
		d4 = (num / 100) % 10;
		d3 = (num / 1000) % 10;
		d2 = (num / 10000) % 10;
		d1 = (num / 100000) % 10; 	

		for (int i=0; i<4; i++){
			
		d8 = num % 10;          
  		d7 = (num / 10) % 10;   
  		d6 = (num / 100) % 10; 
		d5 = (num / 1000) % 10; 
		d4 = (num / 10000) % 10;
		d3 = (num / 100000) % 10;
		d2 = (num / 1000000) % 10;
		d1 = (num / 10000000) % 10;

		int resultado = d1+d2+d3+d4+d5+d6+d7+d8;
		System.out.println(resultado);

		}
	}
}
