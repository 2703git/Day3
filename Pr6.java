import java.util.Scanner;

public class Pr6 {
    public static void differentNumber(int a, int b, int c) {
        if (a == b && b == c) {
            System.out.println("=");
        } else if (a == b) {
            System.out.println(c);
        } else if (a == c) {
            System.out.println(b);
        } else if (b == c) {
            System.out.println(a);
        } else {
            System.out.println(a + " " + b + " " + c);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        System.out.print("Result: ");
        differentNumber(a,b,c);
    }
}