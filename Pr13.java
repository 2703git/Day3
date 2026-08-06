import java.util.Scanner;

public class Pr13 {
    public static boolean differ(int a, int b, int c){
        if (a>0 && b>0 && c<=0){
            return true;
        }
        if (a>0 && c>0 && b<=0){
            return true;
        }
        if (c>0 && b>0 && a<=0){
            return true;
        }
        else {
            return false;
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
        System.out.println("Result: "+differ(a,b,c));
    }
}