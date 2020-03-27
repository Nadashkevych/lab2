package products;

public class FilmCD extends CD {
    private int minutes;

    public FilmCD(String id, String publishingDate, String author, String publishing,
                  double price, int minutes) {
        super(id, publishingDate, author, publishing, price);
        this.minutes = minutes;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Override
    public boolean timeExceeded(int time) {
        return super.timeExceeded(time);
    }
}
