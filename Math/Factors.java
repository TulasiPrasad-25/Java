package Java.Math;

public class Factors {
    public static void main(String[] args) {
        Factor(20);
    }
    static void Factor(int n){
        for (int i = 1; i <=n ; i++) {
            if (n % i ==0){
                System.out.print(i + " ");
            }
        }
    }
}
