package Java.Loops;

import java.util.Scanner;
public class ForLoop {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter number : ");
        int num = in.nextInt();
        for (int i=0;i<=num;i++){
            System.out.println(i);
        }
    }
}