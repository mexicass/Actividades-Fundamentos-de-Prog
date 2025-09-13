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

        for (int i = 0; i < caja.size(); i++) {
            System.out.println(caja.get(i));
        }        
    }
}
