public class MahasiswaMain24 {
    public static void main(String[] args) {
        Mahasiswa24 mhs1 = new Mahasiswa24();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2441720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa24 mhs2 = new Mahasiswa24("Anaisa Salsabila","2141720160",3.25,"TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa24 mhs3 = new Mahasiswa24("Raya Rabbani Ananta Aryasatya","244107020159",3.20,"TI 1A");
        mhs3.updateIpk(3.30);
        mhs3.tampilkanInformasi();
        }
    }  