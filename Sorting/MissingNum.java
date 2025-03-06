package Java.Sorting;

import java.util.Arrays;

// cyclic sort
public class MissingNum {
    static int Sort(int[] arr){
        int i =0;
        while(i<arr.length){
            int correct = arr[i]-1;
            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }
    static void swap(int[] arr,int first,int sec){
        int temp = arr[first];
        arr[first] = arr[sec];
        arr[sec] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,2,1};
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
