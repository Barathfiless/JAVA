package ARRAYS;
import java.util.*;

public class movezerostoRight {

    public static int[] solution (int nums[], int n) {

        int z  = n-1;
        int nz = n-1;

        while(nz >= 0){
            if(nums[nz] != 0){
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                z--;
                nz--;
            }
            else{
                nz--;
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

        int b[] = solution(a,n);

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }
    }
}