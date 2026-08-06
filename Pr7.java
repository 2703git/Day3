import java.util.Scanner;

public class Pr7 {
    public static int sum(int a, int b){
        int sum = a+b;
        if (sum<10 || sum>19){
            return sum;
        } else {
            return 20;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = scanner.nextInt();
        System.out.print("Enter b: ");
        int b = scanner.nextInt();
        System.out.println("Sum: "+sum(a,b));
    }
}