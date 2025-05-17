public class SLLmain24 {
    public static void main(String[] args) {
        singleLinkedList24 sll = new singleLinkedList24();

        mahasiswa24 mhs1 = new mahasiswa24("24212200", "Alvaro", "1A", 4.0);
        mahasiswa24 mhs2 = new mahasiswa24("23212201", "Binom", "2B", 3.8);
        mahasiswa24 mhs3 = new mahasiswa24("22212202", "Cintia", "3C", 3.5);
        mahasiswa24 mhs4 = new mahasiswa24("21212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFrist(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
