import java.util.Scanner;

public class Pr10 {
    public static int differ(int n){
        if (n>0){
            return n+1;
        } else if (n<0) {
            return Math.abs(n)+2;
        }else {
            return n/100;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        System.out.println("Result: "+differ(n));
    }
}