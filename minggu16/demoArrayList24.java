
import java.util.ArrayList;

public class demoArrayList24 {
    public static void main(String[] args) {
        ArrayList<costumer24> costumers = new ArrayList<>(2);

        costumer24 costumer1 = new costumer24(1, "Zakia");
        costumer24 costumer2 = new costumer24(5, "Budi");

        costumers.add(costumer1);
        costumers.add(costumer2);

        costumers.add(new costumer24(4, "Cica"));

        for(costumer24 cust : costumers){
            System.out.println(cust.toString());
        }
    }
}
