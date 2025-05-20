public class Vaksin24 {
    nodeVaksin24 head;
    int size;

    public Vaksin24(){
        head = null;
        size = 0;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(String nama) {
        if (isEmpty()) {
            head = new nodeVaksin24(null, nama, null);
        } else {
            nodeVaksin24 newNode = new nodeVaksin24(null, nama, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
        System.out.println("Data " + nama + " ditambahkan di awal antrian.");
    }

    public void addLast(String nama) {
        if (isEmpty()) {
            addFirst(nama);
        } else {
            nodeVaksin24 current = head;
            while (current.next != null) {
                current = current.next;
            }
            nodeVaksin24 newNode = new nodeVaksin24(current, nama, null);
            current.next = newNode;
            size++;
            System.out.println("Data " + nama + " ditambahkan di akhir antrian.");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak bisa menghapus data.");
        } else {
            System.out.println("Data " + head.nama + " telah divaksinasi.");
            head = head.next;
            if (head != null) head.prev = null;
            size--;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            nodeVaksin24 current = head;
            System.out.println("Daftar Antrian Vaksin:");
            int no = 1;
            while (current != null) {
                System.out.println(no + ". " + current.nama);
                current = current.next;
                no++;
            }
            System.out.println("Sisa antrian: " + size);
        }
    }

    public int size() {
        return size;
    }
}
