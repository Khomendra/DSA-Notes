//Example 1:
//Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , right
//Output: 6 7 1 2 3 4 5
//Explanation: array is rotated to right by 2 position .

package Array.Easy;

import java.util.Arrays;

//Right rotate: Brute force approach
public class Program_6 {
    public static void main(String []args){
        System.out.println("Rotate the array to the right side by D position");
        Program_6 program6 = new Program_6();
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 2;
        program6.rotate(nums, k);
        System.out.println(Arrays.toString(nums));
    }

    public void rotate(int[] nums, int k) {
        int n = nums.length;

        if(n == 0)
            return;
        k = k % n;
        if (k > n)
            return;
        int[] temp = new int[n];

        for (int i = n-k; i < n; i++) {
            temp[i-(n-k)] = nums[i];
        }

        for (int j = n-k-1; j >= 0; j--) {
            nums[j+k] = nums[j];
        }

        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
