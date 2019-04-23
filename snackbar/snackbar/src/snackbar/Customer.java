package snackbar;

public class Customer {
    // FIELDS
    public static int maxId = 0;
    public int id;
    public String name;
    public double cash;

    // CONSTRUCTORS
    public Customer(String name, double cash) {
        maxId++;
        id = maxId;

        this.name = name;
        this.cash = cash;
    }

    // METHODS

    public double spend(double cost) {
        this.cash -= cost;
        return this.cash;
    }

    public double add(double add) {
        this.cash += add;
        return this.cash;
    }

}