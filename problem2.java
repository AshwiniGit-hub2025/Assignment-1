 import java.util.*;
public class Problem2 {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }

        int K = sc.nextInt();

        // Step 1: Check if possible
        for (int i = 1; i < n; i++) {
            if ((A[i] - A[0]) % K != 0) {
                System.out.println(-1);
                return;
            }
        }

        // Step 2: Sort array
        Arrays.sort(A);

        // Step 3: Take median
        int median = A[n / 2];

        // Step 4: Count operations
        int operations = 0;
        for (int i = 0; i < n; i++) {
            operations += Math.abs(A[i] - median) / K;
        }

        System.out.println(operations);
    }
    
}
