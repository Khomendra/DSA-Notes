//Input: arr[1,1,2,2,2,3,3]
//
//Output: arr[1,2,3,_,_,_,_]

package Array.Easy;

import java.util.HashSet;

//Brute force
public class Program_4 {
    public static void main(String []args){
        System.out.println("Remove duplicates in place from the sorted array");
        int []arr = {1, 1, 2, 2, 2, 2, 3, 3, 3};
        int k = removeDuplicates(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int []arr){
        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for (int i=0; i<n; i++){
            set.add(arr[i]);
        }
        System.out.println("Set: "+set);
        int setLength = set.size();
        int j = 0;
        for (int x : set){
            arr[j++] = x;
        }
        return setLength;
    }
}


