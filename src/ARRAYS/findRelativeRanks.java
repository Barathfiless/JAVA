package ARRAYS;
import java.util.*;

public class findRelativeRanks {

    public static String[] Solution(int[] nums) {
        int n = nums.length;

        int[] c = nums.clone();
        Arrays.sort(c);

        // Reverse array for descending order
        for (int i = 0; i < n / 2; i++) {
            int temp = c[i];
            c[i] = c[n - 1 - i];
            c[n - 1 - i] = temp;
        }

        String[] res = new String[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[i] == c[j]) {
                    if (j == 0)
                        res[i] = "Gold Medal";
                    else if (j == 1)
                        res[i] = "Silver Medal";
                    else if (j == 2)
                        res[i] = "Bronze Medal";
                    else
                        res[i] = String.valueOf(j + 1);
                    break;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        String[] b = Solution(a);

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
