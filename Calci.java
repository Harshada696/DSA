import java.util.Scanner;

class Calci {
    static void add(int num1, int num2) {
        System.out.println("Addition: " + (num1 + num2));
    }

    static void sub(int num1, int num2) {
        System.out.println("Subtraction: " + (num1 - num2));
    }

    static void div(int num1, int num2, Scanner sc) {
        while (num2 == 0) {
            System.out.print("Cannot divide by 0. Re-enter Num2: ");
            num2 = sc.nextInt();
        }
        System.out.println("Division: " + (num1 / num2));
    }

    static void mul(int num1, int num2) {
        System.out.println("Multiplication: " + (num1 * num2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEnter choice:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter 0 to exit: ");
            choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("Thank you!");
                break;
            }

            System.out.print("Enter Num1: ");
            int num1 = sc.nextInt();
            System.out.print("Enter Num2: ");
            int num2 = sc.nextInt();

            switch (choice) {
                case 1:
                    add(num1, num2);
                    break;
                case 2:
                    sub(num1, num2);
                    break;
                case 3:
                    mul(num1, num2);
                    break;
                case 4:
                    div(num1, num2, sc);
                    break;
                default:
                    System.out.println("Invalid Choice, Try again.");
            }
            System.out.print("\nPress Enter to continue...");
            sc.nextLine(); // consume leftover newline
            sc.nextLine();

        } while (true);
        
    }
}
