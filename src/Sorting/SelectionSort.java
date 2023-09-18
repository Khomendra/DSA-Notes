package Sorting;

//Demonstration of Selection Sort
public class SelectionSort {
    public static void main(String []args){
        int []arr =   {9, 14, 3 , 2, 43, 11, 58, 22};

        System.out.println("Array Before Sorting: ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
//        Array Before Sorting:
//        9 14 3 2 43 11 58 22

        System.out.println();

        selectionSort(arr);

        System.out.println("Array After Sorting: ");
        for (int j=0; j< arr.length; j++){
            System.out.print(arr[j]+" ");
        }
//        Array After Sorting:
//        2 3 9 11 14 22 43 58
    }

    static void selectionSort(int []arr){
        int length = arr.length;

        for (int i=0; i<length; i++){
            int min_index = i;
            for (int j=i+1; j<length; j++){
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            int smallestNum = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = smallestNum;
        }

    }
}
