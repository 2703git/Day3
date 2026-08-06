import java.util.Scanner;

public class Pr5 {
    public static String ball(int n){
        if (n>=0 && n<=54){
            return "Grade 2";
        } else if (n>=55 && n<=70) {
            return "Grade 3";
        } else if (n>=71 && n<=84) {
            return "Grade 4";
        } else if (n>=85 && n<=100) {
            return "Grade 5";
        }else {
            return "Not in range!";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter grade: ");
        int n = scanner.nextInt();
        System.out.println(ball(n));
    }
}