import javax.swing.JOptionPane;

public class salario_semana {
    public static void main(String[]args){
        Integer horas;
        Double salario_hora;

        horas = Integer.parseInt(JOptionPane.showInputDialog("Cuantas horas trabajas por semana? "));
        salario_hora = Double.parseDouble(JOptionPane.showInputDialog("Cuanto ganas por hora? "));

        Double calculo = salario_hora * horas;

        JOptionPane.showMessageDialog(null, "Su salario semanal es: " + String.format("%.2f", calculo));
    }
}
