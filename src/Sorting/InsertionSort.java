package Sorting;

//Time Complexity : O(n)^2
//Optimization over Bubble Sort
public class InsertionSort {
    public static void main(String []args){
        int []arr = {8, 4, 1, 5, 9, 2};
        int n = arr.length;
        System.out.println("Before Insertion Sort: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        insertionSort(arr, n);
        System.out.println();
        System.out.println("After Insertion Sort: ");
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void insertionSort(int []arr, int n){
        for(int i=1; i<n; i++){
            int temp = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
    }
}


