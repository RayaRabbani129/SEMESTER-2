import java.util.Scanner;
public class kafeKu24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        kafe24 kafeKu = new kafe24("Sejuk", "Malang", 30);

        kafeKu.tampilkanInfoKafe();
        kafeKu.tampilkanMenu();

        for(int i = 0; i < 5; i++){
            System.out.println("Pilih Menu Yang Akan Dipesan");
            System.out.println("1. Mie");
            System.out.println("2. Tahu");
            System.out.println("3. Es Kuwut");
            System.out.println("4. Es Kopi");
            System.out.print("Pilih 1-5");
            int pilihan = sc.nextInt();
        }

    }
}
