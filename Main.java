import java.util.Scanner;

/**
 * @author Fırat Yıldırım
 * @since 21.12.2021
 */
public class Main {
    public static void main(String[] args) {
        double amount,taxAmount = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the amount");
        amount = input.nextDouble();

        //counting tax
        if(amount>0 && amount<1000){
            taxAmount = 0.18;
        }else if (amount>100) {
            taxAmount = 0.08;
        }else {
            System.out.println("Invalid number");
        }double totalTax = amount*taxAmount;

        System.out.println("Tax : " + totalTax);
        System.out.println("Total amount : "+(totalTax+amount));

    }
}
