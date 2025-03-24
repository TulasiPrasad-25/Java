package Java.Recursion;

public class LinearSearchInRecursion {
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,8,1};
        int target = 8;
        System.out.println(search(arr,target,0));
        System.out.println(Lsearch(arr,target,0));
    }
    static boolean search(int [] arr,int target, int index){
        if (index == arr.length) {
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);
    }
    static int Lsearch(int [] arr, int target , int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }else {
          return Lsearch(arr,target,index + 1);
        }
    }
}
