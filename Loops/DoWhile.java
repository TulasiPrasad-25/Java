import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = in.nextInt();
        int i=0;
        do{
            System.out.println(i);
            i++;
        }
        while (i<=num);{
        }
    }
}
