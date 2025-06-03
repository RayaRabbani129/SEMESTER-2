public class binaryTreeArray24 {
    mahasiswa24[] dataMahasiswa;
    int idxLast;

    public binaryTreeArray24(){
        this.dataMahasiswa = new mahasiswa24[10];
    }

    void populateData(mahasiswa24 dataMhs[], int idxLast){
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if(idxStart <= this.idxLast){
            if(dataMahasiswa[idxStart] != null){
                traverseInOrder(2*idxStart+1);
                dataMahasiswa[idxStart].tampilkanInformasi();
                traverseInOrder(2*idxStart+2);
            }
        }
    }
}
