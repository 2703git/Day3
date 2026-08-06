import java.util.Scanner;

public class Pr14 {
    public static boolean increase(int n){
        int ones = n%10;
        int tens = (n%100)/10;
        int hundreds = n/100;
        if (hundreds==tens-1 && tens==ones-1){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3-digits number: ");
        int n = scanner.nextInt();
        System.out.println("Result: "+increase(n));
    }
}