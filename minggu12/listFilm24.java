public class listFilm24 {
    nodeFilm24 head;
    int size;

    public void addFilm(Film24 film) {
        if (head == null) {
            head = new nodeFilm24(null, film, null);
        } else {
            nodeFilm24 current = head;
            while (current.next != null) {
                current = current.next;
            }
            nodeFilm24 newNode = new nodeFilm24(current, film, null);
            current.next = newNode;
        }
        size++;
        System.out.println("Film berhasil ditambahkan.");
    }

    public void print() {
        if (head == null) {
            System.out.println("Daftar film kosong.");
            return;
        }
        nodeFilm24 current = head;
        System.out.println("Daftar Film:");
        while (current != null) {
            System.out.printf("ID: %d | Judul: %s | Rating: %.1f\n", 
                current.data.id, current.data.judul, current.data.rating);
            current = current.next;
        }
    }

    public void cariDariId(int id) {
        nodeFilm24 current = head;
        while (current != null) {
            if (current.data.id == id) {
                System.out.printf("Ditemukan -> ID: %d | Judul: %s | Rating: %.1f\n",
                    current.data.id, current.data.judul, current.data.rating);
                return;
            }
            current = current.next;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    public void sortByRatingDescending() {
        if (head == null || head.next == null) return;

        nodeFilm24 i = head;
        while (i != null) {
            nodeFilm24 j = i.next;
            while (j != null) {
                if (j.data.rating > i.data.rating) {
                    Film24 temp = i.data;
                    i.data = j.data;
                    j.data = temp;
                }
                j = j.next;
            }
            i = i.next;
        }
        System.out.println("Daftar film berhasil diurutkan berdasarkan rating (descending).");
    }
}
