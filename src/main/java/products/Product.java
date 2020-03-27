package products;

import user.User;

import java.util.Scanner;

public class Product {
    private String id;
    private String publishingDate;
    private String author;
    private String publishing;
    private double price;
    private final int MAX_TIME = 30;

    public Product(String id, String publishingDate, String author, String publishing, double price) {
        this.id = id;
        this.publishingDate = publishingDate;
        this.author = author;
        this.publishing = publishing;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPublishingDate() {
        return publishingDate;
    }

    public void setPublishingDate(String publishingDate) {
        this.publishingDate = publishingDate;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getMAX_TIME() {
        return MAX_TIME;
    }

    public boolean timeExceeded(int time) {
        if (time > this.MAX_TIME) {
            System.out.println("Przekroczono maksymalny czas wypozyczenia.");
            return true;
        } else {
            int timeLeft = this.MAX_TIME - time;
            System.out.println("Pozostalo " + timeLeft + " dni.");
            return false;
        }
    }

    public void punishUser(User user) {
        Scanner input = new Scanner(System.in);
        for (Product p : user.getProducts()) {
            System.out.println("Ile dni masz produkt (o numerze id " + p.id + ") wypozyczony?");
            int time = input.nextInt();
            if (p.timeExceeded(time)) {
                user.setAccount(user.getAccount() - (getMAX_TIME() - time) * (-3));
                System.out.println("Przekroczono limit dni wypozyczenia.\n" +
                        " Kazdy dzien ponad limit powoduje obciazenie kara pieniezna w rozmiarze 3zl.\n" +
                        "Twoj stan konta to: " + user.getAccount());
                break;
            } else break;
        }
    }
}
