package Java.BinarySearch;

public class BinarySearch {
    static int Search(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
            int mid = start + (end-start)/2;
            if (target == arr[mid] ){
                return mid;
            }
            if (target< arr[mid]){
                end = mid-1;
            } else  {
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 24, 45, 67};
        int target = 45;
        int ans = Search(arr, target);
        System.out.println(ans);
    }
}
