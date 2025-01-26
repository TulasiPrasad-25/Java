package Java.Loops;

import java.util.Scanner;
public class WhileLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = in.nextInt();
        int i=0;
        while(i<=num){
            System.out.println(i);
            i++;
        }
    }

    public static class DoWhile {
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
}
