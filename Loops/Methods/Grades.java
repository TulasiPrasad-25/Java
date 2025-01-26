import java.util.Scanner;
public class Grades {
    static void grades(int marks){
        if (marks >= 90 && marks<=100){
            System.out.println("grade is AA");
        } else if (marks>=80 && marks<=90) {
            System.out.println("Grade is AB");
        } else if (marks<=40) {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks : ");
        int marks = in.nextInt();
        grades(marks);
    }
}
