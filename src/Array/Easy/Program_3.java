//Input: N = 5, array[] = {1,2,3,4,5}
//Output: True.

package Array.Easy;

//Brute force Approach
//TC : O(N) , SC : O(1)
public class Program_3 {
    public static void main(String []args){
        System.out.println("Check if Array is Sorted or not");
        int []arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        System.out.println("Result: "+isSorted(arr, n));
    }

    public static boolean isSorted(int []arr, int n){
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
