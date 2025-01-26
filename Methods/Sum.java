import java.util.Scanner;
public class Sum {
    static int sum(int a,int b){
        System.out.println(a+b);
        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int a = in.nextInt();
        int b = in.nextInt();
        sum(a,b);
    }
}
