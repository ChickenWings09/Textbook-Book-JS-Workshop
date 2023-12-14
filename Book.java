public class Book {
    private String title;
    private double price;

    public Book(String bookTitle, double bookPrice) {
        this.bookTitle = title;
        this.bookPrice = price;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }
    
    public String getBookInfo() {
        return title + "-" + price;
    }
}