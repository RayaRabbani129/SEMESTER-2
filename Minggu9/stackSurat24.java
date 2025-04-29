public class stackSurat24 {
    surat24[] surat;
    int top;
    int size;

    public stackSurat24(int size){
        this.size = size;
        surat = new surat24[size];
        top = -1;
    }

    public boolean isFull(){
        if(top == size -1){
            return true;
        }else{
            return false;
        }
    }

    public boolean isEmpty (){
        if (top == -1) {
            return true;
        }
        else{
            return false;
        }
    }

    public void TerimaSuratIzin (surat24 srt){
        if (!isFull()){
            top++;
            surat[top] = srt;
        }
        else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat lagi. ");
        }
    }

    public surat24 Proses (){
        if (!isFull()){
            surat24 s = surat[top];
            top--;
            return s;
        }
        else {
            System.out.println("Surat kosong!");
            return null;
        }
    }

    public surat24 LihatSuratTerakhir (){
        if (!isEmpty()){
            return surat[top];
        }
        else {
            System.out.println("Kosong! Tidak ada Surat yang diterima");
            return null;
        }
    }

    public surat24 CariSurat (String nm){
        for (int i=0; i<=size; i++){
            if (nm.equalsIgnoreCase(surat[i].namaMahasiswa)){
                return surat[i];
            }
        }
        return null;
    }
    
}
