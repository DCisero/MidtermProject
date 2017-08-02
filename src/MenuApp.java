import java.util.Scanner;
import java.util.ArrayList;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Product> cartList = new ArrayList<Product>();
        Inventory inventory = new Inventory();
        String userAnswer = "y";
        String paymentInput = "";
        String creditCardInput = "";

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
<<<<<<< HEAD
                        double tax = 0.0;
                        double grandTotal = 0.0;
                        int totalQuantity = 0;
                        String payType = "";
=======

>>>>>>> cf660b046d358b5a67fd9f3f5685355bd20a059f

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

                            Product order = new Product();
                            System.out.println("Customer Cart: ");
                            ;
                            for (Product pr : cartList) {
                                double lineTotal = pr.getprice() * userQuantity;
                                subTotal += lineTotal;
<<<<<<< HEAD
                                tax = subTotal * 0.06;
                                grandTotal = subTotal + tax;
                                totalQuantity += userQuantity;

                                System.out.println("\n" + pr.getname() + "\t");
=======
                                System.out.println("\n" + pr.getname() + " x" + userQuantity + "\t" + lineTotal);
>>>>>>> cf660b046d358b5a67fd9f3f5685355bd20a059f

                            }
<<<<<<< HEAD
                            System.out.println();
                            System.out.println("Quantity Total: " + totalQuantity);

                            System.out.println("Sub Total: " + "$" + subTotal);
=======
                            System.out.println(subTotal);

>>>>>>> cf660b046d358b5a67fd9f3f5685355bd20a059f
                            System.out.println();

                            System.out.println("Select another item? (y/n) ");
                            userAnswer = scan.next();
<<<<<<< HEAD

                        }
                        if (userAnswer.equalsIgnoreCase("n")){
                            System.out.println("\n" + "Tax: " + tax + "\n" + "Grand Total: " + "$" + grandTotal);

                            System.out.print("Choose a payment option (Cash, Credit, PayPal): ");
                            payType.equalsIgnoreCase(scan.next());

                            if(payType == "cash") {

                            }
                            if (payType == "credit"){

                            }
                            else{

                            }
                            System.out.println();
                            System.out.println("Customer Receipt: " + "\n" + "Cart Items: " + cartList + "\n"
                                   + "Sub Total: "+ "$"+ subTotal + "\n" + "Grand Total: " + "$" + grandTotal +
                                    "\n" + "Payment Information: " + payType);
                            System.out.println();

                            System.out.println("Thank you for ordering. Enjoy!");
                    }
=======
                            scan.nextLine();
                        }

>>>>>>> cf660b046d358b5a67fd9f3f5685355bd20a059f
                    }
                }
            }
        } while (userAnswer.equalsIgnoreCase("y"));

        System.out.println("What payment method would you like to use? Cash/Card/PayPal: ");
        paymentInput = scan.nextLine();


        if (paymentInput.equalsIgnoreCase("Card")){

            PaymentMethod.creditCard();
        }
        if (paymentInput.equalsIgnoreCase("paypal")){

            PaymentMethod.payPal();
        }






    }
}