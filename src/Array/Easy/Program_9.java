package Array.Easy;

//Finding the Union of two sorted array
//Input: firstArr = {1, 1, 2, 3, 4, 5};
//secondArr = {2, 3, 4, 4, 5, 6};
//output: {1, 2, 3, 4, 5, 6}

//Brute force
//TC : O(N1 logN) + O(N2 logN)
//SC : O(N1 + N2) + O(N1 + N2)

//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Set;
//
//public class Program_9 {
//    public static void main(String []args){
//        int []firstArr = {1, 1, 2, 3, 4, 5};
//        int []secondArr = {2, 3, 4, 4, 5, 6};
//        ArrayList<Integer> unionOfArr = unionOperation(firstArr, secondArr);
//        for (int val : unionOfArr){
//            System.out.print(val+" ");
//        }
//    }
//
//    public static ArrayList<Integer> unionOperation(int []firstArr, int []secondArr){
//
//        int lengthOfFirstArray = firstArr.length;
//        int lenthOfSecondArray = secondArr.length;
//
//        Set<Integer> set = new HashSet<>();
//        ArrayList<Integer> union = new ArrayList<>();
//
//        for (int i=0; i<lengthOfFirstArray ;i++){
//            set.add(firstArr[i]); //O(N1 logN)
//        }
//
//        for (int j=0; j<lenthOfSecondArray; j++){
//            set.add(secondArr[j]); //O(N2 logN)
//        }
//
//        for (int element : set){
//            union.add(element);
//        }
//
//        return union;
//    }
//}


//Optimal Approach
//
//
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Program_9 {
    public static void main(String []args){
        int []firstArr = {1, 1, 2, 3, 4, 5};
        int []secondArr = {2, 3, 4, 4, 5, 6};
        ArrayList<Integer> unionOfArr = unionOperation(firstArr, secondArr);
        for (int val : unionOfArr){
            System.out.print(val+" ");
        }
    }

    public static ArrayList<Integer> unionOperation(int []firstArr, int []secondArr){

        int lengthOfFirstArray = firstArr.length;
        int lenthOfSecondArray = secondArr.length;

        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> union = new ArrayList<>();

        for (int i=0; i<lengthOfFirstArray ;i++){
            set.add(firstArr[i]); //O(N1 logN)
        }

        for (int j=0; j<lenthOfSecondArray; j++){
            set.add(secondArr[j]); //O(N2 logN)
        }

        for (int element : set){
            union.add(element);
        }

        return union;
    }
}
