package snackbar;

public class Snack {
    // fields
    private static int maxId = 0;
    public int id;
    public String name;
    public int quantity;
    public double cost;
    public int VID;

    // constructors
    public Snack(String name, int quantity, double cost, int VID) {
        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.VID = VID;

    }

    // getters and setters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return "Snack :" + name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public double getCost() {
    // return "cost: " + cost;
    // }

    public void setCost(double cost) {
        this.cost = cost;
    }

    // public int getQuantity() {
    // return "Quantity: " + quantity;
    // }

    // public int addQuantity() {

    // }

    public double buySnacks(double quan) {
        // make it so you can buy snacks
        double totcost = this.cost * quan;
        this.quantity -= quan;
        return totcost;
    }

    public int add(int quant) {
        this.quantity = +quant;
        return this.quantity;
    }

    // public double totalCost() {
    // // give bought snack total cost
    // }

}