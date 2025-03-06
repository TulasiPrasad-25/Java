package Java.Math;
// amazon question
//video : math for DSA // time line 1hr : 23 mins

public class MagicNum {
    public static void main(String[] args) {
        int num = 6;
        int base = 5;
        int ans =0;
        while ( num > 0){
            int last = num & 1;
            num = num >> 1;
            ans += last * base;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
