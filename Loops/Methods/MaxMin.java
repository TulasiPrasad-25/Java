import java.util.Scanner;
public class MaxMin {

    static int myMeth(int a,int b,int c) {
        if (a > b) {
            System.out.println(a+"a id greater");
        } else if (b > c) {
            System.out.println(b +"b is greater");
        } else if (c > a) {
            System.out.println(c +"c is greater");
        } else return 0;
        return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int result = myMeth(a,b,c);
        System.out.println(result);

    }
}