import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CurrencyService service = new CurrencyService();

        int choice;

        do {

            System.out.println("\n====================================");
            System.out.println("      CURRENCY CONVERTER");
            System.out.println("====================================");
            System.out.println("1. Display Available Currencies");
            System.out.println("2. Convert Currency");
            System.out.println("3. View Exchange Rate");
            System.out.println("4. Undo Last Rate View");
            System.out.println("5. Show Rate History");
            System.out.println("6. Exit");

            System.out.print("\nEnter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    service.displayCurrencies();
                    break;

                case 2:

                    System.out.print("Enter Source Currency: ");
                    String from = scanner.next();

                    System.out.print("Enter Target Currency: ");
                    String to = scanner.next();

                    System.out.print("Enter Amount: ");
                    double amount = scanner.nextDouble();

                    service.convertCurrency(from, to, amount);
                    break;

                case 3:

                    System.out.print("Enter Source Currency: ");
                    String source = scanner.next();

                    System.out.print("Enter Target Currency: ");
                    String target = scanner.next();

                    service.viewRate(source, target);
                    break;

                case 4:

                    service.undoLastRate();
                    break;

                case 5:

                    service.showRateHistory();
                    break;

                case 6:

                    System.out.println("\nThank you for using Currency Converter!");
                    break;

                default:

                    System.out.println("\nInvalid choice! Please try again.");
            }

        } while (choice != 6);

        scanner.close();
    }
}