package snackbarApp;

public class Main {

    public static void main(String[] args) {
        buyingSnacks();
    }
    
    private static void buyingSnacks() {
        
        //Instantiate Customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);
        
        //Instantiate Vending Machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");
        
        //Instantiate Snacks
        int foodVendId = food.getId();
        int drinkVendId = drink.getId();
        Snack chips = new Snack("Chips", 36, 1.75, foodVendId);
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, foodVendId);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, foodVendId);
        Snack soda = new Snack("Soda", 24, 2.50, drinkVendId);
        Snack water = new Snack("Water", 20, 2.75, drinkVendId);

        //Jane buys 3 Sodas
        System.out.println("\nJane buys 3 Sodas");
        soda.buySnack(3);
        jane.removeCash(soda.priceCheck(3));
        System.out.println("Jane has $" + jane.getCashOnHand() + " left in her wallet");
        System.out.println("There are " + soda.getStock() + " sodas left in the " + food.getName() + " machine \n");
     
        //Jane buys 1 Pretzel
        System.out.println("Jane buys 1 Pretzel");
        pretzel.buySnack(1);
        jane.removeCash(pretzel.priceCheck(1));
        System.out.println("Jane has $" + jane.getCashOnHand() + " left in her wallet");
        System.out.println("There are " + pretzel.getStock() + " pretzels left in the " + food.getName() + " machine \n");
        
        //Bob buys 2 Sodas
        System.out.println("\nBob buys 2 Sodas");
        soda.buySnack(2);
        bob.removeCash(soda.priceCheck(2));
        System.out.println("Bob has $" + bob.getCashOnHand() + " left in his wallet");
        System.out.println("There are " + soda.getStock() + " sodas left in the " + food.getName() + " machine \n");
        
        //Jane finds $10
        System.out.println("\nJane finds $10");
        jane.addCash(10.00);
        System.out.println("Jane has $" + jane.getCashOnHand() + " left in her wallet");
        
        //Jane buys 1 Chocolate bar
        System.out.println("\nJane buys 1 Chocolate Bar");
        chocolateBar.buySnack(1);
        jane.removeCash(chocolateBar.priceCheck(1));
        System.out.println("Jane has $" + jane.getCashOnHand() + " left in her wallet");
        System.out.println("There are " + chocolateBar.getStock() + " chocolate bars left in the " + food.getName() + " machine \n");

        //Add 12 more Pretzels
        System.out.println("\nPretzel Restock: +12");
        pretzel.addStock(12);
        System.out.println("There are " + pretzel.getStock() + " pretzels left in the " + food.getName() + " machine \n");

        //Bob buys 3 Pretzels
        System.out.println("\nBob buys 3 Pretzels");
        pretzel.buySnack(3);
        bob.removeCash(pretzel.priceCheck(3));
        System.out.println("Bob has $" + bob.getCashOnHand() + " left in his wallet");
        System.out.println("There are " + pretzel.getStock() + " pretzels left in the " + food.getName() + " machine \n");

        //Stretch
        System.out.println(chips.toString());
        System.out.println(chocolateBar.toString());
        System.out.println(pretzel.toString());
        System.out.println(soda.toString());
        System.out.println(water.toString());

    }
}
