package Java.Math;
//using RECURSION
public class GCD {
    public static void main(String[] args) {
        System.out.println(Gcd(4,9));
    }
    static int Gcd(int a , int b){
        if (a ==0){
            return b;
        }
        return Gcd( b%a , a);
    }
}
