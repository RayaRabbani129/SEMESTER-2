import java.util.Scanner;
public class SLLmain24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        singleLinkedList24 sll = new singleLinkedList24();

        System.out.print("Berapa banyak mahasiswa yang ingin ditambahkan? ");
        int jumlah = sc.nextInt();
        sc.nextLine(); 
        

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMahasiswa ke-" + (i + 1));
            System.out.print("Nama   : ");
            String nama = sc.nextLine();
            System.out.print("NIM    : ");
            String nim = sc.nextLine();
            System.out.print("Kelas  : ");
            String kelas = sc.nextLine();
            System.out.print("IPK    : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 
            
            mahasiswa24 mhs = new mahasiswa24(nim, nama, kelas, ipk);
            sll.addLast(mhs); 
        }
        System.out.println("\nData Linked List:");
        sll.print();
        System.out.println("data index 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

    }
}
