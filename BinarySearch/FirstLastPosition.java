package Java.BinarySearch;

public class FirstLastPosition {
    public static void main(String[] args) {
        int[] nums ={1,2,3,3,3,3,4,5,6};
        int taregt = 4;
        int[] ans = search(nums,taregt,false);
        System.out.println(ans);

    }
    public static int[] searchRange(int[] nums,int target){
        int[] ans={-1,-1};
       int[] start = search(nums,target,true);
        if (ans[0] !=-1){
            int[] end = search(nums,target,false);
        }
         return ans;

    }
    static int[]  search(int[] nums,int target,boolean startindex){
        int ans =-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (target < nums[mid]){
                end = mid-1;
            } else if (target>nums[mid]) {
                start = mid+1;
            }else {
                ans = mid;
                if (startindex){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return nums;
    }
}
