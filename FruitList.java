import java.util.Scanner;

public class FruitList {

    // Input Device
    public static Scanner input = new Scanner(System.in);
    public static String STOP = "x";
    public static String EXIT = "q";

    // Lists
    public static UnordenedList<String> fruitList = new UnordenedList<>(); 

    public static void main(String[] args) {
        // Variables
        String choice = "";

        choice = displayMenu();

        // Main
        while (!choice.equals(EXIT)) {

            switch (choice) {
                case "1": // Input
                    inputFruit();
                    break;
                case "2": // Search
                    searchList();
                    break;

                case "3": // Remove
                    removeFruit();
                    break;

                case "4": 
                    fruitList.displayList();
                    break;
                default:
                    System.out.println("Invalid choice!!!");
                    System.out.print("Choice: ");
                    choice = input.nextLine();
                    break;
            }
            // Remove non existant


            // Display Menu
            choice = displayMenu();
        }
    }

    public static void inputFruit() {
        // Variables
        String fruit = "";
        // Main
        while (!fruit.equals(STOP)) {
            System.out.println("Enter (x) to return.");
            System.out.print("Enter fruit: ");
            fruit = input.nextLine();
            if (fruit.equals(STOP)) {
                break;
            }
            // Add
            fruitList.add(fruit);
        }
    }

    public static void searchList() {
        // Variables
        boolean found = false;
        String fruit;
        // Main
        System.out.print("Search for: ");
        fruit = input.nextLine();

        // Search
        found = fruitList.search(fruit);

        System.out.println("Fruit found in list: " + found);
    }

    public static void removeFruit() {
        // Variables
        String fruit;

        // Main
        System.out.print("Remove: ");
        fruit = input.nextLine();
        
        // Remove
        fruitList.remove(fruit);

        // Msg removal
        System.out.println("Removed " + fruit + " from list.");
    }

    public static String displayMenu() {
        // Main
        System.out.println("Choose from the list below or (q) to quit.\n" +
                            "1. Input fruit.\n" +
                            "2. Search for fruit.\n" +
                            "3. Remove fruit.\n" +
                            "4. Display fruits.");
        System.out.print("Choice: ");
        return input.nextLine();
    }

}