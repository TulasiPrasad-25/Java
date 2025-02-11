package Java.LinearSearch;

public class MinElement {
    static int Min(int[] arr){
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {67,45,2,56,76,87,97,86};
        System.out.println(Min(arr));
    }

}