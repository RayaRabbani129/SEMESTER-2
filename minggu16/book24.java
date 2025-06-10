public class book24 {
    public String isbn;
    public String title;

    public book24(){

    }

    public book24(String isbn, String title){
        this.isbn = isbn;
        this.title = title;
    }

    public String toString(){
        return "ISBN: " + this.isbn + "Title: " + this.title;
    }
}
