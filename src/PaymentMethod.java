import java.math.BigDecimal;
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

            if (userCreditCardVerification.equalsIgnoreCase("y") || userCreditCardVerification.equalsIgnoreCase("Y")) {
                String totalCreditCardInfo = creditcardInput + cvvNum + userCreditCardVerification;
                System.out.println("Thank you for your payment.");
            }

        } while (userCreditCardVerification.equalsIgnoreCase("n"));

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
//    public Double calculateChange(double cash, BigDecimal totalBill) {
//
//        changeDue = 0;
//
//        Double cashAmount = Double.valueOf(cash);
//
//        if (cashAmount.compareTo(totalBill) == 1 || cashAmount.compareTo(totalBill) == 0)
//            changeDue = totalBill.subtract();
//
//        return changeDue;
//
//    }
//
//    public boolean validCashForChange(double cash, BigDecimal totalBill) {
//
//        BigDecimal cashAmount = BigDecimal.valueOf(cash);
//
//        boolean valid;
//
//        if (cashAmount.compareTo(totalBill) == 1 || cashAmount.compareTo(totalBill) == 0) {
//
//            valid = false;
//
//        }
//
//        else {
//
//            System.out.println("That is not enough cash, please add more money or try different pay method.");
//
//            valid = true;
//
//        }
//
//        return valid;
//
//    }


}
