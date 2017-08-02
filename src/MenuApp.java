import java.util.Scanner;
import java.util.ArrayList;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> cartList = new ArrayList<Product>();
        Inventory inventory = new Inventory();
        String userAnswer = "y";

        System.out.println("Welcome to Java Beans & Bakes!");
        System.out.println();

        System.out.println("Menu Options");
        System.out.println("........................");

        do {
            ArrayList<Product> inventoryList = inventory.readFile("./Inventory.txt");
            if (inventoryList == null) {
                System.out.println("Issue with file... closing");
                return;
            }
            for (int i = 1; i < inventoryList.size(); i++) {
                if (inventoryList.get(i) instanceof Product) {
                    Product p = (Product) (inventoryList.get(i));
                    {

                        //output this list
                        //enhanced for (foreach) to go through list
                        for (Product c : inventoryList) {
                            //toString does the formatting
                            System.out.println(i + ":" + c);
                            i++;
                        }

                        System.out.println();

                        int menuInput;
                        int newmenuInput;
                        int userQuantity;
                        double subTotal = 0;

                        System.out.print("Please select a menu item: ");
                        menuInput = scan.nextInt();
                        newmenuInput = menuInput - 1;
                        scan.nextLine();

                        System.out.print("Choose your quantity (1-5): ");
                        userQuantity = scan.nextInt();
                        System.out.println();

                        if (userQuantity < 6) {
                            System.out.println(inventoryList.get(newmenuInput));
                            Product item = inventoryList.get(newmenuInput);
                            cartList.add(item);

                            System.out.println();
                            Product order = new Product();
                            for (Product pr : cartList) {

                                subTotal = pr.getPrice() * userQuantity;

                                System.out.println("Customer Cart: " + "\n" + pr.getName() + " x" + userQuantity +
                                        "\n" + "Subtotal: " + subTotal);

                            }

                            System.out.println();

                            System.out.println("Select another item? (y/n) ");
                            userAnswer = scan.next();
                        }

                    }
                }
            }
        }  while (userAnswer.equalsIgnoreCase("y"));
    }
}