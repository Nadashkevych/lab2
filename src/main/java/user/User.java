package user;

import products.Product;

import java.util.LinkedHashSet;
import java.util.Set;

public class User {
    private String name;
    private String lastName;
    private String address;
    private int age;
    private String signUpDate;
    private boolean blocked;
    private Set<Product> products;
    private int account;

    public User(String name, String lastName, String address, int age, String signUpDate) {
        this.name = name;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.signUpDate = signUpDate;
        this.blocked = false;
        this.account = 0;
        this.products = new LinkedHashSet<Product>();
    }

    public String getName() {
        return name;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSignUpDate() {
        return signUpDate;
    }

    public void setSignUpDate(String signUpDate) {
        this.signUpDate = signUpDate;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public int getAccount() {
        return account;
    }

    public void payBills(int amount) {
        this.account += amount;
    }

    public void addToSet(Product product) {
        this.products.add(product);
    }

    public void blockUser() {
        if (this.getAccount() < 0) {
            System.out.println("Nie oplaciles kar za przekroczenie terminu wypozyczenia.\n" +
                    "Konto zostalo zablokowane.");
            this.setBlocked(true);
        }
    }
}
