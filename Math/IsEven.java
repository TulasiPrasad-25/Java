package Java.Math;

public class IsEven {
    public static void main(String[] args) {
        int num = 33;
        System.out.println(IsOdd(num));
    }
    public static boolean IsOdd(int num){
        return ((num & 1) ==1);
    }
}
