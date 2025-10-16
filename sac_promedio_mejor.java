import java.util.Scanner;

public class sac_promedio_mejor {
	public static void main(String [] args){
    
    Scanner entrada = new Scanner(System.in);

        int calificacion1 = 0, calificacion2 = 0, calificacion3 = 0;
        for (int j=0; j<3; j++){
        System.out.println("Ingresa la calificaion en 8 cifras");
        int calificacion = entrada.nextInt();
        if (j == 0) calificacion1 = calificacion;
        else if (j == 1) calificacion2 = calificacion;
        else if (j == 2) calificacion3 = calificacion;
        }
        
        for (int i=0; i<3; i++){
        int calificacion = 0;

        if (i == 0) calificacion = calificacion1;
        else if (i == 1) calificacion = calificacion2;
        else if (i == 2) calificacion = calificacion3;

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
        
        if (promedio < 100 && promedio > 59) {
            System.out.println("El promedio de las calificaciones es: " + promedio + "\nCalificacion aprobatoria \n");
        } else 
            System.out.println("El promedio de las calificaciones es: " + promedio + "\nCalificacion reprobatoria \n");
        
    }
    
    entrada.close();
    
    }
}