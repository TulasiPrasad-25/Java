package Java.BinarySearch;

public class CeilingLetter {
    static char SmallestLetter(char[] str,char target){
        int start =0;
        int end = str.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if (target>str[mid]) {
                start = mid+1;
            } else if (target<str[mid]) {
                end = mid-1;
            }
        }
        return str[start];
    }

    public static void main(String[] args) {
        char[] str = {'a','d','f'};
        char target = 'e';
        char result = SmallestLetter(str,target);
        System.out.println(result);
    }
}
