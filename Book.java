public class Book {
    private String title;
    private double price;

    public Book(String bookTitle, double bookPrice) {
        this.title = bookTitle;
        this.price = bookPrice;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return Double.toString(price);
    }

}