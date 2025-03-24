package Java.Recursion;

public class SumOfIndDig {
    public static void main(String[] args) {
        System.out.println(Sum(123));
    }
    static int Sum(int n){
        if (n==0){
            return 0;
        }
        int ans = Sum(n /10) +(n%10);
        return ans;
    }
}
