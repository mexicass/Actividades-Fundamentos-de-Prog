import java.lang.Math;

public class ecuaciones {
	public static void main(String [] args){
	
	double a = 1;
	double b = -5;
	double c = 6;

	double cuadrada = b * b;
	double termino_4ac = 4 * a * c;
	double raiz = Math.sqrt(cuadrada - termino_4ac);
	double termino_2a = 2 * a;

	double solucion_x1 = (-b + raiz) / termino_2a;
	double solucion_x2 = (-b - raiz) / termino_2a;

	System.out.println("x1 = " + solucion_x1);
	System.out.println("x2 = " + solucion_x2);

	}
}
