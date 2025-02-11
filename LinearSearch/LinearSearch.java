package Java.LinearSearch;

public class LinearSearch{
    static int Lsearch(int[] arr, int target){
        if (arr.length==0){
            System.out.println("empty array");
        }
        for (int index=0;index<arr.length;index++){
            if (arr[index] == target){
                return index;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {23,45,56,76,87,97,86,2,5};
        int target = 97;
        int ans = Lsearch(arr,target);
        System.out.println(ans);
    }
}