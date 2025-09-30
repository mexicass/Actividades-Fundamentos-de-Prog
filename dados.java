import java.util.Scanner;
public class dados {   
    public static void main(String[] args) {
    
    Scanner dados = new Scanner (System.in);

    System.out.println("Cual es tu nombre? ");
    String nome = dados.nextLine();
     
    System.out.println("Cual es tu edad? ");
    int idade = dados.nextInt();

    System.out.println("Cual es tu altura? ");
    double altura = dados.nextDouble();

    dados.close();


    System.out.printf("Tu nombre es: %s\n", nome);
    System.out.printf("Tienes %d\n", idade);
    System.out.printf("Mides %.2f\n", altura);

    }
}
