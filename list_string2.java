import java.util.List;
import java.util.ArrayList;

public class list_string2 {
    public static void main(String[] args) {
        List<String> caja = new ArrayList<>();

        caja.add("*************************");
        caja.add("|\t\t\t|");
        caja.add("|\tMexicas\t\t|");
        caja.add("|\t\t\t|");
        caja.add("*************************");

        System.out.println(caja.get(0));
        System.out.println(caja.get(1));
        System.out.println(caja.get(2));
        System.out.println(caja.get(3));
        System.out.println(caja.get(4));
    }
}