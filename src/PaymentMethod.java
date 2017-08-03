import java.util.Scanner;

public class PaymentMethod {

    Scanner scan = new Scanner(System.in);

    public static int creditCard() {
        Scanner scan = new Scanner(System.in);

        String userCreditCardVerification = "";
        double creditcardInput;
        int cvvNum;
        do {
            System.out.print("Please enter credit card number: ");
            creditcardInput = scan.nextDouble();
            scan.nextLine();

            System.out.print("Please enter CVV: ");
            cvvNum = scan.nextInt();
            scan.nextLine();

            System.out.println("Credit card number entered: " + (int) creditcardInput + ("\n") + "CVV number entered: " + cvvNum);
            System.out.print("Is the the credit card information correct? Y/N: ");
            userCreditCardVerification = scan.nextLine();

            if(userCreditCardVerification.equalsIgnoreCase("n")) {
                System.out.println("Error with validation, please try again.");
                break;
            }

        } while (userCreditCardVerification.equalsIgnoreCase("y") || userCreditCardVerification.equalsIgnoreCase("Y"));
            String totalCreditCardInfo = creditcardInput + cvvNum + userCreditCardVerification;
            //System.out.println("Thank you for your payment.");

            return (int) creditcardInput;
        }





    public static String payPal() {

        Scanner scan = new Scanner(System.in);
        int somthing = 0;


        do {
            System.out.println("PLease enter your email address associated with your paypal account: ");
            String paypalInput = scan.nextLine();

            System.out.println("Please enter PayPal password: ");
            String paypalPassword = scan.nextLine();

            boolean valid = true;

            if (!paypalInput.contains("@") || !paypalInput.endsWith(".com")) {

                valid = false;

                System.out.println("INVALID email address. Please try again or select another payment method.");

            }

            else {

                System.out.println("PayPal email and password: VALID");
            }

        } while (somthing == 1) ;
        return null;
    }

}
