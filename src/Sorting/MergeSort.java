package Sorting;

//Work under divide and conquer method. Divide a problem into sub-problem
//get mid value eg. n = 7
//          m = n/2 = 3 ([0, 1, 2, 3][4, 5, 6])
//          part-1 = [0, 1, 2, 3], part-2 = [4, 5, 6]
//due to divide by two, Time Complexity ==> n/2^k = 1
//          ==> k = log n base 2
//          TC = O(nlogn)
public class MergeSort {
    public static void main(String []args){
        int []arr = {9, 4, 7, 6, 3, 1, 5};
        int n = arr.length;
        System.out.println("Before Merge Sort: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        mergeSort(arr, 0, n-1);
        System.out.println("After Merge Sort: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergeSort(int []arr, int l, int r){
        if (l<r){
            int mid = (l + r)/2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid+1, r);
            merge(arr, l, mid, r);
        }
    }

    public static void merge(int []arr, int l, int mid, int r){
        int i = l;
        int j = mid + 1;
        int k = l;
        int []finalArr = new int[arr.length];
        while (i<=mid && j<=r){
            if (arr[i] < arr[j]){
                finalArr[k] = arr[i];
                i++;
            }else {
                finalArr[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements from the left subarray
        while (i <= mid){
            finalArr[k] = arr[i];
            i++;
            k++;
        }

        // Copy the remaining elements from the right subarray
        while (j <= r) {
            finalArr[k] = arr[j];
            j++;
            k++;
        }

        for (k=l; k<=r; k++){
            arr[k] = finalArr[k];
        }
    }
}
