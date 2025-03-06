package Java.Math;

public class LCM {
    public static void main(String[] args) {
        System.out.println(Lcm(4,9));
    }
    static int Gcd(int a , int b){
        if (a ==0){
            return b;
        }
        return Gcd( b%a , a);
    }
    static int Lcm (int a, int b){
        return a * b /(Gcd(a,b));
    }
}
