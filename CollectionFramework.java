import java.util.*;

class CollectionFramework {
    public static void stackadd(Stack<Integer> stack, Scanner sc) {
        System.out.println("Enter how many elements you want to add:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter element " + i + ": ");
            int value = sc.nextInt();
            stack.push(value);  //push element into stack
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        while (true) {
            System.out.println("\nEnter choice:\n 1. Push\n 2. Pop\n 3. Peek\n 4. Show\n 5. Exit");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    stackadd(stack, sc);
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        int popped = stack.pop();
                        System.out.println("Popped element: " + popped);
                    } else {
                        System.out.println("Stack is empty. Nothing to pop.");
                    }
                    break;

                case 3:
                    if (!stack.isEmpty()) {
                        System.out.println("Peek element: " + stack.peek());
                    } else {
                        System.out.println("Stack is empty.");
                    }
                    break;

                case 4:
                    System.out.println("Stack elements: " + stack);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;  // exit the program

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
