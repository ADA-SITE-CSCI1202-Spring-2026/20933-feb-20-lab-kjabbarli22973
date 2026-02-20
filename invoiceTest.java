import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of invoices: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Invoice[] invoices = new Invoice[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nInvoice " + (i + 1));

            System.out.print("Part number: ");
            String partNumber = scanner.nextLine();

            System.out.print("Description: ");
            String description = scanner.nextLine();

            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();

            System.out.print("Price per item: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // consume newline

            invoices[i] = new Invoice(partNumber, description, quantity, price);
        }

        // Display all invoices
        System.out.println("\n--- Invoice Details ---");
        for (Invoice inv : invoices) {
            inv.display();
        }

        scanner.close();
    }
}