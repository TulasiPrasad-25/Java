package Java.Recursion;

public class FactorialRec {
    public static void main(String[] args) {
        Factorial(5);
    }
    static int Factorial(int n){
        if (n ==1){
            return 1;
        }
        int ans = n * Factorial(n-1);
        System.out.println(ans);
        return ans;
    }
}
