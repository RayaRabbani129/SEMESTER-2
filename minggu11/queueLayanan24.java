public class queueLayanan24 {
    nodeMahasiswa24JS11 front, rear;
    int size;

    public queueLayanan24() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(Mahasiswa24JS11 mhs) {
        nodeMahasiswa24JS11 baru = new nodeMahasiswa24JS11(mhs);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        size++;
        System.out.println("Berhasil menambahkan mahasiswa di antrian");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada yang dapat dipanggil.");
        } else {
            System.out.print("Memanggil mahasiswa: ");
            front.data.tampilkan();
            front = front.next;
            size--;
            if (front == null) rear = null;
        }
    }

    public void peekFront() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terdepan: ");
            front.data.tampilkan();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.print("Mahasiswa terakhir: ");
            rear.data.tampilkan();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar antrian:");
            nodeMahasiswa24JS11 temp = front;
            while (temp != null) {
                temp.data.tampilkan();
                temp = temp.next;
            }
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
}
