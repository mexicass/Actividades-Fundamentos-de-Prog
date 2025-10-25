import javax.swing.JOptionPane;

public class janela_pratica {
    public static void main(String [] args){
        String cadena;
        int entero;
        char letra;
        double decimal;

        cadena = JOptionPane.showInputDialog("Digite una cadena: ");

        entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un entrero: ")); 

        letra = JOptionPane.showInputDialog("Digite una Letra: ").charAt(0);

        decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un Numero decimal (Ej. 99.9): "));

        JOptionPane.showMessageDialog(null, "La cadena es: "+cadena);
        JOptionPane.showMessageDialog(null, "El numero entero es: "+entero);
        JOptionPane.showMessageDialog(null, "La primer letra es: "+letra);
        JOptionPane.showMessageDialog(null, "El numero decimal es: "+decimal);

    }
}
