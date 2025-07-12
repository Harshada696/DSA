import java.util.*;

public class Solution {
    public static long calc(int N, int M, List<Integer> A, List<Integer> B) {
        int[] mustInclude = new int[M + 2]; // Tracks which positions must be covered
        for (int i = 0; i < N; i++) {
            mustInclude[A.get(i)]++;
            mustInclude[B.get(i)]++;
        }

        // Convert the sacred pairs into a list of sets for fast checking
        List<List<Integer>> sacredPairs = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            sacredPairs.add(Arrays.asList(A.get(i), B.get(i)));
        }

        long result = 0;
        int left = 1;
        int[] count = new int[M + 2];
        int covered = 0;

        for (int right = 1; right <= M; right++) {
            count[right]++;

            while (left <= right && isValid(left, right, sacredPairs)) {
                result += (M - right + 1); // All substrings from [left...right] to [left...M] are valid
                count[left]--;
                left++;
            }
        }

        return result;
    }

    private static boolean isValid(int l, int r, List<List<Integer>> sacredPairs) {
        for (List<Integer> pair : sacredPairs) {
            int a = pair.get(0);
            int b = pair.get(1);
            if (!(a >= l && a <= r) && !(b >= l && b <= r)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.nextLine().trim());
        int M = Integer.parseInt(scan.nextLine().trim());

        List<Integer> A = new ArrayList<>(N);
        for (int j = 0; j < N; j++)
            A.add(Integer.parseInt(scan.nextLine().trim()));

        List<Integer> B = new ArrayList<>(N);
        for (int j = 0; j < N; j++)
            B.add(Integer.parseInt(scan.nextLine().trim()));

        long result = calc(N, M, A, B);
        System.out.println(result);
    }
}
