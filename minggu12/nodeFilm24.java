public class nodeFilm24 {
    Film24 data;
    nodeFilm24 prev, next;

    public nodeFilm24(nodeFilm24 prev, Film24 data, nodeFilm24 next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
