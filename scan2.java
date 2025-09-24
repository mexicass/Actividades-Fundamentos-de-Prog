import java.util.Scanner;

public class scan2 {
	public static void main(String [] args){

	Scanner entrada = new Scanner (System.in);
	
	///sistema de scanner
	System.out.print("Ingresa el tiempo en segundos: ");
	int segundos = entrada.nextInt();
	

	///sistema conversion
	int convertir_minutos = segundos / 60;
	int convertir_horas = segundos / 3600;	
	
	
	///caja
	char barrahorizontal='\u2500';
	char barravertical='\u2502';
	char esquinasuperiorizq='\u250C';
	char esquinainferiorizq='\u2514';
	char esquinasuperiorder='\u2510';
	char esquinainfder='\u2518';

	System.out.print( esquinasuperiorizq );
	System.out.print(  barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t");
	System.out.println( esquinasuperiorder);

	System.out.println(barravertical+ "  Segundos \t" + barravertical + "\tMinutos\t\t" + barravertical + "\tHoras   " + barravertical);	

	System.out.println(barravertical+ "    " + segundos + "\t\t" + barravertical + "\t\t\t" +barravertical+ "\t\t" +barravertical);
	System.out.println(barravertical+ "\t\t" + barravertical + "\t   " + convertir_minutos + " " + "\t\t" +barravertical+ "\t\t" +barravertical);
	System.out.println(barravertical+ "\t\t" + barravertical + "\t\t\t" + barravertical + "\t"  + convertir_horas + "\t" +barravertical);
	
	System.out.print( esquinainferiorizq);
	System.out.print( barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t"+barrahorizontal+"\t");
	System.out.print( esquinainfder+" "+"\n");
	
	/*System.out.println("En minutos es:" + segundos + " Segundos" );
	System.out.println("En minutos es:" + convertir_minutos + " Minutos");
	System.out.println("En horas es:" + convertir_horas + " Horas");*/

	}
}
