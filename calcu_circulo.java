import java.util.Scanner;

public class calcu_circulo {
    public static void main(String[]args){
    
    Scanner valor_de_radio;
    double radio;
    double perimetro;
    double area;
    final double PI=3.14159;
    
    System.out.print("Este programa calcula el valor del area y perimetro\nEnseguida se le pedira ingresar un valor numerico al radio\n");
    System.out.println("Por ejemplo 1.0");
    
    System.out.print("Ingrese el valor del radio: \nValor del radio= ");
    valor_de_radio=new Scanner(System.in);
    radio=valor_de_radio.nextDouble();
    valor_de_radio.close();
    area=PI*(radio*radio);
    perimetro=(2*radio)*PI;

    System.out.println("El area de un circulo con valor de radio: " + radio + " es igual a: " + area);
    System.out.println("El perimetro el igual a: " + perimetro);

    }
}

