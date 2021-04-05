package snackbarApp;

public class Snack {
    private static int maxId = 1;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, int quantity, double cost, int vendingMachineId) {
        id = maxId;
        maxId++;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public int getVendId() {
        return vendingMachineId;
    }

    public void setVendId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    public int getStock() {
        return quantity;
    }

    public void addStock(int quantity) {
        this.quantity += quantity;
    }

    public void buySnack(int amount){
        this.quantity -= amount;
    }

    public double priceCheck(int amount) {
        return cost * amount;
    }

    @Override
    public String toString() {

		return 
			"Snack: " + name + "\n" +
			"Vending Machine: Food" + "\n" +
			"Quantity: " + quantity + "\n" +
            "Total Cost: $" + quantity * cost + "\n";
	}

}