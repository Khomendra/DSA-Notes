import java.util.Arrays;

public class SecondLargestElement {
    public static void main(String [] args){
        System.out.println("Second Largest Element in an Array");
        int []arr = {1, 2, 4, 7, 7, 5};
        int n = arr.length;
//        secLargeBruteForceApproach(arr, n);
//        secLargeBetterApproach(arr, n);

        //Optimal Approach T.C. = O(n)
        int secLargest = secondLargest(arr, n);
        int secSmallest = secondSmallest(arr, n);
        System.out.println("Second Largest: "+secLargest+", Second Smallest: "+secSmallest);
    }

//    static private void secLargeBruteForceApproach(int []arr, int n){
//        //Brute force approach
//        Arrays.sort(arr); // T.C. = O(nlogn)
//        int largest = arr[n-1];
//        int secondLargest = 0;
//        for (int i = n-2; i >= 0 ; i--) {
//            if (arr[i] != largest){
//                secondLargest = arr[i];
//                break;
//            }
//        }
//        System.out.println("Second Largest Element is: "+secondLargest);
//    }

//    private static void secLargeBetterApproach(int []arr, int n){
//        //Better Approach T.C. = O(2n)
//        int largest = arr[0];
//        int secondLargest = -1;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > largest){
//                largest = arr[i];
//            }
//        }
//
//        for (int j = 0; j < arr.length; j++) {
//            if (arr[j] > secondLargest && arr[j] != largest){
//                secondLargest = arr[j];
//            }
//        }
//
//        System.out.println("Largest: "+largest+", Second Largest: "+secondLargest);
//    }

    static int secondLargest(int[] arr, int n){
        int largest = arr[0];
        int sLargest = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > largest){
                sLargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > sLargest) {
                sLargest = arr[i];
            }
        }
        return sLargest;
    }

    static int secondSmallest(int []arr, int n){
        int smallest = arr[0];
        int sSmallest = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest){
                sSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] != smallest && arr[i] < sSmallest) {
                sSmallest = arr[i];
            }
        }
        return sSmallest;
    }
}

//Ans for Leet code
//public class Solution {
//    public static int[] getSecondOrderElements(int n, int []a) {
//        int slargest = secondLargest(a, n);
//        int ssmallest = secondSmallest(a, n);
//        return new int[]{slargest,ssmallest};
//    }
//
//    static int secondLargest(int []a, int n){
//        int largest = a[0];
//        int sLargest = -1;
//        for (int i = 1; i < n; i++) {
//            if (a[i] > largest) {
//                sLargest = largest;
//                largest = a[i];
//            }else if(a[i] < largest && a[i] > sLargest){
//                sLargest = a[i];
//            }
//        }
//        return sLargest;
//    }
//
//    static int secondSmallest(int []a, int n){
//        int smallest = a[0];
//        int sSmallest = Integer.MAX_VALUE;
//        for (int j = 1; j < n; j++) {
//            if (a[j] < smallest) {
//                sSmallest = smallest;
//                smallest = a[j];
//            }else if(a[j] != smallest && a[j] < sSmallest){
//                sSmallest = a[j];
//            }
//        }
//        return sSmallest;
//    }
//}
