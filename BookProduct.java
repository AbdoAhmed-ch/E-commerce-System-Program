public class BookProduct extends Product {
    private String author;
    private String publisher;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    //constructor

    public BookProduct(int productID, String name, float price, String author, String publisher) {
        super(productID, name, price);
        this.author = author;
        this.publisher = publisher;
    }

    public void setProductId(int i) {
    }
}
