import java.util.Scanner;
public class mainFaktorial24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = sc.nextInt();

        faktorial24 fk = new faktorial24();
        System.out.println("Nilai faktorial " + nilai + "menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai + "menggunakan BF: " + fk.faktorialDC(nilai));
    }
}
