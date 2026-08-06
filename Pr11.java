import java.util.Scanner;

public class Pr11 {
    public static boolean differ(int a, int b, int c){
        if (a>=b+10 || a>=c+10 || b>=a+10 || b>=c+10 || c>=a+10 || c>=b+10){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.print("Enter c: ");
        int c = scanner.nextInt();
        System.out.println("Result: "+differ(a,b,c));
    }
}