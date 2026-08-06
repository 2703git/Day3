import java.util.Scanner;

public class Pr8 {
    public static String three(int n){
        int thousands = n/1000;
        int ones = n%10;
        if (thousands==3 || ones==3){
            return "There is 3";
        }else {
            return "There is NOT 3";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 4-digit number: ");
        int n = scanner.nextInt();
        System.out.println(three(n));
    }
}