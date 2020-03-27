package main;

import products.Book;
import products.MusicCD;
import products.Product;
import user.User;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Jan", "Kowalski", "Wroclawska 1/1", 25, "12.02.2010");

        Product product1 = new MusicCD("1234", "21.03.12", "Metallica",
                "Nuclear Blast", 62.20, 8);
        Product product2 = new Book("3456", "31.05.1987", "M. Zawadzka",
                "PWN", 88.80, 324);

        user1.addToSet(product1);
        user1.addToSet(product2);

        user1.getProducts().stream()
                .forEach(product -> product.punishUser(user1));

        user1.payBills(50);

        user1.blockUser();
    }
}
