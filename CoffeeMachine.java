import java.util.Scanner;

public class CoffeeMachine {


    public static void main(String[] args) {
        CoffeeVarka coffeeVarka = new CoffeeVarka(400, 540, 120, 9, 550);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            CoffeeVarka.runCmd(scanner.next());
            System.out.println();
        }
    }
}
