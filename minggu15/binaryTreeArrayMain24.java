public class binaryTreeArrayMain24 {
    public static void main(String[] args) {
        binaryTreeArray24 bta = new binaryTreeArray24();
        mahasiswa24 mhs1 = new mahasiswa24("244160121", "Ali", "A", 3.57);
        mahasiswa24 mhs2 = new mahasiswa24("244160221", "Badar", "B", 3.85);
        mahasiswa24 mhs3 = new mahasiswa24("244160185", "Candra", "C", 3.21);
        mahasiswa24 mhs4 = new mahasiswa24("244160220", "Dewi", "B", 3.54);

        mahasiswa24 mhs5 = new mahasiswa24("244160131", "Devi", "A", 3.72);
        mahasiswa24 mhs6 = new mahasiswa24("244160205", "Ehsan", "D", 3.37);
        mahasiswa24 mhs7 = new mahasiswa24("244160170", "Fizi", "B", 3.64);

        mahasiswa24[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);
        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);
    }
}
