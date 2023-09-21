package Sorting;

//Demonstration of Bubble Sort
public class BubbleSort {
    public static void main(String []args){
        int []arr = {3, 60, 35, 2, 45, 320, 5};
        System.out.println("Before Sorting: ");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("After Sorting: ");
        for (int j=0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }
    }

    static void bubbleSort(int []arr){
        int n = arr.length;
        for (int i=0; i<n; i++){
            for (int j=1; j<(n-i); j++){
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
