package products;

public class Book extends Product {
    private int pages;

    public Book(String id, String publishingDate, String author, String publishing, double price, int pages) {
        super(id, publishingDate, author, publishing, price);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean timeExceeded(int time) {
        return super.timeExceeded(time);
    }
}
