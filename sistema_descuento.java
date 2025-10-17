//importaciones
import java.util.Scanner;

//abriendo class
public class sistema_descuento {
    public static void main(String [] args){
        
        //Sistema de Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa su edad para verificar si aplica descuento: ");
        int edad = entrada.nextInt();
        System.out.println("Ingresa el monto para verificar si aplica descuento (ej 100.0): ");
        Double monto = entrada.nextDouble();
        entrada.close();

        //Declarando char's
        char estrella = '\u2605';
        char aceptado = '\u2705';
        char rechazado = '\u274C';
        char trazado = '\u2500';

        //Identificando si el usuario aplica descuento
        if (edad >= 60 && monto >= 100.0){
            System.out.println("\t"+ estrella + " Evaluando Descuento para Cliente Mayor " + estrella);
            System.out.println("\t"+ " Edad del Cliente:" + edad + " Monto de compra:" + monto);

                for (int i=0; i<57; i++){
	            System.out.print(trazado);
			    }
			    System.out.println();

            System.out.println(aceptado + " ¡Felicidades! Usted APLICA para el descuento especial.");

        }else {
            System.out.println("\t" + estrella + " Evaluando Descuento para Cliente Mayor " + estrella);
            System.out.println("\t" + " Edad del Cliente:" + edad + "  Monto de compra:" + monto);

                for (int i=0; i<57; i++){
	            System.out.print(trazado);
			    }
			    System.out.println();

            System.out.println(rechazado + " Lo sentimos,usted NO APLICA para el descuento especial.");
        }
    }
}
