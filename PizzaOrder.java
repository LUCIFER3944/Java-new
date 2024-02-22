import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your customer name:");
        String Cname = scanner.nextLine();
        
        System.out.println("Enter your customer Address:");
        String address = scanner.nextLine();
        
        System.out.println("Enter your Mobile number:");
        long mobileNumber = scanner.nextLong();

        System.out.println("Choose a pizza: \n 1. Margherita,\n 2. Pepperoni,\n 3. Veggie,\n 4. BBQ Chicken, \n 5. Hawaiian");
        int pizzaChoice = scanner.nextInt();

        System.out.println("Price:");
        int price = scanner.nextInt();
 
        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();

        System.out.println("Enter discount:");
        int discount = scanner.nextInt();

        System.out.println("Tax:");
        double tax = scanner.nextDouble();

        double totalPrice = 0;

        switch (pizzaChoice) {
            case 1:
                System.out.println("You chose Margherita.");
                totalPrice = quantity * price;
                break;
            case 2:
                System.out.println("You chose Pepperoni.");
                totalPrice = quantity * price;
                break;
            case 3:
                System.out.println("You chose Veggie.");
                totalPrice = quantity * price;
                break;
            case 4:
                System.out.println("You chose BBQ Chicken.");
                totalPrice = quantity * price;
                break;
            case 5:
                System.out.println("You chose Hawaiian.");
                totalPrice = quantity * price;
                break;
            default:
                System.out.println("Invalid choice. Please select a valid pizza.");
                return;
        }

        System.out.println("Customer Details:");
        System.out.printf("| %-20s | %-20s | %-15s |\n", "Name", "Address", "Mobile Number");
        System.out.printf("| %-20s | %-20s | %-15s |\n", Cname, address, mobileNumber);

        System.out.println("\nOrder Details:");
        System.out.printf("| %-20s | %-10s | %-10s | %-15s | %-15s |\n", "Pizza", "Quantity", "Price", "Discount", "Total Price");
        System.out.printf("| %-20s | %-10d | %-10d | %-15d | %-15.2f |\n", "Margherita", quantity, price, discount, totalPrice);

        System.out.println("\nTotal:");
        System.out.printf("| %-20s | %-15s | %-15s |\n", "Total Price", "Discount", "Tax");
        System.out.printf("| $%-19.2f | $%-14d | %-14.4f  |\n", totalPrice, discount, tax);

        double netAmount = (totalPrice - discount) + (totalPrice * tax / 100);
        System.out.printf("\nNet Amount: $%.2f\n", netAmount);
    }
}
