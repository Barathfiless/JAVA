package ARRAYS;
import java.util.*;

public class TwoSum {

    public static int[] solutions(int nums[],int n, int target) {

        for(int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int t = sc.nextInt();

        int b[] = solutions(a,n,t);

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}
