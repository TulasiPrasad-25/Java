public class SecondLargest {
    static int SecondLargeNum(int[] arr){
        int n =arr.length;
        for(int i = n-2;i>=0;i--){
            if (arr[i] != arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {17, 35, 57, 36, 68, 75};
        System.out.println(SecondLargeNum(arr));
    }
}