package ARRAYS;
import java.util.*;

public class movezerostoLeft {
    public static int[] solution(int nums[], int n) {

        int z = 0;
        int nz = 0;

        while (nz < n) {
            if (nums[nz] != 0) {
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;

                nz++;
                z++;
            } else {
                nz++;
            }
        }
        return nums;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a[] = new int[n];

        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        int[] arr1 = solution(a, n);

        for(int i=0;i<n;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
