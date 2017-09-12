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

        System.out.println("Main Menu");
        System.out.println("............................................");

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
                            System.out.println(c);

                        }

                        System.out.println();

                        int menuInput;
                        int newmenuInput;
                        int userQuantity;
                        double subTotal = 0;
                        double tax = 0.0;
                        double grandTotal = 0.0;
                        int totalQuantity = 0;
                        String payType = "";

                        System.out.print("Please select a menu item: ");
                        menuInput = scan.nextInt();
                        newmenuInput = menuInput - 1;
                        scan.nextLine();

                        System.out.println(inventoryList.get(newmenuInput));
                        System.out.println();

                        System.out.print("Choose your quantity (1-5): ");
                        userQuantity = scan.nextInt();
                        System.out.println();

                        if (userQuantity < 6) {
                            Product item = inventoryList.get(newmenuInput);
                            cartList.add(item);

                            Product order = new Product();
                            System.out.println("Customer Cart: ");

                            for (Product pr : cartList) {
                                double lineTotal = pr.getPrice() * userQuantity;
                                subTotal += lineTotal;
                                tax = subTotal * 0.06;
                                grandTotal = subTotal + tax;
                                totalQuantity += userQuantity;

                                System.out.println("\n" + pr.getName() + "\t");

                            }
                            System.out.println();
                            System.out.println("Quantity Total: " + totalQuantity);

                            System.out.println("Sub Total: " + "$" + subTotal);
                            System.out.println();

                            System.out.println("Select another item? (y/n) ");
                            userAnswer = scan.next();

                        }
                        if (userAnswer.equalsIgnoreCase("n")) {
                            System.out.println("\n" + "Tax: " + tax + "\n" + "Grand Total: " + "$" + grandTotal);
                        }

                            System.out.print("Choose a payment option (Card, PayPal, Cash): ");
                            payType = scan.next();

                            if (payType.equalsIgnoreCase("Card")){

                                PaymentMethod.creditCard();

                            }
                            if (payType.equalsIgnoreCase("paypal")){

                                PaymentMethod.payPal();
                            }
                            
                            System.out.println();
                            System.out.println("Customer Receipt: ");
                            System.out.println(cartList + "\n"
                                   + "Sub Total: "+ "$"+ subTotal + "\n" + "Grand Total: " + "$" + grandTotal +
                                    "\n" + "Payment Information: " + payType);

                            System.out.println("Thank you for ordering. Enjoy!");
                            System.out.println();
                    }
                    }
                }
            } while (userAnswer.equalsIgnoreCase("y"));


        }
    }
