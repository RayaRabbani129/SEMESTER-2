import java.util.ArrayList;
public class demoArrayList24 {
    public static void main(String[] args) {
        ArrayList<costumer24> costumers = new ArrayList<>(2);

        costumer24 costumer1 = new costumer24(1, "Zakia");
        costumer24 costumer2 = new costumer24(5, "Budi");

        costumers.add(costumer1);
        costumers.add(costumer2);

        costumers.add(new costumer24(4, "Cica"));

        costumers.add(new costumer24(100, "Rosa"));

        System.out.println(costumers.indexOf(costumer2));

        costumer24 costumer = costumers.get(1);
        System.out.println(costumer.name);
        costumer.name = "Budi Utomo";

        ArrayList<costumer24> newCostumers = new ArrayList<>();
        newCostumers.add(new costumer24(201, "Della"));
        newCostumers.add(new costumer24(202, "Victor"));
        newCostumers.add(new costumer24(203, "Sarah"));

        costumers.addAll(newCostumers);

        for(costumer24 cust : costumers){
            System.out.println(cust.toString());
        }

        System.out.println(costumers);
    }
}
