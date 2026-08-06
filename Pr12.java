import java.util.Scanner;

public class Pr12 {
    public static boolean differ(int a, int b){
        if (a>2 && b<3){
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
        System.out.println("Result: "+differ(a,b));
    }
}