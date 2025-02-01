package Java.BinarySearch;

public class CeilingNum {
    static int  Ceiling(int[] arr,int target){
        int start =0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start +(end-start)/2;
            if (target == arr[mid]){
                return mid;
            } else if (target> arr[mid]) {
                start = mid+1;
            }else if(target<arr[mid]){
                end = mid-1;
            }
        }
        return arr[start];
    }

    public static void main(String[] args) {
        int[] arr ={2,5,7};
        int target = 6;
        int ans = Ceiling(arr,target);
        System.out.println(ans);

    }
}
