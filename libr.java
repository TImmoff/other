class Book {
    int price;
    String AuthorName;

    Book() {
        price = 1000;
        AuthorName = "No Name";

    }

    Book(int price) {
        this.price = price;
        AuthorName = "No Name";
    }

    Book(int price, String AuthorName) {
        this.price = price;
        this.AuthorName = AuthorName;

    }

    public int getPrice() {
        return price;
    }

    public String getAuthorName() {
        return AuthorName;
    }

    public void setPrice(int price) {
        this.price = price;

    }

    public void setAuthorName(String AuthorName) {
        this.AuthorName = AuthorName;

    }

    public String toString() {
        return ("--- AuthorName=" + AuthorName + "---Price=" + price);
    }
}

public class libr {
    public static void main(String[] argz) {
        Book b1 = new Book();
        Book b2 = new Book(3000);
        Book b3 = new Book(500, "Lermontov");
        System.out.println(b1.getAuthorName() + b1.getPrice());
        b1.setAuthorName("Lomonosov");
        System.out.println(b1);
        System.out.println(b3);
        b3.setPrice(15000);
        System.out.println(b3);

    }

}