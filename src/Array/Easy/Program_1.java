//Example 1:
//Input: arr[] = {2,5,1,3,0};
//Output: 5
//Explanation: 5 is the largest element in the array.

package Array.Easy;

import java.util.Arrays;

//Brute force
//TC : O(log N) , SC: O(N)
//public class Program_1 {
//    public static void main(String []args){
//        System.out.println("Largest Element in an array");
//        int []arr = {2, 5, 1, 3, 0};
//        int n = arr.length;
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//    }
//}

//Optimal Solution
//TC : O(N) , O(1)
public class Program_1 {
    public static void main(String []args){
        System.out.println("Largest Element in an array");
        int []arr = {2, 5, 1, 3, 0};
        int n = arr.length;
        int largest = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest){
                largest = arr[i];
                System.out.println("Largest: "+largest);
            }
        }
    }
}
