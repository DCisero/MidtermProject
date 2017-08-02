import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;
public class PaymentMethod {

    Scanner scan = new Scanner(System.in);

    public static int creditCard() {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please enter credit card number: ");
        double creditcardInput = scan.nextDouble();
        scan.nextLine();


        System.out.print("Please enter CVV: ");
        int cvvNum = scan.nextInt();
        scan.nextLine();


        System.out.println("Credit card number entered: " + (int) creditcardInput + ("\n") + "CVV number entered: " + cvvNum);
        System.out.println("Is the the credit card information correct? Y/N: ");
        String userCreditCardVerification = scan.nextLine();
        scan.nextLine();
        if (userCreditCardVerification.equalsIgnoreCase("y") || userCreditCardVerification.equalsIgnoreCase("Y")) ;
        {

            String totalCreditCardInfo = creditcardInput + cvvNum + userCreditCardVerification;
            System.out.println("Thank you for your payment");

            return (int) creditcardInput;
        }


    }

    public static String payPal() {

        Scanner scan = new Scanner(System.in);
        int somthing = 0;


        do {
            System.out.println("PLease enter your email address associated with your paypal account: ");
            String paypalInput = scan.nextLine();

            System.out.println("Please enter paypal password: ");
            String paypalPassword = scan.nextLine();

            boolean valid = true;

            if (!paypalInput.contains("@") || !paypalInput.endsWith(".com")) {

                valid = false;

                System.out.println("INVALID email address. Please try again or select another payment method.");

            }

            else {

                System.out.println("Payal email and password: VALID");
            }

        } while (somthing == 1) ;
        return null;
    }

}
