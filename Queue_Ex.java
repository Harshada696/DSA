import java.util.*;

public class Queue_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue (Add)");
            System.out.println("2. Dequeue (Remove)");
            System.out.println("3. Peek (Front Element)");
            System.out.println("4. Display Queue");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to add: ");
                    int val = sc.nextInt();
                    queue.add(val); // or queue.offer(val);
                    System.out.println(val + " added to the queue.");
                    break;

                case 2:
                    if (!queue.isEmpty()) {
                        int removed = queue.poll();
                        System.out.println("Removed: " + removed);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 3:
                    if (!queue.isEmpty()) {
                        System.out.println("Front element: " + queue.peek());
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;

                case 4:
                    System.out.println("Queue elements: " + queue);
                    break;

                case 5:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
