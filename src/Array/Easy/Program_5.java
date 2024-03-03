//Example 1:
//Input: N = 7, array[] = {1,2,3,4,5,6,7} , k=2 , left
//Output: 3, 4, 5, 6, 7, 1, 2
//Explanation: array is rotated to left by 2 position .

package Array.Easy;

////Left side : Brute force approach
//public class Program_5 {
//    public static void main(String []args){
//        //TC : O(d) + O(n-d) + O(d)
//        //SC : O(d)
//        System.out.println("Left rotate an array by D place");
//        int arr[] = {1, 2, 3, 4, 5, 6, 7};
//        int n = arr.length;
//        int d = 2;
//        leftRotate(arr, n, d);
//        for (int i=0; i<n; i++){
//            System.out.print(arr[i]+" ");
//        }
//    }
//
//    public static void leftRotate(int []arr, int n, int d){
//         if (n == 0)
//         return;
//         d = d % n;
//         if (d > n)
//         return;
//        int tempArr[] = new int[n-d];
//
//        for (int i = 0; i < d; i++) {
//            tempArr[i] = arr[i]; //{1, 2}
//        }
//
//        for (int j = d; j < n; j++) {
//            arr[j-d] = arr[j]; //{3, 4, 5, 6, 7}
//        }
//
//        for (int k = n - d; k < n; k++) {
//            arr[k] = tempArr[k - (n-d)];
//        }
//    }
//}


//Left side : Optimal solution
public class Program_5 {
    public static void main(String []args){
        //TC : O(2n)
        //SC : O(1)
        System.out.println("Left rotate an array by D place");
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int n = arr.length;
        int d = 2;
        leftRotate(arr, n, d);
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void leftRotate(int []arr, int n, int d){
        reverse(arr, 0, d-1); //O(d)
        reverse(arr, d, n-1); //O(n-d)
        reverse(arr, 0, n-1); //O(n)
    }

    public static void reverse(int arr[], int start, int end){
        while (start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
