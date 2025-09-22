public class circulo {
	public static final double PI = 3.14159;
	public static void main(String [] args){
	
	final int RADIO = 1;

	double area = PI * RADIO * RADIO;
	double perimetro = 2 * PI * RADIO;
	
	System.out.println("El Area es igual a: "+ area);
	System.out.println("El perimetro es igual a: "+ perimetro);

	}
}
