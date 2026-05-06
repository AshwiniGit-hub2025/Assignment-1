 import java.util.*;
public class Problem1 {  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        
        int n = s.length();
        String t = s + s; // for cyclic
        
        HashSet<Character> set = new HashSet<>();
        
        int i = 0, j = 0;
        int currSum = 0, maxSum = 0;
        
        while (j < 2 * n) {
            
            // remove until no duplicate or window size <= n
            while (set.contains(t.charAt(j)) || (j - i + 1 > n)) {
                char ch = t.charAt(i);
                set.remove(ch);
                currSum -= (ch - 'a' + 1);
                i++;
            }
            
            // add current character
            char ch = t.charAt(j);
            set.add(ch);
            currSum += (ch - 'a' + 1);
            
            maxSum = Math.max(maxSum, currSum);
            j++;
        }
        
        System.out.println(maxSum);
    }
}
