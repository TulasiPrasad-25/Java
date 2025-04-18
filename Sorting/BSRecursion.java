package Java.Sorting;

import java.util.Arrays;

public class BSRecursion {
    public static void main(String[] args) {
        int arr[] = {4,3,2,1};
        BubbleSort(arr,arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }
    static void BubbleSort(int[] arr , int row, int col){
        if(row ==0){
            return;
        }
        if(col < row){
            if(arr[col] > arr[col+1]){
                int temp = arr[col];
                arr[col] = arr[col +1];
                arr[col +1] = temp;
            }
                 BubbleSort(arr,row,col +1);
            }else{
            BubbleSort(arr,row -1,0);
        }
    }
}
