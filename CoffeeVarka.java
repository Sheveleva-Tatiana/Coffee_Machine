import java.util.Scanner;

public class CoffeeVarka {
    public static int water;
    public static int milk;
    public static int coffee;
    public static int disCups;
    public static int money;

    CoffeeVarka(int gwater, int gmilk, int gcoffee, int gdisCups, int gmoney) {
        water = gwater;
        milk = gmilk;
        coffee = gcoffee;
        disCups = gdisCups;
        money = gmoney;
    }

    public static void infoMessage() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffee + " g of coffee beans");
        System.out.println(disCups + " disposable cups");
        System.out.println("$" + money + " of money");
    }

    public static void cookDrink(int waterG, int milkG, int coffeeG, int moneyG) {
        if (water > waterG && milk > milkG && coffee > coffeeG && disCups > 0) {
            water -= waterG;
            milk -= milkG;
            coffee -= coffeeG;
            money += moneyG;
            disCups--;
            System.out.println("I have enough resources, making you a coffee!");
        } else {
            if (water < waterG) {
                System.out.println("Sorry, not enough water");
            } else if (milk < milkG) {
                System.out.println("Sorry, not enough milk");
            } else if (coffee < coffeeG) {
                System.out.println("Sorry, not enough coffee");
            } else if (disCups < 1) {
                System.out.println("Sorry, not enough disposable cups");
            }
        }
    }

    public static void buyCoffee() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            int answer = scn.nextInt();
            if (answer == 1) {
                cookDrink(250, 0, 16, 4);
            } else if (answer == 2) {
                cookDrink(350, 75, 20, 7);
            } else if (answer == 3) {
                cookDrink(200, 100, 12, 6);
            }
        }
    }

    public static void fillCoffee() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add:");
        water += scn.nextInt();
        System.out.println("Write how many ml of milk you want to add:");
        milk += scn.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add:");
        coffee += scn.nextInt();
        System.out.println("Write how many disposable cups of coffee you want to add:");
        disCups += scn.nextInt();
    }

    public static void takeMoney() {
        System.out.println("I gave you $" + money);
        money = 0;
    }

    public static void runCmd(String cmd) {
        if (cmd.equals("buy")) {
            buyCoffee();
        } else if (cmd.equals("fill")) {
            fillCoffee();
        } else if (cmd.equals("take")) {
            takeMoney();
        } else if (cmd.equals("remaining")) {
            infoMessage();
        } else if (cmd.equals("exit")) {
            System.exit(0);
        }
    }
}
