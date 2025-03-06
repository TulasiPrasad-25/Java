package Java.Math;

public class IsPrime {
    public static void main(String[] args) {
        int n = 20;
        for (int i =1; i <=n; i++) {
            System.out.println(i + " " + Prime(i));
        }
    }
    static boolean Prime(int n){
        if (n <= 1){
            return false;
        }
        int c = 2;
        while( c * c <=n){
            if (n %c ==0) {
                return false;
            }
            c++;
        }
        return true;
    }

}

