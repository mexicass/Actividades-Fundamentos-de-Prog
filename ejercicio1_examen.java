import java.util.Scanner;

public class ejercicio1_examen {
	public static void main(String [] args){
		Scanner entrada = new Scanner (System.in);

		System.out.println("Ingresa el numero de 5 cifras (ej 99999): ");
		int num = entrada.nextInt();
		entrada.close();
	
		int d1=0, d2=0, d3=0, d4=0, d5=0;
		char pi = '\u03C0';
		int valor_entero = (int) pi;
		String linea = "________________________________________________________________";

		d5 = num % 10;          
  	    d4 = (num / 10) % 10;   
  	   	d3 = (num / 100) % 10; 
	    d2 = (num / 1000) % 10; 
	    d1 = (num / 10000) % 10;

		double promedio = (d1 + d3 + d5) / 3;

		int unidadmillar = d2;
		int decenas = d4;

		double numero = unidadmillar + (decenas / 10.0);

		double resta = valor_entero - numero;

		System.out.println(linea);
		System.out.println("El numero es: " + d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
		System.out.println(linea);		
		System.out.println("El Promedio de (decenas de millares, Centenas, Unidades) es: " + promedio);
		System.out.println(linea);
		System.out.println("El numero creado por (Unidades de millar, Decenas) es:" + numero);
		System.out.println(linea);
		System.out.println("El numero entero es:" + valor_entero);
		System.out.println(linea);
		System.out.println("La resta de los valores es:" + resta);
		System.out.println(linea);

	}
}