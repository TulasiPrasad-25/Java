import java.util.Scanner;
public class OddEven {
    static int myMeth(int a){
        if (a %2==0){
            System.out.println("even number");
            }
        else {
            System.out.println("odd number");
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number : ");
        int a = in.nextInt();
        System.out.println(myMeth(a));
    }
}
