import java.util.*;

public class Solution {
    public static int getMinimumCost(int N, List<Integer> A) {
        int cost = 0;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                // Keep incrementing A[j] while it's divisible by A[i]
                while (A.get(j) % A.get(i) == 0) {
                    A.set(j, A.get(j) + 1);
                    cost++;
                }
            }
        }

        return cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // First read the number of elements
        int N = sc.nextInt();

        // Read the list of integers
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            A.add(sc.nextInt());
        }

        // Call and print the result
        int result = getMinimumCost(N, A);
        System.out.println(result);
    }
}
