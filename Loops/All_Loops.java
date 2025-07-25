package Java.Loops;
import java.util.Scanner;

public class All_Loops {
    public static void main(String[] args) {
        int salary = 10001;
        if (salary > 10000) {
            System.out.println(salary = salary + 2000);
        } else if (salary >= 10000) {
            salary = salary + 1000;

        } else {
            salary = 0;
        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for ( n = 0; n < 10; n++) {
            System.out.println(n);
        }

        int i =1;
        while(i <=10){
            System.out.println(i);
            i++;
        }



    }
}


