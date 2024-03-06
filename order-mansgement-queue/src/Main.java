import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueInterface orders = new QueueImpl();

        //infinite loop
        while (true) {
            System.out.println("1.Place Order:");
            System.out.println("2. Deliver Order:");
            System.out.println("3. Total number of orders:");
            System.out.println("4. Next order to be delivered");
            System.out.println("5. Is order empty:");
            System.out.println("6. Exit");
            System.out.println("Enter your choice:");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    scanner.nextLine();
                    //take input - customer information
                    System.out.println("Enter Email:");
                    String email = scanner.nextLine();
                    System.out.println("Enter Name:");
                    String name = scanner.nextLine();
                    System.out.println("Enter Address:");
                    String address = scanner.nextLine();
                    System.out.println("Enter City:");
                    String city = scanner.nextLine();
                    System.out.println("Enter Province:");
                    String province = scanner.nextLine();
                    System.out.println("Enter Country:");
                    String country = scanner.nextLine();
                    System.out.println("Enter Postal Code:");
                    String postalCode = scanner.nextLine();
                    System.out.println("Enter Contact:");
                    String contact = scanner.nextLine();

                    //validation code
                    Customer customer = new Customer(email, name, address, city, province, country, postalCode, contact);
                    customer.displayInfo();
                    System.out.println("Please verify the information, if information is correct then please enter 1");
                    int verifyNumber = scanner.nextInt();
                    if (verifyNumber == 1) {
                        orders.enqueue(customer);
                        System.out.println("Successfully placed order for the customer :" + name);
                    }
                    break;
                case 2:
                    orders.dequeue();
                    break;
                case 3:
                    System.out.println("Total number of orders: " + orders.size());
                    break;
                case 4:
                    orders.peek();
                    break;
                case 5:
                    if (orders.isEmpty()) {
                        System.out.println("There is no order");
                    } else {
                        System.out.println("Order Information is available, you can dispatch order for customer");
                        orders.peek();
                    }
                    break;
                case 6:
                    System.out.println("Thanks fro using our application");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice! Please enter valid choice");
                    break;
            }
        }
    }
}