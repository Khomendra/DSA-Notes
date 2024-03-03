package Array.Easy;

//Find if an element is present in an array or not
//Input: arr[]= 5 4 3 2 1, num = 5
//Output: 0
//Explanation: 5 is present in the 0th index
public class Program_8 {
    public static void main(String []args){
        int []arr = {1, 2, 3, 4, 5};
        int num = 4;
        int n = arr.length;
        int index = searchElement(arr, n, num);
        System.out.println(""+num+", is present in "+index+"th index");
    }

    public static int searchElement(int []arr, int n, int num){
        for (int i=0; i<n; i++){
            if (arr[i] == num){
                return i;
            }
        }
        return -1;
    }
}
