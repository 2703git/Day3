import java.util.Scanner;

public class Pr1 {
    public static int newNum(int n){
        int ones = n%10;
        int tens = (n%100)/10;
        int hundreds = n/100;
        return tens*100+hundreds*10+ones;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3-digits number: ");
        int n = scanner.nextInt();
        System.out.println("New number: "+newNum(n));
    }
}