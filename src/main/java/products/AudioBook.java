package products;

public class AudioBook extends Product {
    private double midiSize;

    public AudioBook(String id, String publishingDate, String author, String publishing,
                     double price, double midiSize) {
        super(id, publishingDate, author, publishing, price);
        this.midiSize = midiSize;
    }

    public double getMidiSize() {
        return midiSize;
    }

    public void setMidiSize(double midiSize) {
        this.midiSize = midiSize;
    }

    @Override
    public boolean timeExceeded(int time) {
        return super.timeExceeded(time);
    }
}
