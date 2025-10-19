//abriendo class
public class clasificacion_char {

    //aqui estoy utiliando el (throws Exception) para que pueda trabajar con la lectura del caracter
    public static void main(String[] args) throws Exception {
        
        //Sistema de Scanner de otra manera, para que me lea el primer digito
        System.out.println("Ingrese un solo carácter (A-Z, a-z)(0-9) o un Símbolo Especial y presione Enter:");
        int codigo = System.in.read();
        
        //declarando las variables y cambios de ella
        char caracter = (char) codigo;
        String tipo;


        //if para saber que caso es
        if ((caracter >= 'A' && caracter <= 'Z') || (caracter >= 'a' && caracter <= 'z')) {
            tipo = "LETRA";
        } else if (caracter >= '0' && caracter <= '9') {
            tipo = "DÍGITO";
        } else  {
            tipo = "SÍMBOLO ESPECIAL";
        }

        //print del resultado, utilizo el printf para que me de el calor del unicode
        System.out.println("Resultado:");
        System.out.println("Carácter ingresado: " + caracter);
        System.out.printf("Código Unicode: \\u%04X \n", (int) caracter);
        System.out.println("Tipo: " + tipo);

    }
}