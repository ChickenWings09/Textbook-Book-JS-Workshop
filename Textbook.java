public class Textbook extends Book {
    private int editionNumber;

    public Textbook(String bookTitle, double bookPrice, int editionNumber) {
        super(bookTitle, bookPrice);
        this.editionNumber = editionNumber;
    }
    
    public String getEditionNumber() {
        return Integer.toString(editionNumber);
    }

    public String getBookInfo(bookTitle, bookPrice, editionNumber) {
        return (title + "\n" + price + "\n" + editionNumber);
    }

    public static void main(String[] args) {
        System.out.println(getBookInfo("KABAK", "12.00", "142"));
    }

    public static Boolean canSubstituteFor(Textbook textbook, Textbook textbook2) {
        if (textbook.getTitle() == textbook2.getTitle() && textbook.getEditionNumber() >= textbook2.getEditionNumber())
    }

}
