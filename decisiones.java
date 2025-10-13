import java.util.Scanner;

public class decisiones {
	public static void main(String [] args){
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa el numero: ");
		int num = entrada.nextInt();

		System.out.println("¿Que le gustaria hacer? ");
		System.out.println("1-Sumar los digitos del numero \n2-Invertir las cifras \n3-Convertir a binario \n4-Convertir a grados centigrados \n5-salir ");
		int decision = entrada.nextInt ();
		
		int d1,d2,d3,d4,d5,d6,d7,d8;

		switch (decision) {
    		case 1:
        		d5 = num % 10;          
  			d4 = (num / 10) % 10;   
  			d3 = (num / 100) % 10; 
			d2 = (num / 1000) % 10; 
			d1 = (num / 10000) % 10;

			int resultado = d1+d2+d3+d4+d5;
			System.out.println(resultado);
        		break;
    		case 2:
			d1 = num % 10;
        		d2 = (num / 10) % 10;
       			d3 = (num / 100) % 10;
        		d4 = (num / 1000) % 10;
        		d5 = (num / 10000) % 10;
		
			int invertido =
        		d1 * 10000 +
        		d2 * 1000 +
        		d3 * 100 +
        		d4 * 10 +
        		d5;
			System.out.println(invertido);
        		break;
    		case 3:
			d1 = (num/ (int)Math.pow(2,7)) % 2;
    			d2 = (num/ (int)Math.pow(2,6)) % 2;
    			d3 = (num/ (int)Math.pow(2,5)) % 2;
    			d4 = (num/ (int)Math.pow(2,4)) % 2;
    			d5 = (num/ (int)Math.pow(2,3)) % 2;
    			d6 = (num/ (int)Math.pow(2,2)) % 2;
    			d7 = (num/ (int)Math.pow(2,1)) % 2;
    			d8 = (num/ (int)Math.pow(2,0)) % 2;
    
    			System.out.println("Este es el numero en binario: " + d1+d2+d3+d4+d5+d6+d7+d8);
			break;
		case 4:
			int celsius = (num - 32) * 5/9;
			System.out.println("Este es el valor en Celsius: " + celsius);
    			break;

    		default:
        		System.out.println("Saliste de las opciones.");
			break;
		}
	
	}
}
