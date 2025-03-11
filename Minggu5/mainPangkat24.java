import java.util.Scanner;
public class mainPangkat24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = sc.nextInt();

        pangkat24[] png = new pangkat24[elemen];
        for(int i = 0; i < elemen; i++){
            System.out.print("Maukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = sc.nextInt();
            System.out.print("Maukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = sc.nextInt();
            png[i] =  new pangkat24(basis, pangkat);
        }

        System.out.println("HASIL PANGAKAT BRUTEFORCE: ");
        for(pangkat24 p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF());
        }
        System.out.println("HASIL PANGKAT DEVIDE AND CONQUER: ");
        for(pangkat24 p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
