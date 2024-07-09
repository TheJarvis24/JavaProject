import java. util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        System.out.println("1 Ruppe (₹)");
        System.out.println("2 Dollar($)");
        System.out.println("3 Euro(€)");

        Scanner sc = new Scanner(System.in);
        System. out.println("Choose the currency");
        int choice = sc.nextInt();
        System.out.println("Enter the amount");
        double amount = sc.nextDouble();

        switch (choice) {
            case 1:
                Ruppe_to_other(amount);
                break;
            case 2:
                Dollar_to_other(amount);
                break;
            case 3:
                Euro_to_other(amount);
                break;
            default:
                System.out.println("Invalid choice");
        }

    }

    public static void Ruppe_to_other(double amt) {
        System.out.println("1 (₹)Ruppe = " + 0.012 + " ($)Dollar");
        System.out.println();

        System.out.println(amt+"₹ = " + (amt*0.012) + " $");
        System.out.println();

        System.out.println("1 (₹)Ruppe = " + 0.011 + " Euro(€)");
        System.out.println();
        System.out.println(amt+"₹ = " + (amt*0.011) + " €");
        System.out.println();

    }


    public static void Dollar_to_other(double amt) {
        System.out.println("1 ($)Dollar = " + 83.52 + "(₹)Rupee");
        System.out.println();
        System.out.println(amt+"$ = " + (amt*83.52) + " ₹");
        System.out.println();

        System.out.println("1 ($)Dollar= " + 0.92 + " (€)Euro");
        System.out.println();

        System.out.println(amt+"$ = " + (amt*0.92) + " € ");
    }



    public static void Euro_to_other(double amt){
        System.out.println("1(€)Euro = " + 90.37 + " (₹)Ruppe");
        System.out.println();
        System.out.println(amt+" € = " + (amt*90.37) + " ₹");
        System.out.println();

        System.out.println("1 (€)Euro = " + 1.08 + " ($)Dollar");
        System.out.println();

        System.out.println(amt+" € = " + (amt*1.08) + " $");
    }
}


