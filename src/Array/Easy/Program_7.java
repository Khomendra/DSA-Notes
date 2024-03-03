//Input: 1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
//Output: 1 ,2 ,3 ,4 ,1 ,0 ,0 ,0

package Array.Easy;

import java.util.ArrayList;
import java.util.Arrays;

//Brute force
//TC : O(N) + O(X) + O(N - X) == O(2N)
//SC : O(X) , x == number of non zero numbers, O(N) = worst case
//public class Program_7 {
//    public static void main(String []args){
//        System.out.println("Move all zeros to the end");
//        int []arr = {1, 0, 2, 3, 0, 4, 0, 1};
//        int n = arr.length;
//        int []ans = shiftZerosToTheEnd(arr, n);
//        for (int i = 0; i < n; i++) {
//            System.out.print(ans[i]+" ");
//        }
//        System.out.println("");
//    }
//
//    public static int[] shiftZerosToTheEnd(int []arr, int n){
//        ArrayList<Integer> temp = new ArrayList<>();
//        for (int i=0; i<n; i++){  //O(N)
//            if (arr[i] != 0){
//                temp.add(arr[i]);
//            }
//        }
//
//        int nz = temp.size(); //x
//
//        for (int i=0; i<nz; i++){ //O(X)
//            arr[i] = temp.get(i);
//        }
//
//        for (int i=nz; i<n; i++){ //O(N-X)
//            arr[i] = 0;
//        }
//        return arr;
//    }
//}

//Optimal Solution
//2 pointer approach
//TC : O(X) + O(N-X) = O(N)
//SC : O(1)
public class Program_7 {
    public static void main(String []args){
        System.out.println("Move all zeros to the end");
        int []arr = {1, 0, 2, 3, 0, 4, 0, 1};
        int n = arr.length;
        int []ans = shiftZerosToTheEnd(arr, n);
        for (int i = 0; i < n; i++) {
            System.out.print(ans[i]+" ");
        }
        System.out.println("");
    }

    public static int[] shiftZerosToTheEnd(int []arr, int n){
        int j = -1;

        for (int i=0; i<n; i++){
            if (arr[i] == 0){  //O(X)
                j = i;
                break;
            }
        }

        if (j == -1) return arr;

        for (int i=j+1; i<n; i++){
            if (arr[i] != 0){ //O(N-x)
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        return arr;
    }
}


