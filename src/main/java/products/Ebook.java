package products;

public class Ebook extends Book {
    private double size;

    public Ebook(String id, String publishingDate, String author, String publishing,
                 double price, int pages, double size) {
        super(id, publishingDate, author, publishing, price, pages);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public boolean timeExceeded(int time) {
        return super.timeExceeded(time);
    }
}
