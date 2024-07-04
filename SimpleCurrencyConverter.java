import java.util.Scanner;

public class SimpleCurrencyConverter {

  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);


    double usdToEurRate = 0.92; // This is not a real-time rate,for demonstration only.
    double eurToUsdRate = 1.09; //  for demonstration only.

    System.out.println("Welcome to the Simple Currency Converter!");

    while (true) {
      System.out.println("\n1. Convert USD to EUR");
      System.out.println("2. Convert EUR to USD");
      System.out.println("3. Exit");

      System.out.print("Enter your choice (1, 2, or 3): ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          convertUSDToEUR(scanner, usdToEurRate);
          break;
        case 2:
          convertEURToUSD(scanner, eurToUsdRate);
          break;
        case 3:
          System.out.println("Thank you for using the converter!");
          System.exit(0);
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }

  public static void convertUSDToEUR(Scanner scanner, double rate) {
    System.out.print("Enter amount in USD: ");
    double amount = scanner.nextDouble();

    double convertedAmount = amount * rate;
    System.out.printf("%.2f USD is equal to %.2f EUR.\n", amount, convertedAmount);
  }

  public static void convertEURToUSD(Scanner scanner, double rate) {
    System.out.print("Enter amount in EUR: ");
    double amount = scanner.nextDouble();

    double convertedAmount = amount * rate;
    System.out.printf("%.2f EUR is equal to %.2f USD.\n", amount, convertedAmount);
  }
}
