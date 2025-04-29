import java.util.Scanner;
public class mahasisaDemo24 {
    public static void main(String[] args) {
        StackTugasMahasiswa24 stack = new StackTugasMahasiswa24(5);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do{
            System.out.println("\nMenu: ");
            System.out.println("1. Mungumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat tugas teratas");
            System.out.println("4. Melihat daftar tugas");
            System.out.println("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();
                switch(pilih){
                case 1:
                System.out.print("Nama: ");
                String nama = sc.nextLine();
                System.out.print("NIM: ");
                String nim = sc.nextLine();
                System.out.print("Kelas: ");
                String kelas = sc.nextLine();
                mahasiswa24 mhs = new mahasiswa24(nama, nim, kelas);
                stack.push(mhs);
                System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                break;
                case 2: 
                mahasiswa24 dinilai = stack.pop();
                if(dinilai != null){
                    System.out.println("Menilai tugas dari " + dinilai.nama);
                    System.out.print("Masukkan nilai (0-100): ");
                    int nilai = sc.nextInt();
                    dinilai.tugasDinilai(nilai);
                    System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                    String biner = stack.konversiDesimalKeBiner(nilai);
                    System.out.println("Nilai biner tugas: " + biner);
                }
                break;
                case 3:
                mahasiswa24 lihat = stack.peek();
                if(lihat != null){
                    System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                }
                break;
                case 4: 
                System.out.println("Daftar semua tugas");
                System.out.println("Nama\tNIM\tKelas");
                stack.print();
                break;
                default:
                System.out.println("Pilihan tidak valid");
            }
        }while(pilih >= 1 && pilih <= 4);
    }
}
