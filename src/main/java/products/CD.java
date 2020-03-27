package products;

public class CD extends Product {

    public CD(String id, String publishingDate, String author, String publishing, double price) {
        super(id, publishingDate, author, publishing, price);
    }

    @Override
    public boolean timeExceeded(int time) {
        return super.timeExceeded(time);
    }
}
