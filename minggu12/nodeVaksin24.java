public class nodeVaksin24 {
    String nama;
    nodeVaksin24 prev;
    nodeVaksin24 next;

    public nodeVaksin24(nodeVaksin24 prev, String nama, nodeVaksin24 next){
        this.prev = prev;
        this.nama = nama;
        this.next = next;
    }
}
