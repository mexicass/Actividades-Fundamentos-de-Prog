import javax.swing.JOptionPane;

public class calc_joption {
    public static void main(String []args ){
            Integer num1 = null, num2 = null, num3 = null, numero = null;

        for (int j=0; j<3; j++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los Numeros a sumar: "));
                if (j == 0) num1 = numero;
                else if (j == 1) num2 = numero;
                else if (j == 2) num3 = numero;
        }
        for (int i=0; i<3; i++){
                if (i == 0) numero = num1;
                else if (i == 1) numero = num2;
                else if (i == 2) numero = num3;
        }
        
        Integer calculo = num1 + num2 + num3;
        JOptionPane.showMessageDialog(null, "La suma de los numeros es: " + calculo);
    }
}
