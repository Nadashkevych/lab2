package products;

public class MusicCD extends CD {
    private int tracks;

    public MusicCD(String id, String publishingDate, String author, String publishing,
                   double price, int tracks) {
        super(id, publishingDate, author, publishing, price);
        this.tracks = tracks;
    }

    public int getTracks() {
        return tracks;
    }

    public void setTracks(int tracks) {
        this.tracks = tracks;
    }

    @Override
    public boolean timeExceeded(int time) {
        return super.timeExceeded(time);
    }
}
