package Java.Sorting;

import java.util.Arrays;

public class BubbleSort {
    static int[] Sort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for(int j =1; j <= arr.length -i -1;j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,5,6};
        System.out.println(Arrays.toString(Sort(arr)));
    }
}
