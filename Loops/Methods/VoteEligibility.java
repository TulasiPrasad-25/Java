import java.util.Scanner;
public class VoteEligibility {
    static int Eligibility(int age){
        if (age<18){
            System.out.println("You are not Eligible for voting !!");
        } else if (age>=18) {
            System.out.println("YES...You are eligible");
        }else {
            System.out.println("enter valid age");
        }
        return age;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter age here : ");
        int age = in.nextInt();
        int result = Eligibility(age);
        System.out.println(result);
    }
}
