import java.util.Scanner;

public class sacando_promedio {
	public static void main(String [] args){
    
    Scanner entrada = new Scanner(System.in);

        for (int i=0; i<3; i++){
        System.out.println("Ingresa la calificaion en 8 cifras");
        int calificacion = entrada.nextInt();

        int p4 = calificacion % 100;
        int p3 = (calificacion / 100) % 100;
        int p2 = (calificacion / 10000) % 100;
        int p1 = (calificacion / 1000000) % 100;

        System.out.println("Las calificaciones son:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        int promedio = (p1 + p2 + p3 + p4) /4;

        System.out.println("El promedio de las calificaciones es: " + promedio);

        }

    entrada.close();

    }
}