import java.util.Scanner;

public class sistema_desc_elaborado {
    public static void main(String [] args){
        
        // Sistema de Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el monto para verificar si aplica descuento (ej 100.0): ");
        double monto = entrada.nextDouble();

        System.out.println("Ingresa la categoría del producto para checar el descuento: ");
        System.out.println("1 - 'E' (Electrónica)");
        System.out.println("2 - 'L' (Libros)");
        int categoria = entrada.nextInt();
        entrada.close();

        // Declarando variables
        double descuentoBase;
        double descuentoAdicional;
        String categoriaNombre = "Otra";

        // Identificando si el usuario aplica descuento
        if (monto >= 500.00) {
            descuentoBase = 0.15;
        } else if (monto >= 200.00) {
            descuentoBase = 0.05;
        } else {
            descuentoBase = 0.0;
        }

        //switch para verificar el descuento adicional y el nombre de la categoría
        switch (categoria) {
            case 1:
                descuentoAdicional = 0.05;
                categoriaNombre = "E";
                break;
            case 2:
                descuentoAdicional = 0.03;
                categoriaNombre = "L";
                break;
            default:
                descuentoAdicional = 0.0;
                categoriaNombre = "Otra";
        }

        // Cálculos
        double montoDescuentoBase = monto * descuentoBase;
        double montoDescuentoAdicional = monto * descuentoAdicional;
        double totalDescuento = descuentoBase + descuentoAdicional;
        double montoDescuentoTotal = montoDescuentoBase + montoDescuentoAdicional;
        double precioFinal = monto - montoDescuentoTotal;

        // Salida
        System.out.println();
        System.out.println("----- Sistema de Descuentos -----");
        System.out.println("Precio Base: " + monto);
        System.out.println("Categoría: " + categoriaNombre);
        System.out.println("Desc. por Monto (" + (descuentoBase * 100) + "%): $" + montoDescuentoBase);
        System.out.println("Desc. por Categoría (" + (descuentoAdicional * 100) + "%): $" + montoDescuentoAdicional);
        System.out.println("---------------------------------");
        System.out.println("Descuento Total Aplicado: " + (totalDescuento * 100) + "%");
        System.out.println("Precio Final: $" + precioFinal);
    }
}
