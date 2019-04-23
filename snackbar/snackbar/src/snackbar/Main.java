package snackbar;

public class Main {
    private static void workWithData() {
        // LOAD UP CUSTOMERS
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.13);

        // STATING VENDING MACHINES
        // Vending v1 = new Vending("Food");
        // Vending v2 = new Vending("Drink");
        // Vending v3 = new Vending("Office");

        // STATING SNACKS IN MACHINES

        Snack s1 = new Snack("Chips", 36, 1.75, 1);
        Snack s2 = new Snack("Pretzels", 30, 2.00, 1);
        Snack s3 = new Snack("Chocolate Bar", 36, 1.00, 1);

        Snack s4 = new Snack("Water", 24, 2.50, 2);
        Snack s5 = new Snack("Soda", 20, 2.75, 2);

        // DO SUMTHIN

        System.out.println("AM I IS WORKIN" + s4.quantity);
        System.out.println("$" + c1.spend(s4.buySnacks(3)) + "there is :" + s4.quantity);
        System.out.println(c1.spend(s3.buySnacks(1)) + "there is :" + s3.quantity);
        System.out.println("$" + c2.spend(s4.buySnacks(2)) + "there is :" + s4.quantity);
        System.out.println("$" + c1.add(10));
        System.out.println("$" + c1.spend(s2.buySnacks(1)) + "there is :" + s2.quantity);
        System.out.println("there are " + s3.add(12));
        System.out.println("$" + c2.spend(s3.buySnacks(3)) + "there is :" + s3.quantity);
    }

    public static void main(String[] args) {
        workWithData();
    }
}