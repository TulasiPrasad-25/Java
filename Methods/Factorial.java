import java.util.Scanner;
public class Factorial {
    static int Factorial(int num){
        int number = 1;
        for (int i=1;i<=num;i++){
            number *=i;
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter number : ");
        int num = in.nextInt();
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = Factorial(num);
            System.out.println("The factorial of " + num + " is: " + result);
        }

        in.close();
    }
}
