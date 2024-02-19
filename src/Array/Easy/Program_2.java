//Input: [1,2,4,7,7,5]
//Output: Second Smallest : 2
//Second Largest : 5
//Explanation: The elements are as follows 1,2,3,5,7,7 and hence second largest of these is 5 and second smallest is 2

package Array.Easy;

import java.lang.reflect.Array;
import java.util.Arrays;

//Brute force
//TC : O(NLog N), SC : O(1)
//public class Program_2 {
//    public static void main(String []args){
//        System.out.println("Second Largest element in an array");
//        int []arr = {1, 2, 4, 7, 7, 5};
//        int n = arr.length;
//        Arrays.sort(arr);
//        int largest = arr[n-1];
//        System.out.println("Largest: "+largest);
//        int secondLargest = 0;
//        for (int i=n-2; i>=0; i--){
//            if (arr[i] != largest){
//                secondLargest = arr[i];
//                break;
//            }
//        }
//        System.out.println("Second Largest: "+secondLargest);
//    }
//}

//Better Solution
//TC : O(2N) , SC: O(1)
//public class Program_2 {
//    public static void main(String []args){
//        System.out.println("Second Largest element in an array");
//        int []arr = {1, 2, 4, 7, 7, 5};
//        int n = arr.length;
//        int largest = arr[0];
//        int secondLargest = -1;
//
//        for (int i=0; i<n; i++){
//            if (arr[i] > largest){
//                largest = arr[i];
//            }
//        }
//        System.out.println("Largest: "+largest);
//
//        for (int j=0; j<n; j++){
//            if (arr[j] > secondLargest && arr[j] != largest){
//                secondLargest = arr[j];
//            }
//        }
//        System.out.println("Second Largest: "+secondLargest);
//    }
//}

//Optimal Solution
//TC : O(N) , SC : O(1)
public class Program_2 {
    public static void main(String []args){
        System.out.println("Second Largest element in an array");
        int []arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
        int largest = arr[0];
        int secondLargest = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println("Largest: "+largest);
        System.out.println("Second Largest: "+secondLargest);
    }
}
