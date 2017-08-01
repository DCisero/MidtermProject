/**
 * Created by D.Cisero on 7/31/17.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Java Beans & Bakes!");
        System.out.println();

        System.out.println("Menu Options");
        System.out.println("........................");

        Inventory inventory = new Inventory();

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

                    System.out.print("Please select a menu item: ");
                    menuInput = scan.nextInt();

                    if (menuInput == 1) {
                        System.out.println(inventoryList.get(0));
                    }


                }

            }
        }
    }
}